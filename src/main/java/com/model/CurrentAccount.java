package com.model;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(User costumer, Bank bank) {

        super.bank = bank;
        super.owner = costumer;
        super.accountNumber = SEQUENTIAL_CURRENT;

        if (SEQUENTIAL_CURRENT % 2 == 0) {
            SEQUENTIAL_CURRENT++;
        }

        super.accountNumber = SEQUENTIAL_CURRENT++;
    }

    public String toString() {
        return "Conta Corrente numero:" + super.accountNumber + " " + super.owner;
    }

}
