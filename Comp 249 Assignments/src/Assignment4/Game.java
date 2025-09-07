package Assignment4;



public abstract class Game {
    protected Double score = null;
    protected String game;
    public Game(String game){
        this.game = game;
    }


    public String getGame() {
        return game;
    }

    public double getScore()throws ScoreNotSetException{
        if (calculateScore()==null){
            throw new ScoreNotSetException();
        }
        return calculateScore();
    }
    abstract Double calculateScore();
}
