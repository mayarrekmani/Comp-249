package OrderedInterfaceStudentComparison;

public abstract class MyAbstractStudent extends Student implements ShowablyOrdered {
    private String name;
    private int score;

    public MyAbstractStudent(String name, int score) {
        super(name, score);
    }
    @Override
    public boolean precedes(Object other) {
        if (other instanceof Student){
            return this.getScore()<((Student)other).getScore();
        }
        else {
            return false;
        }
    }
}
