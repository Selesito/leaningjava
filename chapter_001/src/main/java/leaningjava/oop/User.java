package leaningjava.oop;

public class User {
    /**
     * Это поле обьекта, доступно только конретному обьекту из за "private".
     * Переменные класса и переменные экземпляра являются полями,
     * а локальные переменные и переменные параметров-нет.
     */
    private String name;
    private int age;

    public boolean canDrive() {
        /**
         * can - это локальная переменная.
         */
        boolean can = false;
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}

