package Assignment2;

import java.util.List;
//we will extend RegularUser and create PremiumUser
public class PremiumUser extends RegularUser{
//create constructor for PremiumUser
    public PremiumUser (String userID, String username){
        super(userID,username);
    }
//create a method that gets the amount of points
    public int getPoints() {
        return (int) ((this.total)/10);
    }

//the receipt will be the same as the Regular user, except for the points variable which is why extend RegularUSer and not user to not rewrite the same code
    @Override
    void printReceipt(List<Product> productList){
       super.printReceipt(productList);
        System.out.println();
        System.out.println("Points Earned: "+ getPoints());
    }
}
