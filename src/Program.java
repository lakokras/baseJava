public class Program{

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Катя", 30, "1", 35000);
        account.displayAccountBalance();
        account.deposit(5000);
        account.displayAccountBalance();
        account.withdraw(1000);
        account.displayAccountBalance();
    }
}
