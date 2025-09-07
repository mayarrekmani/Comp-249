package Assignment4;

 class ScoreNotSetException extends Exception{
     public ScoreNotSetException(){
         super("Error: Score has not been set yet.");
     }
     public ScoreNotSetException(String message){
         super(message);
     }
     @Override
     public String getMessage(){
         return "Error: Score has not been set yet.";
     }
}
