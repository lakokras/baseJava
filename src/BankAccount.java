public class BankAccount {

    private final String accountNumber;
    private double balance;
    private String ownerName;


    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    void displayBalance() {
        System.out.printf("%s текущий баланс: %.2f \n", ownerName, balance);
    }

    void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Баланс не может быть меньше 0");
        } this.balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Сумма не может превышать текущий баланс");
        } this.balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
