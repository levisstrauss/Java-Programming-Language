package OOP.Abstraction;

public class Child  extends Human {
    public Child(String name, String country, String race, String profession) {
        super(name, country, race, profession);
    }

    @Override
    public void skills(String other) {
        System.out.println(other);
    }

    public void talent() {
        System.out.println("Child talent");
    }

    // Avoid the DRY principle which is don't repeat yourself

}
