package Assignment4;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args)  {

        List<Game> gamesList = new ArrayList<>();
        ClashRoyale clashRoyale = new ClashRoyale("ClashRoyale");
        ClashRoyale clashRoyale2 = new ClashRoyale("ClashRoyale2");

        RacingGame racingGame = new RacingGame("RacingGame");
        Fifa fifa = new Fifa("Fifa");
        gamesList.add(racingGame);
        gamesList.add(clashRoyale);
        gamesList.add(fifa);
        gamesList.add(clashRoyale2);
        Player mayar = new Player("Mayar", gamesList);
        racingGame.setPlacement(1.0);
        clashRoyale.setLossesandWins(8.0,5.0);
        fifa.setGoals(3.0,2.0);
        System.out.println("Player: " + mayar.getUsername());
        System.out.println();
        for (Game game : gamesList) {
            System.out.println("Game: "+game.getGame());
            try {
                System.out.println("Score: "+game.getScore());
            }
            catch (ScoreNotSetException e){
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
        System.out.println("End of Score Report.");
        System.out.println();
        List <Game> gameListBrandon = new ArrayList<>();

        gameListBrandon.add(racingGame);
        gameListBrandon.add(clashRoyale);
        gameListBrandon.add(fifa);
        Player brandon = new Player("Brandon",gameListBrandon);

        racingGame.setPlacement(null);
        clashRoyale.setLossesandWins(null,null);
        fifa.setGoals(null,null);
        System.out.println("Player: " + brandon.getUsername());
        System.out.println();
        for (Game game : gamesList) {
            System.out.println("Game: "+game.getGame());
            try {
                System.out.println("Score: "+game.getScore());
            }
            catch (ScoreNotSetException e){
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
        System.out.println("End of Score Report.");
        System.out.println();
        List <Game> gameListJoel = new ArrayList<>();

        gameListJoel.add(racingGame);
        gameListJoel.add(clashRoyale);
        gameListJoel.add(fifa);
        Player joel = new Player("Joel",gameListJoel);
        clashRoyale.setLossesandWins(5.0,2.0);
        fifa.setGoals(100.0,3.0);
        racingGame.setPlacement(null);
        System.out.println("Player: " + joel.getUsername());
        System.out.println();
        for (Game game : gamesList) {
            System.out.println("Game: "+game.getGame());
            try {
                System.out.println("Score: "+game.getScore());
            }
            catch (ScoreNotSetException e){
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
        System.out.println("End of Score Report.");
        System.out.println();
    }
}
