package Assignment3;

public class Customer {
    //create variables and constructors for customer
    private String name;
    private double balance;
    public Customer(){
        this.name = null;
        this.balance = 0;
    }

    public Customer(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
//setters and getters for the customer
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
//create a method deductBalance that throws InsufficientBalanceException
    public double deductBalance(double amount) throws InsufficientBalanceException{
        if (amount>this.balance){
            throw new InsufficientBalanceException("ERROR: Insufficient balance to complete the purchase.");
        }
       return this.balance -= amount;
    }

    //override the toString method
    @Override
    public String toString(){
        return this.name+" "+this.balance;
    }
}
