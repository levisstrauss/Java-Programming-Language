package OOP.Inheritance;

public class Child  extends Parent{
    private String profession;

    public Child(String  profession) {
        super("behavior" , "name");
        this.profession =  profession;
    }
}
