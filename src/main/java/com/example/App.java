package com.example;

import com.model.Bank;
import com.model.BankAccount;
import com.model.CurrentAccount;
import com.model.SavingsAccount;
import com.model.User;
import lombok.Getter;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {
        Bank bank = new Bank("Nowbank");

        User user = new User("andré", "andre.mv.2@hotmail.com");
        User user2 = new User("andré", "XXXXXXXXXXXXXXXXXXXXXX");
        User user3 = new User("andré", "XXXXXXXXXXXXXXXXXXXXXX");

        bank.AddCustomer(user);
        bank.AddCustomer(user2);
        bank.AddCustomer(user3);

        CurrentAccount bankAccount = new CurrentAccount(user, bank);
        CurrentAccount bankAccount2 = new CurrentAccount(user2, bank);
        CurrentAccount bankAccount3 = new CurrentAccount(user3, bank);

        bank.addCurrentAccount(bankAccount);
        bank.addCurrentAccount(bankAccount2);
        bank.addCurrentAccount(bankAccount3);

        SavingsAccount bankAccount4 = new SavingsAccount(user, bank);
        SavingsAccount bankAccount5 = new SavingsAccount(user2, bank);
        SavingsAccount bankAccount6 = new SavingsAccount(user3, bank);

        bank.addSavingsAccount(bankAccount4);
        bank.addSavingsAccount(bankAccount5);
        bank.addSavingsAccount(bankAccount6);

        System.out.println(bank.getCurrentAccounts());
        System.out.println(bank.getSavingsAccounts());

        bankAccount.deposit(1000);
        bankAccount.transfer(500, bankAccount2);
        bankAccount.withdraw(2000000);
        System.out.println(bankAccount.getBalance());

        System.out.println();

    }
}
