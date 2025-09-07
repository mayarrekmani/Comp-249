package Assignment6;

public class Main {

    public static void main(String[] args) {
        int complexity = 4;
        int level =1;
        System.out.println("New Ticket Received: ");
        System.out.println("Issue: Unable to connect to VPN");
        System.out.println("Complexity Level: "+complexity);
        System.out.println();
       Tickets tickets =  new Tickets();
       tickets.ticketEscalation(level,complexity);
       System.out.println();
       System.out.println("Call Stack (Top to Bottom):");
       tickets.stackTrace(level,complexity);
       tickets.ticketEscalationLoop(level,complexity);
    }
}
