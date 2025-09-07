package Assignment9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeShopFeedback {
    public static void main(String[] args) {
        ArrayList<Feedback<Integer>> customerFeedback = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        System.out.println("Welcome to CoffeeShop Feedback Tracker!");
        System.out.println();
        while (true) {
            try {
                do {
                    System.out.print("Enter customer name: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter feedback: ");
                    String feedback = scanner.nextLine();
                    System.out.print("Enter rating (1-5) or 0 for no rating: ");
                    int rating = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    if (rating > 5 || rating < 0) {
                        throw new InvalidInput();
                    }
                    System.out.print("Add another? (yes/no): ");
                    input = scanner.nextLine();
                    customerFeedback.add(new Feedback<>(username, feedback, rating));
                }
                while (input.equalsIgnoreCase("yes"));
                break;
            } catch (InvalidInput e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("It must be a number!");
                scanner.nextLine();
            }
        }
        System.out.println("---Feedback Entries---");
        for (int i = 0; i < customerFeedback.size(); i++) {
            Feedback customer = customerFeedback.get(i);
            System.out.println(customer);
        }
        System.out.println("Total feedback entries: " + customerFeedback.size());
        String inputOfFeedback;

        System.out.print("Would you like to update any feedback?(yes/no): ");
        inputOfFeedback = scanner.nextLine();
        if (inputOfFeedback.equalsIgnoreCase("yes")) {
            System.out.print("Enter name to update: ");
            String username = scanner.nextLine();
            Feedback userToBeChanged = null;
            boolean personExists = false;
            for (Feedback user : customerFeedback) {
                if (user.getCustomerName().equalsIgnoreCase(username)) {
                    userToBeChanged = user;
                    personExists = true;
                    break;
                }
            }
            if (!personExists) {
                System.out.println("User does not exist");

            } else {
                System.out.print("Enter new message: ");
                String message = scanner.nextLine();
                userToBeChanged.setFeedbackMessage(message);
                while (true) {
                    try {
                        System.out.print("Enter new rating (1-5) or 0: ");
                        int rating = scanner.nextInt();
                        if (rating > 5 || rating < 0) {
                            throw new InvalidInput();
                        }
                        scanner.nextLine();
                        userToBeChanged.setRating(rating);
                        break;
                    } catch (InvalidInput e) {
                        System.out.println(e.getMessage());
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("It must be a number!");
                        scanner.nextLine();
                    }
                }

            }
        }
        System.out.print("Would you like to delete any feedback? ");
        String deleteFeedback = scanner.nextLine();
        if (deleteFeedback.equalsIgnoreCase("yes")){
            System.out.print("Enter user to delete their feedback: ");
            String deletedUser = scanner.nextLine();
            for (Feedback user : customerFeedback){
                if (user.getCustomerName().equalsIgnoreCase(deletedUser)){
                    customerFeedback.remove(user);
                    break;
                }
            }
        }
        System.out.println("--- Final Feedback List (using for-each) ---");
        for (Feedback finalUsers : customerFeedback){
            System.out.println("Name: "+finalUsers.getCustomerName()+" - Message: "+finalUsers.getFeedbackMessage()+" - Rating: "+finalUsers.getRating());
        }

    }
}
