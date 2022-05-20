package com.company.Array;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        double[] array = {1.2, 2.3, 5.0, 10.5};
        //System.out.println(array[0]); // Выводим первый элемент
        for (double element : array) {
           System.out.print(element + " ");

        }
        System.out.println();

        System.out.println();
        array = new double[]{1, 2};  // Объявление безимянного массива
        for (double element : array) {
            System.out.print(element + " ");

        }
        System.out.println();
        metodOne(array);
        System.out.println();
        metodOne(new double[]{10, 12, 13});
    }

    public static void metodOne(double[] arrayX) {
        for (double element : arrayX) {
            System.out.print(element + " ");
        }

    }
}

