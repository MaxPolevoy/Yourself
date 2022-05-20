package com.company.Array.ProglangSu;

//Пример 7: вывод четных и нечетных элементов массива
//В примере показано как вывести четные и нечетных элементы массива в Java.

public class TaskArray6 {
    public static void main(String[] args) {
        // Массива myArray из 5 элементов типа double.
        double[] myList = {2, 2.7, 3, 12, 23.8};

        // Вывод четных элементов массива на экран.
        System.out.print("Четные элементы массива myList: ");
        for (int i = 0; i < myList.length; i++) {
            if(myList[i]%2 == 0){
                System.out.print(myList[i] + ", ");
            }
        }

        // Вывод нечетных элементов массива на экран.
        System.out.print("\nНечетные элементы массива myList: ");
        for (int i = 0; i < myList.length; i++) {
            if(myList[i]%2 != 0){
                System.out.print(myList[i] + ", ");
            }
        }
    }
}
