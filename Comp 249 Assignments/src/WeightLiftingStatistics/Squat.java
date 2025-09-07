package WeightLiftingStatistics;

public class Squat extends Weights{

    public Squat(){
        super();
    }
    private int squatPR;
    public void setSquatPR(int pr){
        this.squatPR = pr;
    }
    public Squat(Weights person){
        super(person);
    }

    @Override
    public String tenRepMax(int ten){
        return super.tenRepMax(ten);
    }
    @Override
    public String fiveRepMax(int five){
       return super.fiveRepMax(five);
    }
    @Override
    public String toString(){
        return super.toString();
    }
    public void rank(Squat squat){
            if (squat.getSex().equalsIgnoreCase("male")){
                switch (this.getWeightClassMale()){
                    case ("Flyweight"):
                    {
                        if (squat.getPr()<=176){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=187) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=262) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=339) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }
                    break;
                    case ("Bantamweight"):{
                        if (squat.getPr()<=199){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=211) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=295) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=376) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }
                    break;
                    case ("Featherweight"):{
                        if (squat.getPr()<=218){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=231) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=326) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=411) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }
                    break;
                    case ("Lightweight"):{
                        if (squat.getPr()<=234){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=251) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=356) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=445) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }
                    break;
                    case("Welterweight"):
                    {
                        if (squat.getPr()<=239){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=265) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=377) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=468) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }
                    break;
                    case ("Heavyweight"):
                    {
                        if (squat.getPr()<=294){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=321) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=462) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=501) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }
                    break;
                }

            }
            else {
                switch (this.getWeightClassWoman()){
                    case ("Flyweight"):
                    {
                        if (squat.getPr()<=75){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=95) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=120) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=135) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }
                    break;
                    case ("Bantamweight"):
                    {
                        if (squat.getPr()<=97){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=115) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=146) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=165) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }
                    break;
                    case ("Featherweight"):{
                        if (squat.getPr()<=115){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=135) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=170) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=195) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }
                    break;
                    case ("Lightweight"):{
                        if (squat.getPr()<=125){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=150) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=190) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=215) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }
                    break;
                    case ("Welterweight"):{
                        if (squat.getPr()<=135){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=165) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=205) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=230) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }
                    break;
                    case ("Heavyweight"):{
                        if (squat.getPr()<=145){
                            System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                        } else if (squat.getPr()<=175) {
                            System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                        }
                        else if (squat.getPr()<=220) {
                            System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                        }else if (squat.getPr()<=265) {
                            System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                        }
                        else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                    }

                }

            }

    }
}
