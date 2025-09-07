package Assignment7;

public class Main {
    public static void main(String[] args) {
        //Part 1
        Candidate mayar = new Candidate("Mayar",60);
        Candidate bob = new Candidate("Bob", 30);
        Candidate dylan = new Candidate("Dylan",29);
        Candidate jeff = new Candidate("Jeff", 74);
        System.out.println("=== Part 1: Candidate Comparison ===");
        System.out.println();
        System.out.println("Comparing "+ bob.getName()+" and "+ mayar.getName()+":");
        System.out.println(mayar.getName()+" precedes "+ bob.getName()+"? "+ mayar.precedes(bob));
        System.out.println(mayar.getName()+" follows "+ bob.getName()+"? "+ mayar.follows(bob));
        System.out.println();
        System.out.println("Comparing "+ dylan.getName()+" and "+ jeff.getName()+":");
        System.out.println(dylan.getName()+" precedes "+ jeff.getName()+"? "+ dylan.precedes(jeff));
        System.out.println(dylan.getName()+" follows "+ jeff.getName()+"? "+ dylan.follows(jeff));

        //Part 2
        System.out.println();
        System.out.println("=== Part 2: Developer Comparison with Abstract Class===");
        Developer junior = new Developer("Junior Developer",60);
        Developer intern = new Developer("Intern", 30);
        junior.precedes(intern);
        System.out.println();
        junior.showComparisonResult();
        Developer juniorDeveloper = new Developer("Junior Developer",54);
        Developer senior = new Developer("Senior Developer", 20);
        senior.follows(juniorDeveloper);
        System.out.println();
        senior.showComparisonResult();

        //Part 3
        System.out.println();
        System.out.println("=== Part 3: Deep Cloning of Employee Records ===");
        System.out.println();


        Department engineering = new Department("Engineering");
        Employee emma = new Employee("Emma",engineering);
        System.out.println("Original Employee:");
        System.out.println(emma);
        System.out.println();



        Employee clone = emma.clone();
        Department research = new Department("Research");
        clone.setDepartment(research);



        System.out.println("Modified cloned employee's department to: "+research.getDeptName());
        System.out.println();
        System.out.println("Cloned Employee:");
        System.out.println(clone);
        System.out.println();



        System.out.println("Original Employee after cloning:");
        System.out.println(emma);

    }
}
