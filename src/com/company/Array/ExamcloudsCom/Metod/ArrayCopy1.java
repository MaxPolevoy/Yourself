package com.company.Array.ExamcloudsCom.Metod;

//Метод System.arraycopy() осуществляет копирование части массива в другой массив.
//
//Рассмотрим пример, копирующий элементы 2,3,4 из массива arraySource в массив arrayDestination:

import java.util.Arrays;

public class ArrayCopy1 {
    public static void main(String[] args) {
        int[] arraySource = {1, 2, 3, 4, 5, 6};
        int[] arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("arraySource: " + Arrays.toString(arraySource)); // вывод массива arraySource
        System.out.println("arrayDestination: " + Arrays.toString(arrayDestination)); // вывод массива arrayDestination

        System.arraycopy(arraySource, 1, arrayDestination, 2, 3); //Метод System.arraycopy()
        // осуществляет копирование части массива в другой массив
        System.out.println("arrayDestination after arrayCopy: " + Arrays.toString(arrayDestination));
    }
}