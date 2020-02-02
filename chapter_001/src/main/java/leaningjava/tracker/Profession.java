package leaningjava.tracker;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Dentist dentist = new Dentist("Vasya", "Petrov", "Высшее", "21.02.1998", "M");
        System.out.println(dentist.getName());
        Programmer programmer = new Programmer("Ivan", "Petrov", "Высшее", "21.02.1998",
                "C++", 7);
        System.out.println(programmer.getName() + " " + "язык програмированния" + " " + programmer.getProgramming());

    }
}
