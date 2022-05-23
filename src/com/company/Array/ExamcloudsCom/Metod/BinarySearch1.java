package com.company.Array.ExamcloudsCom.Metod;

import java.util.Arrays;

//Метод Arrays.binarySearch() возвращает позицию заданного значения.
// Если искомый элемент не найден, то возвращается - (position + 1),
// где position - позиция элемента где он МОГ БЫ БЫТЬ.
// Массив должен быть отсортирован, иначе результат вызова метода будет не определен:

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] array = {40, 30, 20, 10};


        System.out.println(Arrays.toString(array));

        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 40));

    }
    public static void sort(int [] arraySort) {
        for (int element : arraySort) {
            Arrays.sort(arraySort);
        }
    }
}
