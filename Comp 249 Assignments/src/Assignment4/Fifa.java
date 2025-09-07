package Assignment4;

public class Fifa extends Game{
    public Double goals;
    public Double goalsConceded;
    public Fifa(String game){
        super(game);
    }


    public void setGoals(Double goals, Double goalsConceded) {
        this.goals = goals;
        this.goalsConceded = goalsConceded;
    }

    @Override
    Double calculateScore() {
        if (this.goals==null){
            return null;
        }
       return  this.goals*5-this.goalsConceded*2.5;

    }
}
