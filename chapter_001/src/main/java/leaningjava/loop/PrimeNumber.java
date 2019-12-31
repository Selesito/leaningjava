package leaningjava.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int number=0;

        for (int i = 2; i <= finish; i++) {
            int count = 0;
            for (int x = 1; x <= finish; x++) {

                if (i % x == 0){
                    count++;
                }

            }
            if (count==2){
                number++;
            }

        }
        return number;
    }

}
