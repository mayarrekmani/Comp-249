package InnerClasses;
public class Main {
    public class Company {
        private String name;

        public Company(String name) {
            this.name = name;
        }

        public static class Department {
            private String deptName;

            public void setDeptName(String deptName) {
                this.deptName = deptName;
            }

            public void displayInfo() {
                System.out.println("works");
            }
        }
    }
    public static class Library {
        public class Book{
            private String title;
            public Book(String title){
                this.title = title;
            }
            public void printTitle(){
                System.out.println("This is the title:" +this.title);
            }
        }
    }



    public static void main(String[] args) {
       Company.Department s = new Company.Department();
       Library v = new Library();
       Library.Book sv = v.new Book("j");
       School w = new School();
       School.Student q = w.new Student();

        Action action = new Action() {
            @Override
            public void execute() {
                System.out.println("Anonymous action performed");
            }
        };
        action.execute();
    }

}
