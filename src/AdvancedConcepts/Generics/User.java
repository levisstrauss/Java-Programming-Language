package AdvancedConcepts.Generics;
// Comparable interface

// NB: we can only declare a generic method inside a none generic class
public class User implements Comparable<User>{
    private int points;
    public User(int points) {
        this.points = points;
    }
    @Override
    public int compareTo(User other) {
        return points - other.points;
    }
}

