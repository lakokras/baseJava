public class BankAccount {

    private final String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.printf("Ваш текущий баланс: %.2f \n", balance);
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма пополнения не может быть отрицательным числом");
        } this.balance += amount;
        System.out.printf("Начислена сумма: %.2f | Текущий баланс: %.2f \n", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Сумма снятия не может превышать текущий баланс");
        } this.balance -= amount;
        System.out.printf("Списана сумма: %.2f | Текущий баланс: %.2f \n", amount, balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}