package com.company.Array;

/* length - возвращает количество элементов в массиве.
   Arrays.copyOf - копирует один массив в другой.
   Arrays.sort - сортировка массива.
*/


import java.util.Scanner;

public class Task_00 {
    public static void main(String[] args) {
        //Создайте массив, после чего найдите наибольший элемент массива


        int[] arry = new int[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arry.length; i++) {
            System.out.print("Введите число: ");
            int nums = sc.nextInt();
            arry[i] = nums;
        }
        int max = arry[0];
        for (int i = 0; i < arry.length; i++) {

            if (max < arry[i]) {
                max = arry[i];
            }
        }
        System.out.println(max);
    }
}
