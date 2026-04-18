package exception;

public abstract class BankException extends Exception {
    protected BankException(String message) {
        super(message);
    }

    public abstract String getRecommendedAction();
}
