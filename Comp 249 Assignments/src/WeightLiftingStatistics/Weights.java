package WeightLiftingStatistics;

import java.util.Scanner;

public class Weights {
    private    double weight;
    private int pr;
    private  String sex;
    private int age;

    public Weights(){
        this.pr = 0;
        this.sex = "";
        this.age = 0;
        this.weight = 0.0;
    }
    public Weights (Weights person){
        this.pr = person.getPr();
        this.sex = person.getSex();
        this.weight = person.getWeight();
        this.age = person.getAge();
    }
    public Weights(String sex, int age, double weight, int pr){
        this.sex = sex;
        this.age = age;
        this.weight =weight;
        this.pr = pr;
    }
    public int getPr(){
        return this.pr;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getSex(){
        return this.sex;
    }
    public int getAge(){
        return this.age;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getWeightClassWoman(){
        String weightClass;
        if (this.weight<100){
            weightClass = "Flyweight";
        }
        else if (this.weight<=120){
            weightClass = "Bantamweight";
        }
        else if (this.weight<=140) {
            weightClass = "Featherweight";
        }
        else if (this.weight<=160) {
            weightClass = "Lightweight";
        }
        else if (this.weight<=180) {
            weightClass = "Welterweight";
        }
        else {
            weightClass = "Heavyweight";
        }
        return weightClass;
    }
    public String getWeightClassMale(){
        String weightClass;
        if (this.weight<150){
            weightClass = "Flyweight";
        }
        else if (this.weight<=180){
            weightClass = "Bantamweight";
        }
        else if (this.weight<=200) {
            weightClass = "Featherweight";
        }
        else if (this.weight<=220) {
            weightClass = "Lightweight";
        }
        else if (this.weight<=240) {
            weightClass = "Welterweight";
        }
        else {
            weightClass = "Heavyweight";
        }
        return weightClass;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setWeightFromLbsToKg(double weight){
        weight =(weight)*(2.205);
        this.weight = weight;
    }
    public  void setPR(int pr){
        int adjustor;
        if (this.age<18){
            adjustor = (int)((pr)*(1.11));
        }
        else if (this.age<=39) {
            adjustor = pr;
        }
        else if (this.age<=44) {
            adjustor = (int)((pr)*(1.05)) ;
        }
        else if (this.age<=49){
            adjustor = (int)((pr)*(1.11)) ;
        }
        else if (this.age<=54) {
            adjustor = (int)((pr)*(1.18)) ;
        }
        //add more after
        else{
            adjustor = (int)((pr)*(1.67)) ;
        }
        this.pr = adjustor;
    }
    Scanner scanner = new Scanner(System.in);
    public String tenRepMax(int ten){
        int oneRepMax;
        oneRepMax = (int) ((ten)*(1.33));
        setPR(oneRepMax);
        return "Your Personal Record is "+ oneRepMax;

    }
    public String fiveRepMax(int five){
        int oneRepMax;
        oneRepMax = (int) ((five)*(1.167));
        setPR(oneRepMax);
        return "Your Personal Record is "+ oneRepMax;

    }
    public String toString(){
        return "Your Personal Record is "+ pr;
    }
    public void knowledgeOfPR(){
        System.out.println("Pick one of the choices below according to your knowledge of your lift of choice");
        System.out.println("\t"+"One Rep Max: 1"+"\t"+"Five Rep Max: 2"+"\t"+"Ten Rep Max: 3");
        int choice = scanner.nextInt();
        if (choice==1){
            System.out.println("What is your personal record? (If you only know in KG press 1)");
            int pr = scanner.nextInt();
            if (pr==1){
                pr =(int) ((pr)*(2.205));
            }
            setPR(pr);
            System.out.println("Your Personal Record is "+ pr + " very impressive");
        }
        if (choice==2){
            System.out.println("What is your five rep max? (If you only know in KG press 1)");
            int five = scanner.nextInt();
            if (five==1){
                five = (int) ((five)*(2.205));
            }
            System.out.println(fiveRepMax(five));
        }
        if (choice==3){
            System.out.println("What is your ten rep max?(If you only know in KG press 1)");
            int ten = scanner.nextInt();
            if (ten==1){
                ten = (int)((ten)*(2.205));
            }
            System.out.println(tenRepMax(ten));
        }
    }
    public void rank (){
        if (this.sex.equalsIgnoreCase("male")){
            switch (this.getWeightClassMale()){
                case ("Flyweight"):
                {
                    if (this.pr<=176){
                        System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                    } else if (this.pr<=187) {
                        System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                    }
                    else if (this.pr<=262) {
                        System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                    }else if (this.pr<=339) {
                        System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                    }
                    else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                }
                break;
                case ("Bantamweight"):{
                    if (this.pr<=199){
                        System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                    } else if (this.pr<=211) {
                        System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                    }
                    else if (this.pr<=295) {
                        System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                    }else if (this.pr<=376) {
                        System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                    }
                    else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                }
                break;
                case ("Featherweight"):{
                    if (this.pr<=218){
                        System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                    } else if (this.pr<=231) {
                        System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                    }
                    else if (this.pr<=326) {
                        System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                    }else if (this.pr<=411) {
                        System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                    }
                    else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                }
                break;
                case ("Lightweight"):{
                    if (this.pr<=234){
                        System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                    } else if (this.pr<=251) {
                        System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                    }
                    else if (this.pr<=356) {
                        System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                    }else if (this.pr<=445) {
                        System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                    }
                    else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                }
                break;
                case("Welterweight"):
                {
                    if (this.pr<=239){
                        System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                    } else if (this.pr<=265) {
                        System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                    }
                    else if (this.pr<=377) {
                        System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                    }else if (this.pr<=468) {
                        System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                    }
                    else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                }
                break;
                case ("Heavyweight"):
                {
                    if (this.pr<=294){
                        System.out.println("You are in the 50th %, you lift more than 50% of the population, in your weightclass!");
                    } else if (this.pr<=321) {
                        System.out.println("You are in the 25th %, you lift more than 75% of the population in your weightclass!");
                    }
                    else if (this.pr<=462) {
                        System.out.println("You are in the 10th %, you lift more than 90% of the population in your weightclass!");
                    }else if (this.pr<=501) {
                        System.out.println("You are in the 5th %, you lift more than 95% of the population in your weightclass!");
                    }
                    else {System.out.println("You are in the 1th %, you lift more than 99% of the population in your weightclass!");}
                }
            }
        }
    }
}
