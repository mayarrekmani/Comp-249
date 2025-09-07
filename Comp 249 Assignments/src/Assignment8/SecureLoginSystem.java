package Assignment8;

import java.util.*;

public  class SecureLoginSystem {
    Scanner scanner = new Scanner(System.in);
    private LoginLogger logger = new LoginLogger();
    protected ArrayList<Pair<String>> userAccounts = new ArrayList<>();
         static class PasswordRules {
            public static boolean isStrongPassword(String password) {
                char[] validity = password.toCharArray();
                int validCharacters = 8;
                boolean length = false;
                if (validity.length>=validCharacters){
                    length =true;
                }
                boolean uppercase = false;
                boolean lowercase = false;
                boolean number = false;
                for (char c : validity){
                    if (Character.isUpperCase(c)){
                        uppercase = true;
                    }
                    else if (Character.isLowerCase(c)) {
                        lowercase= true;
                    }
                    else if (Character.isDigit(c)) {
                        number = true;
                    }
                }
                return length&&uppercase&&lowercase&&number;
            }
        }
        public class LoginLogger{
        private final List<String> log = new ArrayList<>();
        public void  logAttempt(String username, boolean success){
            String registrationStatus ="";
            if (success){
                System.out.println("Login succesful.");
                registrationStatus = "SUCCESS";
            }
            else {
                System.out.println("Login Unsuccesful.");
                registrationStatus = "FAILURE";
            }
            log.add("User: "+ username+" - "+registrationStatus);
        }
        public void printAttempts(){
            System.out.println("Login Log: ");
            for (String log : log){
                System.out.println(log);
            }
        }
        }
        interface OneTimeChallenge{
            boolean passSecurityTest();
        }
        public  void register(){
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            if (!PasswordRules.isStrongPassword(password)){
                System.out.println("Password is not valid it must have 8 or more characters, one uppercase, one lowercase and a number.");
                return;
            }
            userAccounts.add(new Pair<>(username,password));
            System.out.println();
            System.out.println("Registration succesful!");
        }
        public void login()  {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            boolean userExists = false;
            for (Pair <String> account : userAccounts){
                if (account.getUsername().equalsIgnoreCase(username)&&account.getPassword().equals(password)){
                    userExists = true;
                    break;
                }
            }


            if (userExists){
                OneTimeChallenge securityQuestion = new OneTimeChallenge() {

                    @Override
                    public boolean passSecurityTest() {
                        Random random = new Random();
                        int a = random.nextInt(10)+1;
                        int b = random.nextInt(10)+1;
                        System.out.print("Security Check: What is "+a+" + "+b+ "? ");
                        int x = a+b;
                        int answer = scanner.nextInt();
                        return answer==x;
                    }
                };
                logger.logAttempt(username, securityQuestion.passSecurityTest());
            }
            else {
                System.out.println("Login failed. Invalid inputs.");
            }

        }


        public void loginSystemRun() {
            System.out.println("Welcome to SecureLoginSystem");
        while (true) {
            System.out.print("Do you want to (1) Register or (2) Login? ");

            try {
                int input = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (input == 1) {
                    register();
                } else if (input == 2) {
                    login();

                    while (true) {
                        System.out.println("\nSecureLoginSystem Menu");
                        System.out.print("Do you want to (1) Register, (2) Login, or (3) View Login Log? ");

                        try {
                            int logInput = scanner.nextInt();
                            scanner.nextLine(); // consume newline

                            if (logInput == 1) {
                                register();
                            } else if (logInput == 2) {
                                login();
                            } else if (logInput == 3) {
                                logger.printAttempts();
                                System.exit(0); // exit the login submenu
                            } else {
                                throw new InputMismatchException();
                            }

                        } catch (InputMismatchException e) {
                            System.out.println("Must be a valid number (1, 2, or 3).");
                            scanner.nextLine(); // clear invalid input
                        }
                    }
                } else {
                    throw new InputMismatchException();
                }

            } catch (InputMismatchException e) {
                System.out.println("Must be a valid number (1 or 2).");
                scanner.nextLine(); // clear invalid input
            }
        }
    }

    public static void main(String[] args) {
        SecureLoginSystem run = new SecureLoginSystem();
        run.loginSystemRun();
    }

}

