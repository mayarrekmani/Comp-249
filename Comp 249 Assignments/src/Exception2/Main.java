package Exception2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidAmountException, InsufficientFundsException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to CodeBank");
        BankAccount alice = new BankAccount("alice",8);
        BankAccount bob = new BankAccount("bob", 3);
        while (true) {
            try {
                int x = scanner.nextInt();
                System.out.println("Attempting transfer of $"+x+" from "+alice.getAccountHolder()+" to "+bob.getAccountHolder());
                alice.transferTo(bob, x);
                System.out.println("Transfer succesful!"+alice.getAccountHolder()+": "+alice.getBalance()+" | "+bob.getAccountHolder()+": "+bob.getBalance());
                break;
            }
            catch (InvalidAmountException e){
                System.out.println("ERROR: "+e.getMessage());
            }
            catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage() + alice.getAccountHolder());
            }
        }
        bob.withdraw(30);
    }
}
