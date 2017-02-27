package ru.geekbrains.java.lesson22;

import java.util.Arrays;

public class StringArrayToIntSumm {
    private int[][] arr = new int[4][4];
    private long summ=0L;

    public StringArrayToIntSumm(String[][] arr) throws MyArrayException {
        if (arr.length == 4) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) throw new MyArraySizeException();
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        this.arr[i][j]=Integer.parseInt(arr[i][j]);
                    } catch (Exception e) {
                        throw new MyArrayDataException (i,j);
                    }
                }
            }
        } else {
            throw new MyArraySizeException();
        }
        Arrays.stream(this.arr).forEach(e -> Arrays.stream(e).forEach(e1 -> add(e1))); //попробовал использовать лямбду, может быть хотябы вскользь затронем эту тему?
    }

    private void add (int element){
        summ+=element;
    }

    public long getSumm() {
        return summ;
    }
}
