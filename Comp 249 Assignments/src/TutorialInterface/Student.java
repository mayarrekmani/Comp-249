package TutorialInterface;

import java.util.Arrays;
import java.util.Comparator;
public class Student implements Ordered{
    private String name;
    private int score;
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return this.name+" "+this.score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean precedes(Object other) {
        if (other instanceof Student){
            Student student = (Student) other;
            return this.getScore()< student.getScore();
        }
        else return false;
    }

    @Override
    public boolean follows(Object other) {
        if (other instanceof Student){
            Student student = (Student) other;
            return this.getScore()>student.getScore();
        }
        else return false;
    }
    public interface ShowableOrdered extends Ordered{
        void showOneWhoPrecedes();
    }
    public static abstract class MyAbstractStudent implements ShowableOrdered{
        protected Student abstractStudent;
        @Override
        public boolean precedes(Object other) {
            if (other instanceof Student){
                Student student = (Student)other;
                return this.abstractStudent.getScore()>student.getScore();
            }
            return false;
        }
    }
    public static class CollegeStudent extends MyAbstractStudent{
        private Student[] students;
        public CollegeStudent(Student[] students){
            this.students = students;
        }
        @Override
        public void showOneWhoPrecedes() {
            for (int i= 0;i<students.length;i++){
                Student s = students[i];
                if (i==students.length-1){
                    System.out.print("Student "+s.getName()+" with score "+s.getScore());

                }
                else {
                    System.out.print("Student " + s.getName() + " with score " + s.getScore() + " precedes ");
                }
            }
            System.out.println(".");
        }

        @Override
        public boolean follows(Object other) {
            if (other instanceof Student){
                Student student = (Student)other;
                return this.abstractStudent.getScore()<student.getScore();
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Student mayar = new Student("Mayar",90);
        Student derek = new Student("Derek",70);
        Student darryl = new Student("Darryl",80);
        Student[] studentList = {mayar,derek,darryl};
        System.out.println(mayar.precedes(derek));
        System.out.println(derek.precedes(mayar));
        System.out.println(darryl.precedes(mayar));
        Student [] students = studentList;
        Arrays.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.follows(o2)){
                    return 1;
                }
                else return -1;
            }
        });
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.precedes(o2)){
                    return 1;
                }
                else return -1;
            }
        });
        for (Student s : studentList){
            System.out.println(s);
        }
        CollegeStudent collegeStudent = new CollegeStudent(students);
       collegeStudent.showOneWhoPrecedes();
    }
//only allows for those 4 results
    enum Direction {
        down,
        left,
        right,
        up
    }
}
