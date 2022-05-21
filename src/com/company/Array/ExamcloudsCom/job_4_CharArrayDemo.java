package com.company.Array.ExamcloudsCom;

//Создать двумерный масив char размером 4х2
//И записать туда значения с помощью блока для инициализации.
//Распечатать значения

public class job_4_CharArrayDemo {
    public static void main(String[] args) {
        char[][] array = {
                {'a'},
                {'s', 'f'},
                {'r', 't'},
                {'g'}
        };
        for (char [] array2: array){ // перебираем елементы-строки двумерного массива array
            for(char element:array2){ // перебираем елементы одномерного массива array2
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
