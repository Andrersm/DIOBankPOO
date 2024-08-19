package com.model;

import lombok.Getter;

@Getter
public class User {
    private String name;
    private String email;
    private BankAccount bankAccount;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return "Cliente: " + name + "  Email: " + email;
    }
}
