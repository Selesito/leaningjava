package leaningjava.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        // проверить, что эталон больше, чем элемент. записать в эталон элемент массива.
        for (int index = start; index < finish; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}

