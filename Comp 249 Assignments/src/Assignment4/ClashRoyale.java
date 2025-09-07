package Assignment4;

public class ClashRoyale extends Game{
    private Double wins;
    private Double losses;

    public ClashRoyale(String game){
        super(game);
    }
    public double getLosses() {
        return (double) (losses)*(30);
    }

    public void setLossesandWins(Double wins, Double losses) {
        this.wins = wins;
        this.losses = losses;

    }

    public double getWins() {
        return (double) (wins)*(30);
    }

    @Override
    Double calculateScore() {
        if (this.wins==null){
            return null;
        }
        return getWins()-getLosses();
    }
}
