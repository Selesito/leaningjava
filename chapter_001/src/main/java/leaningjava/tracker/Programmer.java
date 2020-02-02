package leaningjava.tracker;

public class Programmer extends Engineer {
    private int experience;
    private String programming;

    public Programmer(String name, String surname, String education, String birthday, String programming, int experience) {
        super(name, surname, education, birthday);
        this.programming = programming;
        this.experience = experience;
    }

    public String getProgramming() {
        return programming;
    }
}
