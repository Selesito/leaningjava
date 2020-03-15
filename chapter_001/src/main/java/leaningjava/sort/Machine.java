package leaningjava.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = money - price;
        int count = 0;
        for(int index = 0; index < COINS.length; index++) {
            while (true) {
                if (size >= COINS[index]  && size % COINS[index] >= 0 ) {
                    size = size - COINS[index];
                    rsl[index] = COINS[index];
                    count ++;
                } else break;
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}

