package leaningjava.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alex");
        student.setSurname("Ivanov");
        student.setGroup("SO-31");
        student.setCreated(new Date());

        System.out.println(student.getName() + " " + student.getSurname() + " поступил в группу " + student.getGroup() + " в " + student.getCreated());

    }
}
