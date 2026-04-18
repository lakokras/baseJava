import exception.*;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Program{

    public static void main(String[] args) {

        Human human1 = new Human("Michel");
        Human human2 = new Human("Bill");
        BankAccount acc1 = new BankAccount("ACC001", 1000, human1.getName());
        SavingsAccount acc2 = new SavingsAccount("SAV001", 5000, 5.0, human2.getName());

        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(acc1);
        List<SavingsAccount> savingsAccounts = new ArrayList<>();
        savingsAccounts.add(acc2);

        Bank bank = new Bank(bankAccounts, savingsAccounts);

        try {
            bank.transfer("ACC001", "SAV001", 500);
        } catch (AccountNotFoundException | InsufficientFundsException | InvalidAccountException |
                 InvalidAmountException e) {
            System.err.println("Ошибка перевода: " + e.getMessage());
        }

//        human1.humanName();
//        human2.humanName();
        acc1.displayBalance();
        acc2.displayBalance();
    }
}