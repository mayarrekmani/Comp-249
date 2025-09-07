package Exception2;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void withdraw(double amount)throws InvalidAmountException, InsufficientFundsException{
        if (amount<0){
            throw new InvalidAmountException();
        }
        if (amount>this.balance){
            throw new InsufficientFundsException();
        }
        this.balance -= amount;
    }
    public void deposit(double amount) throws InvalidAmountException{
        if (amount<0){
            throw new InvalidAmountException();
        }
        this.balance += amount;
    }
    public void transferTo(BankAccount recipient, double amount) throws InsufficientFundsException , InvalidAmountException{
        if (amount>this.balance) {
            throw new InsufficientFundsException();
        }if (amount<0) {
            throw new InvalidAmountException();
        }
        this.balance -= amount;
        recipient.deposit(amount);
    }
}
