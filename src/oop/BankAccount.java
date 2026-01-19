package oop;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    private boolean active;

    public BankAccount(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0;
        this.active = true;
    }

    public BankAccount(String accountNumber, String accountName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.active = true;

        if (initialBalance > 0 ) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    public void deposit(double amount) {
        if (active && amount > 0 ) {
            this.balance = this.balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (active && amount > 0 && this.balance >= amount) {
            this.balance = this.balance - amount;
        }
    }

    public void closeAccount() {
        this.active = false;
    }
}
