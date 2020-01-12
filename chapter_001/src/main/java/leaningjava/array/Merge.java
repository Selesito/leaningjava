package leaningjava.array;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int index = 0; index < left.length; index++) {
            rsl[index] = left[index];
        }
        for (int index = 0; index < right.length; index++) {
            rsl[left.length + index] = right[index];
        }
        SortSelected.sort(rsl);


        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}


