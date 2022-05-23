package com.company.Array.ExamcloudsCom.Metod;

import java.util.Arrays;

//отсортировать двухмерный массив по горизонталям

public class ArraysSortTo {
    public static void main(String[] args) {
        int num[][] = {
                {5, 4, 45, 12},
                {7, 5, 8,  85},
        };

        for (int col = 0; col < num.length; col++){
            Arrays.sort(num[col]); //проходим по горизонталям массива и внутри
                                   //горизонталей осуществляем сортировку
        }

        for(int row = 0; row < num.length; row++){
            for(int col = 0; col < num[row].length; col++){

        /*
        num.length возвращает количество строк массива
        num[i].length возвращает количество элементов в i-той строке
        */

                System.out.print(num[row][col] + "\t");
            }
            System.out.println();
        }
    }
}