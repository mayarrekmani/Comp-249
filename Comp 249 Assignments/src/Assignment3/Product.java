package Assignment3;


public class Product {
    //create variables for product
    private int id;
    private String name;
    private double price;
//create constructors for product
    public Product(){
        this.id =0;
        this.name = "";
        this.price = 0;
    }
    public Product(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
    }
    public Product(int id, String name,double price){
        this.id = id;
        this.name = name;
        this.price = price;

    }
//getters and setters for product
    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//override the toString method
    @Override
    public String toString() {
        return this.id+" "+this.name+" - $"+this.price;
    }
}
