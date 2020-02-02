package leaningjava.tracker;

public class Dentist extends Doctor {
    private String gender;

    public Dentist(String name, String surname, String education, String birthday, String gender) {
        super(name, surname, education, birthday);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
