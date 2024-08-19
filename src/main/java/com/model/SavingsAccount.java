package com.model;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(User costumer, Bank bank) {

        super.bank = bank;
        super.owner = costumer;
        super.accountNumber = SEQUENTIAL_SAVINGS;

        if (SEQUENTIAL_SAVINGS % 2 != 0) {
            SEQUENTIAL_SAVINGS++;
        }

        super.accountNumber = SEQUENTIAL_SAVINGS++;
    }

    public String toString() {
        return "Conta Poupança numero:" + super.accountNumber + " " + super.owner;
    }

}
