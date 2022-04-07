package OOP.Abstraction;

//Generalization

public abstract class Human {

    // An abstraction is just the way we generalize things
    // We know that human has a name, a country, a race, a profession
    private String name;
    private String country;
    private String race;
    private String profession;

    // Constructor

    public Human(String name, String country, String race, String profession) {
        this.name = name;
        this.country = country;
        this.race = race;
        this.profession = profession;
    }

    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    // They don't have a body
    public abstract void skills(String other);

}
