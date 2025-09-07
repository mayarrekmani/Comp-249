package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String username;
    List<Game> gamesList = new ArrayList<>();
    public Player(String username, List<Game> gamesList){
        this.username = username;
        this.gamesList = gamesList;
    }

    public String getUsername() {
        return username;
    }
}
