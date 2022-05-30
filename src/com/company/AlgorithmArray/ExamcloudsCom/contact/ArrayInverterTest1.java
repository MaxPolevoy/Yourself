package com.company.AlgorithmArray.ExamcloudsCom.contact;

import java.util.Arrays;

// импортируем класс
import static com.company.AlgorithmArray.ExamcloudsCom.contact.ArrayInverter.invert;

public class ArrayInverterTest1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{};
        System.out.print(Arrays.toString(array1) + " => ");
        invert(array1); // импортируем класс и записуем проще
        System.out.println(Arrays.toString(array1));

        array1 = new int[]{0};
        System.out.print(Arrays.toString(array1) + " => ");
        ArrayInverter.invert(array1);
        System.out.println(Arrays.toString(array1));

        array1 = new int[]{0, 1};
        System.out.print(Arrays.toString(array1) + " => ");
        ArrayInverter.invert(array1);
        System.out.println(Arrays.toString(array1));

        array1 = new int[]{0, 1, 2};
        System.out.print(Arrays.toString(array1) + " => ");
        ArrayInverter.invert(array1);
        System.out.println(Arrays.toString(array1));

        array1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print(Arrays.toString(array1) + " => ");
        ArrayInverter.invert(array1);
        System.out.println(Arrays.toString(array1));
    }
}
