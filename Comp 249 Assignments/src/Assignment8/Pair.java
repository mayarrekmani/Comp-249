package Assignment8;

import java.util.ArrayList;

public class Pair<T> {
    private T username;
    private T password;

    public Pair(T username, T password) {
        this.username = username;
        this.password = password;
    }
    public T getUsername() {
        return username;
    }

    public T getPassword() {
        return password;
    }

    public void setPassword(T password) {
        this.password = password;
    }

    public void setUsername(T username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
