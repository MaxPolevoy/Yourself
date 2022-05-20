package com.company.Array.ProglangSu;


//Пример 8: вывод элементов массива с четным и нечетным индексом
//В примере показано как вывести на экран элементы массива с четным и нечетным индексом.

public class TaskArray7 {
    public static void main(String[] args) {
        // Массив myArray из 5 элементов типа double.
        double[] myList = {11.5, 1.9, 5.32, 8.8, 15.8};

        // Вывод элементов массива с четным индексом на экран.
        System.out.print("Элементы массива myList с четным индексом: ");
        for (int i = 0; i < myList.length; i++) {
            if (i % 2 == 0) {
                System.out.print("индекс " + i + " = " + myList[i] + ", ");
            }
        }

        // Вывод элементов массива с нечетным индексом на экран.
        System.out.print("\nЭлементы массива myList с нечетным индексом: ");
        for (int i = 0; i < myList.length; i++) {
            if (i % 2 != 0) {
                System.out.print("индекс " + i + " = " + myList[i] + ", ");
            }
        }
    }
}