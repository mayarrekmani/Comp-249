package Assignment2;

import java.util.List;
//create a RegularUser class that extends user
public  class RegularUser extends User{

//create a constructor for RegularUser
    public RegularUser (String userID, String username){
        super(userID,username);
    }
//here we will override the printReceipt method and display the products using a for loop
    @Override
    void printReceipt(List<Product> productList) {
        System.out.println(this);
        products += productList.size();
        for (Product p : productList) {
            this.total += p.getFinalPrice();
            System.out.println(p);
        }
        System.out.println();
        System.out.println("Total: $"+Math.round(this.total*100.00)/100.00);
    }
}
//the toString will be the same as User so when we call it it will go to the parent class and print its toString class which is what we want