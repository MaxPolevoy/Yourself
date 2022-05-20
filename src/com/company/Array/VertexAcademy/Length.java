package com.company.Array.VertexAcademy;

import java.util.Arrays;

public class Length {
    public static void main(String[] args) {
        int k;
        int[] array = new int[10];
        k = array.length;
        System.out.println(k); // Длина массива
        System.out.println(array.length); // Длина массива

    }
// Метод перебора элементов массива
    public static void metod(int[] arrays) {
        for (int element : arrays) {
            System.out.print(element + " ");

        }

    }
}
