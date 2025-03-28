public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, String name, double interestRate) {
        super(accountNumber, balance, name);
        setInterestRate(interestRate);
    }

    public void applyInterest(){
        balance += (balance * interestRate);
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
