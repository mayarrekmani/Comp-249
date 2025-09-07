package OrderedInterfaceStudentComparison;

import java.util.ArrayList;
import java.util.Comparator;

public class CollegeStudent extends MyAbstractStudent{
    ArrayList<Student> collegeStudentArrayList = new ArrayList<>();
    public CollegeStudent(String name, int score) {
        super(name, score);

    }

    public void setCollegeStudentArrayList(ArrayList<Student> collegeStudentArrayList) {
        this.collegeStudentArrayList = collegeStudentArrayList;
    }

    @Override
    public void showOneWhoPrecedes() {
        String string = "";
        for (Student s : collegeStudentArrayList){
            string +="Student "+s.getName()+" with score "+s.getScore()+" precedes ";
        }
        System.out.println(string.substring(0,(string.length()-10))+".");
    }

    public static void main(String[] args) {
        ArrayList <Student> studentArrayList = new ArrayList<>();
        Student s1 = new Student("Mayar",80);
        Student s2 = new Student("Dylan",68);
        Student s3 = new Student("Joel",77);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s1);
        CollegeStudent c = new CollegeStudent("Jeremy",90);
        studentArrayList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.precedes(o2)){
                    return -1;
                }
                else return 1;
            }
        });
        c.setCollegeStudentArrayList(studentArrayList);
        c.showOneWhoPrecedes();
    }

}
