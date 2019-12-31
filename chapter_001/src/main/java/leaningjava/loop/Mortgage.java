package leaningjava.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
         while (true) {
            amount= (int) (amount + (amount * (percent/100)));
            amount = amount - salary;
            year++;
            if (amount < 0)break;
        }
        return year;
    }

}
