package com.company.Array.ExamcloudsCom.Metod;

//Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока для инициализации.
//Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
//Распечатать массив, содержащий максимальное и минимальное значение.

public class job_05 {
    public static void main(String[] args) {
        int[][] array2 = new int[5][2];
        int[][] array = {
                {8, 1, 3, 8, 5, 6, 7, 4},
                {3, 3, 4, 5, 9, 7, 8, 6},
                {10, 4, 5, 6, 7, 8, 9, 3},
                {4, 5, 6, 7, 8, 9, 10, 11},
                {5, 6, 7, 8, 9, 10, 5, 12},
        };
        int max = array[0][0];
        int min = array[0][0];

        for (int[] row : array) {
            for (int col : row) {
                if (max < col) {
                    max = col;
                }
            }
            System.out.print(max);
            System.out.println();
        }
        System.out.println();
        //мин число колонки 0
        for (int col = 0; col < array.length; col++) {
            if (min > array[col][0]) {
                min = array[col][0];
            }

        }
        System.out.print(min);
        System.out.println();

        // мин число строки
        for (int row = 0; row < array.length; row++) {
            for (int col = 1; col < array[row].length; col++) {
               // min = Math.min(min, array[col]);
            }
        }
        System.out.print(min + " ");
        System.out.println();
    }
}


