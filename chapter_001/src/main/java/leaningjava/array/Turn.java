package leaningjava.array;

public class Turn {
    public int[] back(int[] array) {
        for (int index =0;index!=array.length/2;index++) {
            int tmp = array[index];
            array[index]=array[array.length - index - 1];
            array[array.length - index - 1]=tmp;
        }
        return array;
    }

}


//for (int j =1;j < array.length;j++){
//        if(array[i] > array[j]) {
//        int tmp = array[i];
//        array[i]=array[j];
//        array[j]=tmp;
//        }
//        }