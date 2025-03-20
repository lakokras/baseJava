package Payable;

public class Program {
    public static void main(String[] args) {
        Payable[] payableMethods = new Payable[3];
        payableMethods[0] = new CreditCard("1234-5678-9123-4567");
        payableMethods[1] = new PayPal("example@gmail.com");
        payableMethods[2] = new BankTransfer("109249071");

        for (Payable payable : payableMethods) {
            payable.pay(100);
        }
    }
}
