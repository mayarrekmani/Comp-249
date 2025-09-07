package OrderedInterfaceStudentComparison;

import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Ordered{
    private String name;
    private  int score;
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean precedes(Object other) {
        if (other instanceof Student){
            return this.getScore()<((Student) other).getScore();
        }
        else {
            return false;
        }
    }

    @Override
    public boolean follows(Object other) {
        if (other instanceof Student){
            return this.getScore()>((Student) other).getScore();
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> studentArrayList = new ArrayList<>();
        Student s1 = new Student("Mayar",80);
        Student s2 = new Student("Dylan",68);
        Student s3 = new Student("Joel",77);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s1);
        if (s1.precedes(s2)){
            System.out.println(s1.getName()+" precedes "+s2.getName());
        }
        else {
            System.out.println(s2.getName()+" precedes "+s1.getName());
        }
        studentArrayList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.precedes(o2)){
                    return -1;
                } else if (o1.getScore()==o2.getScore()) {
                    return 0;
                } else return 1;

            }
        });
        for (Student student : studentArrayList){
            System.out.println(student.getScore()+"\t");
        }
    }
}
