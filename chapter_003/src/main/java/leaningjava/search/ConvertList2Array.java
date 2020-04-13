package leaningjava.search;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil(list.size()  / (rows * 1.0));
        int[][] array = new int[rows][cells];
        int indexRow = 0, indexCell = 0;
        for (Integer i : list) {
            if (indexCell == (cells)) {
                indexRow++;
                indexCell = 0;
            }
            array[indexRow][indexCell++] = i;
        }
        return array;
    }
}
