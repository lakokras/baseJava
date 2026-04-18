public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountId, double balance, double interestRate, String owner) {
        super(accountId, balance, owner);
        setInterestRate(interestRate);
    }

    public void applyInterest(){
//        balance += (balance * interestRate);
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate <= 0) {
            throw new IllegalArgumentException("Процент не может быть нулем или отрицательным число");
        }
        this.interestRate = interestRate;
    }
}
