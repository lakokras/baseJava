package exception;

public class InsufficientFundsException extends BankException {
    public InsufficientFundsException(String balance) {
        super(balance);
    }

  @Override
  public String getRecommendedAction() {
    return "Please check your account balance and try again.";
  }
}
