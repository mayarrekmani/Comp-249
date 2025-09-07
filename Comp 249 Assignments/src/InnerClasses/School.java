package InnerClasses;

public class School {
    private final String schoolName = "Green Valley High";
    public class Student{
        public void printSchoolName(){
            System.out.println(schoolName);
        }
    }
}
