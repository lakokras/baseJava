public class Program{

    public static void main(String[] args) {

        Human person1 = new Human("Oleg");

        BankAccount account1 = new BankAccount(1, 5000, person1.getName());
        account1.displayBalance();
        account1.deposit(5000);
        account1.displayBalance();

        /* обработка ошибки
        account1.withdraw(25000);
        account1.displayBalance();
         */

        SavingsAccount savings = new SavingsAccount(account1.getAccountNumber(), account1.getBalance(),
                person1.getName(), 0.05);
        savings.applyInterest();
        savings.displayBalance();

    }
}