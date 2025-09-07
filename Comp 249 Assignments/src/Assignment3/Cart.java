package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    //create a list of items which is an array list and a method to add to the products
    List<Product> items  = new ArrayList<>();
    public void addProduct(Product p){
        items.add(p);
    }
    //create a method getTotalPrice by going through the array and getting the prices
    public double getTotalPrice(){
        double totalPrice = 0;
        for (Product p : items){
            totalPrice +=p.getPrice();
        }
        return totalPrice;
    }
    //create a method checkout which throws an exception if there is an insufficient balance or if the cart is empty
    public void checkout(Customer c) throws EmptyCartException, InsufficientBalanceException{
        if (c.getBalance()<getTotalPrice()){
            throw new InsufficientBalanceException("Error: Insufficient balance to complete the purchase");
        }
        if (items.isEmpty()){
            throw new EmptyCartException("Your cart is empty you must select items to purchase before checking out");
        }
        //print out a checkout statemnt that shows the products bought as well presents the user with how much his balance ends up being
        System.out.println("Congratulations your transaction was succesful!");
        System.out.println("Item(s) bought are below.");
        for (Product p : items){
            System.out.println(p);
        }
        System.out.println("The total price was "+Math.round(getTotalPrice()*100.0)/100.00+" the remaining amount in your balance is "+Math.round(c.deductBalance(getTotalPrice()) *100.0)/100.00);

    }
}
