package leaningjava.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        /**
         * Такое приведения типов называется понижающим приведение (down casting).
         * Мы приводим конкретный тип к более общему типу данных.
         * Если посмотреть на схему, то мы как бы опускаемся вниз.
         */
        StudentOne st = freshman;
        Object ogj = freshman;
    }
}
