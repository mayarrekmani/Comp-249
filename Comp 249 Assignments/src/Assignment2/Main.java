package Assignment2;

import java.util.ArrayList;
import java.util.List;
//------------------------------------------------------------------------------------------------------------------
// Assignment 2
// Written by: Mayar Rekmani 40309949
// For COMP 249 Summer 2025
//------------------------------------------------------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {
        //make diffferent array of products
        List<Product> productList = new ArrayList<>();
        List<Product> productsRegularUser = new ArrayList<>();
        List<Product> productsAdminUser = new ArrayList<>();


// make different products with upstreaming
        Product iPhone = new DiscountedProduct("productID", "iPhone", 999, 18);
        Product jeans = new RegularProduct("productID","Jeans",60);
        Product captainAmericaFigure = new FinalProduct("productID","CaptainAmericaFigure", 32, 27.66);
        Product smarties = new DiscountedProduct("productID","smarties",4.99,10);
        //add to the array of  products
        productList.add(iPhone);
        productList.add(jeans);
        productsRegularUser.add(captainAmericaFigure);
        productsAdminUser.add(iPhone);
        productsAdminUser.add(smarties);

// create users that will be safely downcast
        User premiumUser = new PremiumUser( "PremiumUser", "alice123");
        User user1 = new AdminUser("AdminUser", "mayar543");
        User user2 = new RegularUser("RegularUser","florence") ;

        System.out.println();


        System.out.println();
        //safely downcast users by using instanceof, and print out what they have
        if (premiumUser instanceof PremiumUser){
            PremiumUser premiumUser1 =(PremiumUser) premiumUser;
            premiumUser1.printReceipt(productList);
            System.out.println();
        }

        if (user2 instanceof RegularUser){
            RegularUser regularUser = (RegularUser) user2;
            regularUser.printReceipt(productsRegularUser);
        }
        if (user1 instanceof AdminUser) {
            System.out.println();
            AdminUser adminUser = (AdminUser) user1;
            user1.printReceipt(productsAdminUser);
            System.out.println();
            adminUser.viewSystemStats();
        }

    }
}
