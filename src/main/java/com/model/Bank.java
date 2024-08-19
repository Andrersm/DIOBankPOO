package com.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<User> customers = new ArrayList<>();
    private List<CurrentAccount> accounts = new ArrayList<>();
    private List<SavingsAccount> savingsAccounts = new ArrayList<>();

    public List<CurrentAccount> getCurrentAccounts() {
        return accounts;
    }

    public List<User> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public List<SavingsAccount> getSavingsAccounts() {
        return savingsAccounts;
    }

    public Bank(String name) {
        this.name = name;
    }

    public void addCurrentAccount(CurrentAccount account) {
        accounts.add(account);
    }

    public void addSavingsAccount(SavingsAccount account) {
        savingsAccounts.add(account);
    }

    public void AddCustomer(User customer) {
        customers.add(customer);
    }

}
