package com.javalearning.test;

public class BankAccount {
    private long accountNumber;
    private double balance;

    //ACCOUNT-NUMBER GETTER
    public long getAccountNumber() {
        return this.accountNumber;
    }

    //ACCOUNT-NUMBER SETTER
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    //BALANCE GETTER
    public double getBalance() {
        return this.balance;
    }

    //BALANCE SETTER
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //DEPOSIT
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        } else System.out.println("INVALID DEPOSIT AMOUNT");
    }

    //WITHDRAW
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount withdrew: " + amount);
        } else {
            System.out.println("Invalid amount or Insufficient balance");
        }

    }

}
