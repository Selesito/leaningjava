package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow((x2 - x1), 2);
        double second = Math.pow((y2 - y1), 2);
        double result = Math.sqrt(first + second);

        return result;
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 3, 4);
        System.out.println("result (4, 0) to (3, 0) " + result);
        result = distance(2, 0, 3, 2);
        System.out.println("result (2, 0) to (3, 2) " + result);
        result = distance(2, 0, 3, 0);
        System.out.println("result (0, 0) to (3, 2) " + result);
    }
}
