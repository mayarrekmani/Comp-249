package WeightLiftingStatistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        String name;
        String sex;
        int age;
        int weight;
        Weights person = new Weights();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t"+"Welcome to Mayar's Weightlifting Program!");
        System.out.println();
        System.out.println("What is your name?");
        name = scanner.next().toUpperCase();
        System.out.println();
        System.out.println("Hello "+ name+" how old are you?");
        age = scanner.nextInt();
        person.setAge(age);
        System.out.println();
        System.out.println("What was your sex given at birth?");
        sex = scanner.next();
        person.setSex(sex);
        System.out.println();
        System.out.println("How much do you weigh(in LBs)?(If you only know in Kg's type 1)");
        weight = scanner.nextInt();{
        if (weight==1){
            System.out.println();
            System.out.println("What is your weight in Kg's?");
            weight = scanner.nextInt();
            person.setWeightFromLbsToKg(weight);
        }
        else {person.setWeight(weight);}}
        System.out.println();
        System.out.println("To find your placement in powerlifting lifts pick one of the options below:");
        System.out.println("\t"+"Squat: 1"+"\t"+"Bench: 2"+"\t"+"Deadlift: 3");
        choice=scanner.nextInt();
        while (choice!=0) {
            if (choice==1) {
                Squat s = new Squat(person);
                s.knowledgeOfPR();
                s.rank(s);
            }
            System.out.println();
            System.out.println("To find your placement in powerlifting lifts pick one of the options below:");
            System.out.println("\t"+"Squat: 1"+"\t"+"Bench: 2"+"\t"+"Deadlift: 3");
            choice = scanner.nextInt();
        }
    }
}
