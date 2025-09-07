package Exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int tickets1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to CineCode Cinema!");
        while (true) {
            try {
                System.out.print("Enter your age: ");
                int age = scanner.nextInt();
                if (age < 0) {
                    throw new NegativeAgeException(" age cannot be negative ");
                }
                else if (age<10){
                    System.out.println("Children under 10 must be with an adult");
                }
                break;
            } catch (NegativeAgeException e) {
                System.out.println("Error" + e.getMessage());
            }
        }
        while (true){
            try {
                System.out.print("Enter number of tickets: ");
                int tickets = scanner.nextInt();


                if (tickets>6){
                    throw new TooManyTicketsException(" Cannot book more than 6 tickets at once");
                }
                System.out.println("Booking confirmed for "+tickets+" ticket(s). Enjoy your movie!");
                break;

            }

            catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            } catch (TooManyTicketsException e) {
                System.out.println("ERROR"+ e.getMessage());
            }

        }


    }
}
