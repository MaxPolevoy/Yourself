package com.company.Array.ExamcloudsCom.Metod;

import java.util.Arrays;

// Метод Arrays.toString() возвращает строковое представление одномерного массива, разделяя элементы запятой.
// Вместо того чтобы перебирать массивы циклом for,
// можно воспользоваться этим методом для вывода элементов на консоль:

public class ArraysToStringDemo {
    public static void main(String[] args) {
        String [] array =new String[3];
        array[0] ="One";
        array[1] = "Two";
        array[2]="The";
        System.out.println("Вывод массива " + Arrays.toString(array));
    }
}
