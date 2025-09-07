package Assignment2;

public class DiscountedProduct extends Product{
    //create a variable percentage that will give the percentage of the discount
    private double percentage;
    //override getFinalPrice
    @Override
    double getFinalPrice(){
        return discountPercentage();
    }
    //get discountPercentage by taking the price minus the price times the discount
    private double discountPercentage(){
        return ((this.price)-(this.price)*(this.percentage/100));
    }
//create the constructor for discountedProduct
    public DiscountedProduct(String productId, String name, double price, double percentage){
        super(productId, name, price);
        this.percentage = percentage;
    }
}

//there is no need to overrride the toString as we will be printing out the same line as shown in the Product class