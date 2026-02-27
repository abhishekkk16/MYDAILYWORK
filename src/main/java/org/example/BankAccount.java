package org.example;

public class BankAccount {
    private double balance;
    private int pin;

    public BankAccount(double initialBalance, int pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}