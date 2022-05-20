package com.company.Array.VertexAcademy;

import java.util.Arrays;

public class ArraySummElem {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum = array[i] + sum;
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

        System.out.println("Summ element " + Arrays.toString(array) + " : " + sum);
    }
}
