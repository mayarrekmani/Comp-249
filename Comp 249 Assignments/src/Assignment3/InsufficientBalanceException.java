package Assignment3;
//create an exception for insufficient balance
class InsufficientBalanceException extends Exception{
    //create an InsufficientBalanceExxception constructor super the message

    public InsufficientBalanceException(String message){
        super(message);
    }
}
