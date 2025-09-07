package Assignment7;

public class Developer extends AbstractEmployee{
    protected Developer comparedDeveloper;

    public Developer(String name, int score) {
        super(name, score);
    }

    public Developer(Developer developer){
        super(developer);
    }
    @Override
    public boolean precedes(Object other) {
        if (other instanceof Developer){
            Developer developer = (Developer) other;
            comparedDeveloper = new Developer(developer);
            return this.score<developer.getScore();
        }
        else {return false;}
    }

    @Override
    public boolean follows(Object other) {
        if (other instanceof Developer){
            Developer developer = (Developer) other;
            comparedDeveloper = new Developer(developer);
            return this.score>developer.getScore();
        }
        else{
            return false;
        }
    }

    @Override
    public void showComparisonResult() {
        System.out.println("Comparing "+comparedDeveloper.getDeptName()+ " vs. "+ this.getDeptName() +": ");
        System.out.println("Score Comparison Result:");
        System.out.print(comparedDeveloper.getShortenedDeptName()+" (score: "+comparedDeveloper.getScore()+")");
        if (comparedDeveloper.precedes(this)){
            System.out.print(" precedes ");
        }
        else {System.out.print(" follows ");}
        System.out.println(this.getShortenedDeptName() +"(score: "+this.score+")");
    }
}
