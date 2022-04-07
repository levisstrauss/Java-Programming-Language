package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {

        // Here are your both parent
        Parent father = new Parent("Very calm", "bob");

        Child child = new Child("Student");
        child.setName("Tant");
        child.setBehavior("Very nervous");

    }
}
