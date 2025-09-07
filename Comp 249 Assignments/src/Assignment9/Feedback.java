package Assignment9;

public class Feedback <T extends Number>{
    private String customerName;
    private String feedbackMessage;
    private T rating;
    private boolean noRate;


    public Feedback(String customerName, String feedbackMessage, T rating){
        this.customerName = customerName;
        this.feedbackMessage = feedbackMessage;
        this.rating = rating;

    }

    public String getCustomerName() {
        return customerName;
    }

    public String getFeedbackMessage() {
        return feedbackMessage;
    }

    public T getRating() {
        if (rating.equals(0)){
            noRate = true;
        }
        return rating;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setFeedbackMessage(String feedbackMessage) {
        this.feedbackMessage = feedbackMessage;
    }

    public void setRating(T rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        getRating();
        if (noRate){
            return "Name: "+getCustomerName()+"\n"+"Message: "+getFeedbackMessage()+"\n"+"Rating : No Rating"+"\n";
        }
        else {
            return "Name: "+getCustomerName()+"\n"+"Message: "+getFeedbackMessage()+"\n"+"Rating : "+getRating()+"\n";
        }
    }

}

