
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Please Select your bank\n"+"1. SBI\n"+"2.HDFC");
       // int c=sc.nextInt();
      //  sc.next();
        System.out.println("Enter name,balance,pwd");
        String name=sc.nextLine();
        double balance=sc.nextDouble();
        sc.next();
        String pwd=sc.nextLine();
//        if(c==1) {
           SBI user= new SBI(name, pwd, balance);
//        }
//       else {
//           HDFC user = new HDFC(name,pwd,balance);
//       }
        System.out.println(user.checkBalance());
        System.out.println(user.addMoney(100000));
        System.out.println("please amount to withdraw and password");
        int amt=sc.nextInt();
        sc.next();
        String pwd1=sc.nextLine();
        System.out.println(user.withDraw(amt,pwd1));
        System.out.println(user.calInterest(12));



    }
}