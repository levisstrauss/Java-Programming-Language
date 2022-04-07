package OOP.Objects;

public class Child {

    // Properties
    private String name;
    private String country;
    private String behavior;

    //Constructor
    // This constructor will always be called when we create a new instance of an object
    public Child(String name, String country, String behavior) {
        this.name = name;
        this.country = country;
        this.behavior = behavior;
    }
    // Getters and setters which are accessors and mutators
    //For getting the name
    public String getName() {
        return name;
    }
    //For setting the name
    public void setName(String name) {
        this.name = name;
    }
    //For getting the country
    public String getCountry() {
        return country;
    }
    //For setting the country
    public void setCountry(String country) {
        this.country = country;
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
