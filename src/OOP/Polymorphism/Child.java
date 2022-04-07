package OOP.Polymorphism;

public class Child  extends Parent {
    // Avoid the DRY principle which is don't repeat yourself

    @Override
    public void skill(String other) {
        System.out.println("Child is very good at dancing" + " and also at" + other);
    }
}
