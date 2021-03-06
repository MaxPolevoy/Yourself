package com.company.Array.ProglangSu;


//Пример 6: вывод массива
//В данном примере рассмотрим как вывести массив на экран в Java.

public class TaskArray5 {
    public static void main(String[] args) {
        // Вывод на экран массива myArray из 5 элементов типа double.
        double[] myList = {11.5, 1.9, 5.32, 8.8, 15.8};

        // Вывод массива на экран с помощью улучшенного цикла for.
        System.out.print("Вывод элементов массива myList: ");
        for(double element : myList) {
            System.out.print(element + ", ");
        }

        // Вывод элементов массива на экран.
        System.out.print("\nВывод элементов массива myList: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + ", ");
        }
    }
}

