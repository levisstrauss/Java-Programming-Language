package OOP.Interfaces;

public class Parent implements Weather {
    @Override
    public void running(String name) {
        System.out.println("Francs");
    }
    @Override
    public void running() {
        System.out.println("Iam running!");
    }
    @Override
    public void crying() {
        System.out.println("Iam Crying!");
    }
    @Override
    public void studying() {
        System.out.println("Iam Studying!");
    }
}
