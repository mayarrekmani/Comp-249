package Assignment7;

public interface Ordered<T> {
    boolean precedes(T other);
    boolean follows(T other);

}
