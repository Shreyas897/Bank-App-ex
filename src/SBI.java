import java.util.Objects;
import java.util.UUID;

public class SBI implements Bank_Interface{

    private String name,Acc_no,pwd;
    private double balance;
    private static double roi;

    public SBI(String name, String pwd, double balance) {
        this.name = name;
        this.pwd = pwd;
        this.balance = balance;
        this.roi=6.5;

        this.Acc_no= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc_no() {
        return Acc_no;
    }

    public void setAcc_no(String acc_no) {
        Acc_no = acc_no;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRoi() {
        return roi;
    }

    public static void setRoi(double roi) {
        SBI.roi = roi;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance+=amount;
        return "new Balance "+balance;
    }

    @Override
    public String withDraw(int amt, String pwd1) {
        if(Objects.equals(pwd,pwd1))
        {
            if(balance<amt)
            {
                return "Insufficient Balance";
            }
            else {
                balance-=amt;
                return "Collect the cash";
            }
        }
        return "Wrong Password";
    }

    @Override
    public double calInterest(int year) {
        return (year*balance*roi)/100 ;
    }
}
