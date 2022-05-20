package com.company.Array.VertexAcademy;

public class ArrayFor {
    public static void main(String[] args) {
        //цикл for,  который поочередно обращается к каждому элементу массива array1
        // по индексу и выводит их на экран.
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
