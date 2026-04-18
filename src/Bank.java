import javax.security.auth.login.AccountNotFoundException;
import exception.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {
    List <BankAccount> bankAccounts = new ArrayList<>();
    List <SavingsAccount> savingsAccounts = new ArrayList<>();

    public Bank(List <BankAccount> bankAccounts, List <SavingsAccount> savingsAccounts) {
        this.bankAccounts = bankAccounts != null ? bankAccounts : new ArrayList<>();
        this.savingsAccounts = savingsAccounts != null ? savingsAccounts : new ArrayList<>();
    }

    void transfer(String fromAccountId, String toAccountId, double amount)
            throws AccountNotFoundException, InsufficientFundsException,
            InvalidAccountException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Сумма перевода должна быть положительной");
        }

        BankAccount fromAccount = findAccount(fromAccountId);
        BankAccount toAccount = findAccount(toAccountId);

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);

        System.out.printf("Перевод %.2f с %s на %s выполнен успешно%n",
                amount, fromAccountId, toAccountId);
    }

    private BankAccount findAccount(String accountID) throws AccountNotFoundException {
        for (BankAccount account : bankAccounts) {
            if (account.getAccountID().equals(accountID)) return account;
        }

        for (SavingsAccount account : savingsAccounts) {
            if (account.getAccountID().equals(accountID)) return account;
        }

        throw new AccountNotFoundException("Счет с ID " + accountID + " не найден");
    }

    public void addAccount(BankAccount account) {
        bankAccounts.add(account);
    }

    public void addAccount(SavingsAccount account) {
        savingsAccounts.add(account);
    }

    // Геттеры
    public List <BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public List <SavingsAccount> getSavingsAccounts() {
        return savingsAccounts;
    }
}
