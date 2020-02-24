package leaningjava.tracker;

public class Surgeon extends Doctor {
    private int experience;

    public Surgeon(String name, String surname, String education, String birthday, int experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

}
