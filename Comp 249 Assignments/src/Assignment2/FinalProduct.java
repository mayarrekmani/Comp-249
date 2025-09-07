package Assignment2;
//make final product class FinaLProduct
public final class FinalProduct   extends Product{
    //create variable prootional price which
    private  double promotionalPrice;
    @Override
     double getFinalPrice() {
        return this.promotionalPrice;
    }
//create the constructor for FinalProduct
    public  FinalProduct (String productId, String name, double price, double promotionalPrice){
        super(productId, name, price);
        this.promotionalPrice = promotionalPrice;
    }

}
//there is no need to overrride the toString as we will be printing out the same line as shown in the Product class