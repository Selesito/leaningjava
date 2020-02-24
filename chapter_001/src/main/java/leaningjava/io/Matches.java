package leaningjava.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 11;
        System.out.println("Игра 11 спичек!");
        System.out.println("Два игрока по очереди берут от 1 до 3 спичек.");
        while (true) {
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("Вы ввели некоректное чило, введите от 1 до 3!");
                continue;
            }
            value = value - select;
            if (value <= 0) {
                System.out.println("Осталось 0 спичек");
                System.out.println("Вы победили!");
                break;
            }
            System.out.println("Осталось " + " " + value + " " + "спичек");
        }
    }
}
