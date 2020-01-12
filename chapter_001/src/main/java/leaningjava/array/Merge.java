package leaningjava.array;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, index = 0;
        while (index < rsl.length) {
            if (i > left.length - 1) {
                rsl[index] = right[j];
                j++;
            } else if (j > right.length - 1) {
                rsl[index] = left[i];
                i++;
            } else if (left[i] < right[j]) {
                rsl[index] = left[i];
                i++;
            } else {
                rsl[index] = right[j];
                j++;
            }
            index++;
        }
        return rsl;
    }

    public static void main(String[] args) {

    }
}


