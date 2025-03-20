package Payable;

public class PayPal implements Payable {

    private String email;

    public PayPal(String email) {
        setEmail(email);
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Ваш емаил: %s ", email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (null == email || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Афигел писать емаил без собаки и точки!?");
        }
        this.email = email;
    }
}
