package leaningjava.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double credit=0;
        double sum = 0;
        double remains=amount;
        double percentСredit =  (percent/100);
        while (true) {
            credit=  (remains + (remains * percentСredit));
            sum = credit - salary;
            remains = sum;
            year++;
            if (remains < 0)break;
        }
        return year;
    }

}
