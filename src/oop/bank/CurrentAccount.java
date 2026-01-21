package oop.bank;

public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountName,
                          double initialBalance, double overdraftLimit) {
        super(accountNumber, accountName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    public void withdraw(double amount) {
        if (isActive() && amount > 0 &&
                getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() -amount);
        }
    }
}
