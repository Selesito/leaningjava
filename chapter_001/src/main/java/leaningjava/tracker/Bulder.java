package leaningjava.tracker;

public class Bulder extends Engineer {
    private int years;

    public Bulder(String name, String surname, String education, String birthday, int years) {
        super(name, surname, education, birthday);
        this.years = years;
    }

    public int getYears() {
        return years;
    }
}
