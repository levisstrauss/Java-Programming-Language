package OOP.Abstraction;

// Because Parent is a human
public class Parent  extends Human{

    public Parent(String name, String country, String race, String profession) {
        super(name, country, race, profession);
    }

    @Override
    public void skills(String other) {
        System.out.println(other);
    }

}
