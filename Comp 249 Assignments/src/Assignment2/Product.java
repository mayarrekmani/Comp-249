package Assignment2;

public abstract class Product {
    //create variables for product
    protected String productId;
    protected String name;
    protected double price;
//create a constructor for product
    public Product(String productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

//create a method to get the finalprice
     abstract double getFinalPrice();
//create a toString method make sure that the price only gives two decimals
    public String  toString(){
        return "Product: "+this.name+" - $"+this.price+" -> Final Price: $"+ Math.round(getFinalPrice()*100.00)/100.00;
    }

}
