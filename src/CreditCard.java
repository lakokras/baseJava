public class CreditCard implements Payable {

    private String cardNumber;

    public CreditCard(String cardNumber) {
        setCardNumber(cardNumber);
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Номер карты: %s ", cardNumber);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (null == cardNumber || cardNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Чего пустуем");
        }

        // Удаляем все пробелы и дефисы (если они есть)
        String cleanedCardNumber = cardNumber.replaceAll("[\\s-]", "");

        if (cleanedCardNumber.length() < 13 || cleanedCardNumber.length() > 19) {
            throw new IllegalArgumentException("Не будь длинным или коротким, ты, номер кредитки");
        }

        this.cardNumber = cleanedCardNumber;
    }
}
