package Assignment3;
//create a class that check whether or not the input is valid or not

 class InvalidInput extends Exception{
     //create the iNvalid Input super the message
    public InvalidInput(String message){
        super(message);
    }
}
