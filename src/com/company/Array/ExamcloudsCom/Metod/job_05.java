package com.company.Array.ExamcloudsCom.Metod;

//Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока для инициализации.
//Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
//Распечатать массив, содержащий максимальное и минимальное значение.

public class job_05 {
    public static void main(String[] args) {
        int[][] array2 = new int[5][2];
        int[][] array = {
                {8, 3, 1, 8, 5, 6, 7, 4},
                {3, 3, 4, 5, 9, 7, 8, 6},
                {10, 4, 5, 6, 7, 8, 9, 3},
                {4, 5, 6, 7, 8, 9, 10, 11},
                {5, 6, 7, 8, 9, 10, 5, 12},
        };
        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];

            for (int j = 0; j < array[0].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            System.out.println("Максимальный элемент " + max + " Минимальный элемент " + min );

        }
    }
}


