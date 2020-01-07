package leaningjava.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int number=0;

        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                number++;
            }
        }
        return number;
    }

}
