package exception;

public class InvalidAmountException extends BankException {
    public InvalidAmountException(String message) {
        super(message);
    }

    @Override
    public String getRecommendedAction() {
        return "The transfer amount must be positive.";
    }
}
