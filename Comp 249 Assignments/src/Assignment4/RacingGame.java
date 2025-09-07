package Assignment4;

public class RacingGame extends Game{
    private Double placement;
    public RacingGame(String game){
        super(game);
    }

    public void setPlacement(Double placement) {
        this.placement = placement;
    }

    @Override
    Double calculateScore() {
        if (this.placement ==null){
            return null;
        }
        else if (this.placement==1){
           return  100.0;
        }
        else if (this.placement==2){
            return   50.0;
        }
        else if (this.placement==3){
            return  25.0;
        }
        else if (this.placement<10){
            return 10.0;
        }
        else {
            return 0.0;
        }

    }
}
