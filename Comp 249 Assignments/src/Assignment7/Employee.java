package Assignment7;

public class Employee implements Cloneable{
    private  String name;
    private  Department department;
    public Employee (String name, Department department){
        this.name = name;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public Employee clone(){
        try {
            Employee employee = (Employee) super.clone();
            employee.department = department.clone();
            return employee;
        }
        catch (CloneNotSupportedException e){
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"\n"+"Department : "+this.department;
    }
}
