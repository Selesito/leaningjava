package leaningjava.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = false;
        for ( int i = 2; i < finish;i++) {
           if (finish % i == 0) {
               prime = false;
               break;
           }else prime=true;

        }
        return prime;
    }


}
