package Assignment3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
//------------------------------------------------------------------------------------------------------------------
// Assignment 3
// Written by: Mayar Rekmani 40309949
// For COMP 249 Summer 2025
//------------------------------------------------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) throws EmptyCartException, InsufficientBalanceException {
        //bring in a scanner
        Scanner scanner = new Scanner(System.in);
        //create an array of products
        List <Product> productList = new ArrayList<>();
//create a new customer
        Customer customer1 = new Customer();
        System.out.print("Enter your name: ");
        customer1.setName(scanner.next());

//create a while loop that will try and catch until a valid number is put
        while (true) {
            {
                try {
                    System.out.print("Enter your balance: ");
                    customer1.setBalance(scanner.nextDouble());
                    System.out.println();
                    break;


                } catch (InputMismatchException e) {
                    System.out.println("This is not a valid input it must be a number.");
                    scanner.nextLine();
                }
            }
        }
        //create a cart
        Cart cart = new Cart();
//create and all products to the product list

        Product headphones = new Product(1,"Headphones",25.99);
        Product charger = new Product(2,"Charger",15.50);
        Product usbCable = new Product(3,"USB Cable",9.75);
        Product water = new Product(4,"Water Bottle",10.99);
        Product shirt = new Product(5,"Shirt",30);

        productList.add(headphones);
        productList.add(charger);
        productList.add(usbCable);
        productList.add(water);
        productList.add(shirt);
        System.out.println();
        System.out.println("Available Products: ");
        //print out the available products
        for (Product p : productList){
            System.out.println(p);
        }
        System.out.println();
//create a while loop that will keep looping until the customer either picks items to shop with and/or leaves to the checkout
        while (true){
            try {
                System.out.print("Select a product to add to cart (enter ID, -1 to stop): ");
                int id = scanner.nextInt();
                System.out.println();
                if (id==-1){
                    break;
                }
                //see whether or not an Id is taking in which matches with the product ID
                if (id!= headphones.getId()&&id!= charger.getId()&&id!= usbCable.getId()&&id!= water.getId()&&id!=shirt.getId()){
                    throw new InvalidInput("No product with ID "+id);
                }
                //add that desiredd product if it is part of the Id of the product list
                Product customerProduct;
                for (Product p : productList){
                    if(p.getId()==id){
                        customerProduct = new Product(p);
                        cart.addProduct(customerProduct);
                        System.out.println("Added "+customerProduct.getName()+" to the cart.");
                        System.out.println();
                        break;
                    }
                }
                //see if they want to checkout
                System.out.print("Checkout now? (yes/no): ");
                String answer = scanner.next();
                System.out.println();
                if (answer.equalsIgnoreCase("yes")){
                    break;
                }
            }
            //catch either scenarios
            catch (InvalidInput e){
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        //print out the check out statement
        System.out.println("Checking out...");
        cart.checkout(customer1);

    }
}
