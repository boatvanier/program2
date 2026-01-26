package oop.bank;

public abstract class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    private boolean active;
    private static int totalAccounts;

    public BankAccount(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0;
        this.active = true;
        totalAccounts++;
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
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
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

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (active && amount > 0 ) {
            this.balance = this.balance + amount;
        }
    }

    public abstract void withdraw(double amount);

    public void closeAccount() {
        this.active = false;
    }
}
