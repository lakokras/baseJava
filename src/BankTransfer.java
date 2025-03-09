public class BankTransfer implements Payable {

    private String accountNumber;

    public BankTransfer(String accountNumber) {
        setAccountNumber(accountNumber);
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Номер аккаунта: %s \n", accountNumber);
        System.out.printf("Оплата в размере %.2f", amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (null == accountNumber || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Чего пустуем");
        }
        this.accountNumber = accountNumber.trim();
    }
}
