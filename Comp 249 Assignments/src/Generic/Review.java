package Generic;

public class Review <T>{
    private String courseName;
    private T rating;

    public Review(String courseName, T rating){
        this.courseName = courseName;
        this.rating = rating;
    }

    public void setRating(T rating) {
        this.rating = rating;
    }
}
