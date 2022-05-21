package com.company.Array.ExamcloudsCom;

//код, реализующий такой массив. При объявлении двумерного массива необходимо задать количество
// элементов только для первой размерности - int[][] array = new int[4][].
// Таким образом, мы указываем количество строк в массиве, но под каждую строку память не выделяем.
// Далее выделяем отдельно память под каждую строку массива.
// Например, строка с индексом ноль будет размера 1 - array[0] = new int[1].

public class TwoDArray2 {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];
        for (int i=0; i< array.length; i++) {
            for (int j=0; j< array[i].length;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
