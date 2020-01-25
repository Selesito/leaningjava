package leaningjava.condition;

import ru.job4j.condition.Point;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        double perimeter = (a + b + c) / 2;
        return perimeter;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance3d(second);
        double b = first.distance3d(third);
        double c = second.distance3d(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            double four = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            rsl = four;
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return
     */
    private boolean exist(double a, double c, double b) {
        boolean result = a + c > b && c + b > a && a + b > c;
        return result;
    }
}






//public class Triangle {
//
//    public static boolean exist(double ab, double ac, double bc) {
//        boolean result = ab + ac > bc && ac + bc > ab && ab + bc > ac;
//        return result;
//    }
//}
