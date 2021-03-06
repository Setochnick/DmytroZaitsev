package DmytroZaitsev.HW4.professions;

public class Driver  extends Person{

    private String name;
    private int experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(String name, int experience, String fullName, int age) {
       super(fullName, age);
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
