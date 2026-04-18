package exception;

public class InvalidAccountException extends BankException {
    public InvalidAccountException(String accountID) {
        super(accountID);
    }

    @Override
    public String getRecommendedAction() {
        return "Please check the account ID and try again.";
    }
}
