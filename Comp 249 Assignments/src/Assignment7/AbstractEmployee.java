package Assignment7;

abstract class AbstractEmployee implements DisplayableComparison{
    protected String deptName;
    protected  int score;
    protected Developer comparedDeveloper;
    public AbstractEmployee(String deptName, int score){
        this.deptName = deptName;
        this.score = score;
    }
    public AbstractEmployee(AbstractEmployee abstractEmployee){
        this.deptName = abstractEmployee.getDeptName();
        this.score = abstractEmployee.getScore();
    }

    public int getScore() {
        return score;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getShortenedDeptName() {
        String[] deptNameArray = this.deptName.split(" ");
        if (deptNameArray.length>1) {
                return deptNameArray[0] + "Dev";
        }
        else {
            return this.deptName;
        }
    }
//see if u have to fix this

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
