public class BankAccount extends Human {

    private final String accountNumber;
    private double balance;


    public BankAccount(String name, int age, String accountNumber, double balance) {
        super(name, age);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountBalance() {
        displayInfo();
        System.out.printf("Ваш текущий баланс: %.2f \n", balance);
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма пополнения не может быть отрицательным числом");
        } this.balance += amount;
        System.out.printf("Начислена сумма %.2f \n", amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Сумма снятия не может превышать текущий баланс");
        } this.balance -= amount;
        System.out.printf("Списана сумма %.2f \n", amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
