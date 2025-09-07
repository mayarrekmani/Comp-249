import java.util.Scanner;

public class Room {
    private String name;
    Room north,south,west,east;

    public String getName() {
        return name;
    }
    public Room(String name){
        this.name = name;
    }

    public String getDirections(){
        String output = "You are in the "+ this.name;
        if (this.name.equalsIgnoreCase("Treasure Chamber")){
            output+="\n"+"Congratulations! You found the treasure and escaped the castle!";
            return output;
        }
        output+="\n"+"Available directions: ";
        if (this.east!=null){
            output+="e ";
        }
        if (this.south!=null){
            output+="s ";
        }
        if(this.north!=null){
            output+="n ";
        }
        if (this.west!=null){
            output+="w ";
        }
        return output;
    }
    public static void castle(Room entrance, Room hall, Room tower, Room galery, Room dungeon, Room treasureChamber){
        entrance.east = tower;
        entrance.south = hall;
        hall.east = galery;
        hall.south = dungeon;
        dungeon.north = hall;
        tower.west = entrance;
        tower.south = galery;
        galery.north =tower;
        galery.east = treasureChamber;
        galery.west = hall;
    }

    public static void main(String[] args) {
        Room entrance = new Room("Entrance");
        Room tower = new Room("Tower");
        Room galery = new Room("Galery");
        Room hall = new Room("Hall");
        Room dungeon = new Room("Dungeon");
        Room treasureChamber = new Room("Treasure Chamber");
        castle(entrance,hall,tower,galery,dungeon,treasureChamber);
        Room current = entrance;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(current.getDirections());
            System.out.print("Enter direction: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("s")&&current.south!=null){
                current = current.south;
            }
            else if (input.equalsIgnoreCase("w")&&current.west!=null){
                current = current.west;
            } else if (input.equalsIgnoreCase("e")&&current.east!=null) {
                current=current.east;
            } else if (input.equalsIgnoreCase("n")&&current.north!=null) {
                current = current.north;
            }
            if (current.getName().equalsIgnoreCase("Treasure Chest")){
                System.out.println(current.getDirections());
                break;
            }
        }
    }
}
