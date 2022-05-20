package com.company.Array.ExamcloudsCom;

import java.util.Arrays;

// создать массив и вывести массив
// объявить безымянный массив
// выводим через метод массив
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
        metodPrint(array); // передаем массив через переменную
        System.out.println();
        metodPrint(new double[]{10, 12, 13}); //создаем и передаем массив
    }

    public static void metodPrint(double[] arrayX) { //на вход метода передаем массив arrayX
        for (double element : arrayX) {
            System.out.print(element + " ");
        }
    }
}


