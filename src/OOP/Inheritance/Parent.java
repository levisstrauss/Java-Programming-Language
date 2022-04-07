package OOP.Inheritance;

public class Parent {
    // Properties
    private String behavior;
    private String name;

    //Constructor
    // This constructor will always be called when we create a new instance of an object
    public Parent(String behavior, String name) {
        this.behavior = behavior;
        this.name = name;
    }
    // Getters and setters which are accessors and mutators


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //For getting the behavior
    public String getBehavior() {
        return behavior;
    }

    //For setting the behavior
    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }
}
