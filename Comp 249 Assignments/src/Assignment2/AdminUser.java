package Assignment2;

//create a class AdminUser that extends PremiumUSer
public class AdminUser extends PremiumUser{
//create a constructor for AdminUser
    public AdminUser(String userId, String username){
        super(userId, username);
    }
    //there is no need to override the receipt method as it will be the same as the premium user method
    //create a final method that prints out the amount of products and users
    public final void viewSystemStats(){
            System.out.println("Admin Stats: Total Products: " +products + "| Total Users: " + users);
    }
}
