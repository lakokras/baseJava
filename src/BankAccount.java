public class BankAccount extends Human{
    private int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance, String name) {
        super(name);
        setAccountNumber(accountNumber);
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Была начислена сумма: " + amount);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Сумма списания не может превышать текущий баланс: " + balance);
        }
        balance -= amount;
        System.out.println("Была списана сумма: " + amount);
    }

    public void displayBalance() {
        System.out.println("Текущий баланс: " + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Номер аккаунта не может быть нулем или отрицательным число");
        }
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
