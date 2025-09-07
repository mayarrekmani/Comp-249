package Exception2;

public class InvalidAmountException extends Exception{
    public InvalidAmountException(){
        super("Transfer amount must be greater than zero");
    }
}
