package oop.bank;

// is - a
public class SavingsAccount extends BankAccount implements InterestBearing, Overdraftable {

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountName,
                          double initialBalance, double interestRate) {
        super(accountNumber, accountName, initialBalance);
        this.interestRate = interestRate;
    }

//    public void addInterest() {
//        double interest = getBalance() * interestRate / 100;
//        deposit(interest);
//    }

    @Override
    public void withdraw(double amount)
    {
        if (isActive() && amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    @Override
    public boolean allowOverdraft(double amount) {
        return false;
    }
}
