package Assignment7;

public class Candidate implements Ordered<Candidate> {
    private String name;
    private int score;
    public Candidate(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean precedes(Candidate other) {
        return this.score<other.getScore();
    }

    @Override
    public boolean follows(Candidate other) {
        return this.score>other.getScore();
    }
}
