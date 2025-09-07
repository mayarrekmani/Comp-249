package TutorialOnlinePaymentSystem1;

public class Payment {
    protected double amount;
    public void processPayment(){
        System.out.println("Processing generic payment of $"+amount);
    }
    public void receipt(){
        System.out.println("Receipt for payment: $"+ amount);
    }
    public void refund(){
        System.out.println("Refunding $"+amount);
    }
}
