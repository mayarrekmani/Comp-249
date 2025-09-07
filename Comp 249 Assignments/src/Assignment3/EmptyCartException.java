package Assignment3;
//make an exception for if the cart is empty
 public class EmptyCartException extends Exception{
     //create an EmptyCartException constructor super the message
    public EmptyCartException(String message){
        super(message);
    }
}
