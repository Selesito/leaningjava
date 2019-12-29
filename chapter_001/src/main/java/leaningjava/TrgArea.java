package leaningjava;

public class TrgArea {
    public static double area (double a, double b, double c) {
        double perimeter = (a + b + c)/2;
        double four = Math.sqrt(perimeter * (perimeter-a) * (perimeter-b) * (perimeter-c));
        return four;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2,2);
        System.out.println("area (2, 2, 2 = " + rsl);
    }
}
