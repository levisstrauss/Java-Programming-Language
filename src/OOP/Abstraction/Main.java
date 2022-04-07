package OOP.Abstraction;

public class Main {
    public static void main(String[] args) {

        Parent father = new Parent("Bob", "New York", "Black", "Teacher");
        Child child = new Child("Belly", "New York", "Black", "Student");


        System.out.println(father.getCountry());

        child.skills("Dancing");
        father.skills("Teacher");




    }
}
