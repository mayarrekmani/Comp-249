package CloningPractice;

public class Employee implements Cloneable{
    private String name;
    private Address address;
    public Employee(String name, Address address){
        this.name=name;
        this.address =address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    public Employee clone(){
        try {
            Employee clone = (Employee) super.clone();
            clone.address = address.clone();
            return clone;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return this.name+" "+this.address;
    }

    public static void main(String[] args) {
        Address a = new Address("Laval");

        Address b = new Address("Montreal");
        Employee v = new Employee("Veronica",a);
        Employee c = v.clone();
        c.setAddress(b);
        System.out.println(v);
        System.out.println(c); 
    }
}
