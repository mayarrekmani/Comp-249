package Assignment10;

import java.util.Scanner;

public class Node {
    private String name;
    private Node north, south, east, west;

    public Node(String name) {
        this.name = name;
    }
    public String getDirections(){
        boolean or = false;
        String output =this+"\n";
        if (this.name.equalsIgnoreCase("L")){
            output+= "Congratulations! You have reaches the finish.";
            return output;
        }
        output += "You can go ";
        if (this.north!=null){
            output +=" north";
            or = true;
        }
         if (this.south!=null) {
            if (or){
                output+=" or ";
            }
            else {
                or =true;
            }
            output +=" south";
        }
         if (this.west!=null){
            if (or){
                output+=" or ";
            }
            else {
                or =true;
            }
            output +=" west";
        }
         if (this.east!=null) {
            if (or){
                output+=" or ";
            }
            else {
                or =true;
            }
            output +=" east";
        }
        output+=".";
        return output;
    }
    public static void setUpMaze(Node A, Node B, Node C, Node D, Node E, Node F, Node G, Node H, Node I, Node J, Node K, Node L) {
        A.east = B;
        A.south = E;

        B.west = A;
        B.south = F;

        C.east = D;
        C.south = G;

        D.west = C;

        E.north = A;
        E.south = I;

        F.north = B;
        F.east = G;

        G.north = C;
        G.east = H;
        G.south = K;
        G.west = F;

        H.south = L;
        H.west = G;

        I.north = E;
        I.west = J;

        J.east = I;

        K.west = G;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");
        Node H = new Node("H");
        Node I = new Node("I");
        Node J = new Node("J");
        Node K = new Node("K");
        Node L = new Node("L");

        setUpMaze(A,B,C,D,E,F,G,H,I,J,K,L);
        Node current = A;

        while (true){
            System.out.println(current.getDirections());
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("e")&&current.east!=null){
                current =current.east;
            }
            else if (input.equalsIgnoreCase("s")&&current.south!=null){
                current = current.south;
            }
            else if (input.equalsIgnoreCase("w")&&current.west!=null){
                current = current.west;
            }
            else if (input.equalsIgnoreCase("n")&&current.north!=null) {
                current=current.north;
            }
            else {
                System.out.println("That is not a valid direction, try again.");

            }
            if (current.getName().equals("L")){
                current.getDirections();
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "You are in room "+this.name.toUpperCase()+" of twisty little passages, all alike.";
    }
}
