package Exception2;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
        super("Insufficient funds in the account of ");
    }
}
