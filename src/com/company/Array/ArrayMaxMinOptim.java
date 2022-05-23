package com.company.Array;

//Индексы минимального и максимального элементов можно найти за линейное время, не изменяя массив:

public class ArrayMaxMinOptim {
    public static void main(String[] args) {
        double[] array = {0.22, 0.2, 0.92, 1.5, 1.99, 0.5};
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMax + " " + indexOfMin);
    }
}
