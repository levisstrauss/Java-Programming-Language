package OOP.Objects;

public class Main {
    public static void main(String[] args) {

        // Here are your both parent
        Parent  mother = new Parent("Alya", "New York", "Very calm");
        Parent father = new Parent("Kevin", "Penn", "Very sever");

        // The child
        Child child = new Child("Biba", "New York", "very calm");

        System.out.println(child.getName() + " is the child of " + father.getName() + " and " + mother.getName());
        System.out.println(child.getName() + " father " + father.getName() + " is very " + father.getBehavior());
        System.out.println(child.getName() + " mother " + mother.getName() + " is very " + mother.getBehavior());
        System.out.println(child.getName() + "'s mother came from" + mother.getCountry());
        System.out.println(child.getName() + "'s father came from" + father.getCountry());
    }
}
