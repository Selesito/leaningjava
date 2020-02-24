package leaningjava.pojo;

public class Library {
    public static void main(String[] args) {
        Book pushkin = new Book("Pushkin", 120);
        Book lermontov = new Book("Lermontow", 132);
        Book tolstoi = new Book("Tolstoi", 102);
        Book cleanCode = new Book("CleanCode", 56);

        Book[] lib = new Book[4];

        lib[0] = pushkin;
        lib[1] = lermontov;
        lib[2] = tolstoi;
        lib[3] = cleanCode;

        for (int index = 0; index < lib.length; index++) {
            Book pr = lib[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }

        Book rsl = lib[0];
        lib[0] = lib[3];
        lib[3] = rsl;
        System.out.println("Переставил ячейки 0 и 3");

        for (int index = 0; index < lib.length; index++) {
            Book pr = lib[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println("Вывод кнги с именем CleanCode");

        for (int index = 0; index < lib.length; index++) {
            Book pr = lib[index];
            if (pr.getName().equals("CleanCode")) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }

    }
}
