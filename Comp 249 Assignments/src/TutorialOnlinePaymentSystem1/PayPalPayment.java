package TutorialOnlinePaymentSystem1;

public class PayPalPayment extends Payment {
    private String email;
    @Override
    public void processPayment(){
        System.out.println("Processing PayPal payment of $"+ amount+"from email");
    }
}
