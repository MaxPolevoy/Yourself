package com.company.Array.ItprogerСom;

import static java.lang.Math.min;

public class ArrayMaxElement {
    public static void main(String[] args) {
        double sum = min();
        double[] array = new double[5];
        array[0] = 1.2;
        array[1] = 0.2;
        array[2] = 5;
        array[3] = -1.8;
        array[4] = 5.2;
        double max = min();
        for (double element : array) {
            sum += element;

            if (max < element) {

                max = element;
            }
        }
        System.out.println(sum);
        System.out.println(max);
    }

    private static double min() {
        return 0;
    }
}
