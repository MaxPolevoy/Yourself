package com.company.Array.ExamcloudsCom.Metod;

//Создать двумерный массив типа char размером 4х2.
//Записать в него значения с помощью блока для инициализации.
//Распечатать значения массива.

import java.util.Arrays;

public class job_04 {
    public static void main(String[] args) {
        char[][] array = new char[][]{
                {'a', 'b'},
                {'c', 'd'},
                {'e', 'i'},
                {'f', 'g'}
        };
        System.out.println(Arrays.deepToString(array)); //выводим с помощю метода Arrays.deepToString(array)

        System.out.println();
// выводим с помощю цикла for
        for (char[] row : array) {
            for (char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
