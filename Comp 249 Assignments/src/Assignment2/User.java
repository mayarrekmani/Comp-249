package Assignment2;

import java.util.List;

public abstract class User  {
    //make variables for User
    protected String userId;
    protected String username;
    protected double total;
    protected static int users;
    protected static int products;
//make abstract method that will print the receipt
    abstract void printReceipt(List<Product> listProduct);
    //create a constructor for user that adds on to the variable users to keep track of how many total users
    public User(String userId, String username){
        this.userId = userId;
        this.username = username;
        users++;
    }
//create a toString method that displays the header of the receipt
    public String toString(){
        return "--- Receipt for "+ this.userId + ": "+ this.username+" ---";
    }

}
