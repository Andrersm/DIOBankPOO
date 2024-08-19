package com.model;

import lombok.Getter;

@Getter
public abstract class BankAccount {

    protected static int DEFAULT_BRANCH = 1;
    protected static int SEQUENTIAL_SAVINGS = 1;
    protected static int SEQUENTIAL_CURRENT = 1;

    protected Bank bank;
    protected User owner;
    protected int branch;
    protected int accountNumber;
    protected double balance = 0;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }

    };

    public void transfer(double amount, BankAccount destinationAccount) {
        if (amount <= this.balance) {
            this.withdraw(amount);
            destinationAccount.deposit(amount);
        } else {
            System.out.println("Insufficient funds");
        }

    }

}
