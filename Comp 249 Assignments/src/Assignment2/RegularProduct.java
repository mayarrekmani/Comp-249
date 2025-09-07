package Assignment2;

public  class RegularProduct extends Product{
    //no need to make a new variable as the original price will be the value
    @Override
    double getFinalPrice() {
        return this.price;
    }
    //make constructor for RegularProduct
    public RegularProduct(String productId, String name, double price){
        super(productId, name, price);
    }

}
//there is no need to overrride the toString as we will be printing out the same line as shown in the Product class