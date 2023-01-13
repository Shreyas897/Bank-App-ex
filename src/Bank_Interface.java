public interface Bank_Interface {
    double checkBalance();

    String addMoney(int amount);

    String withDraw(int amt,String pwd);

    double calInterest(int year);
}
