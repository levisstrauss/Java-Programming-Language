package AdvancedConcepts.Generics;

public class Main {
    public static void main(String[] args) {

        // Integer, Float, Boolean
        Generics list = new Generics<Integer>();
        list.add(45);
        int number = (int) list.get(0);


        // For the comparable interface
        var user1 = new User(10);
        var user2 = new User(20);
        if(user1.compareTo(user2) < 0){
            //do something
        }else if (user1.compareTo(user2) < 0){
            // do something
        }

    }
}
