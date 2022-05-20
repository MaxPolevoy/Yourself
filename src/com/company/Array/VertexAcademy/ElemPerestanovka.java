package com.company.Array.VertexAcademy;

//Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
// Не используйте дополнительный массив для хранения результатов.

public class ElemPerestanovka {
    public static void main(String[] args) {
        String[] a = {"Каждый ", " охотник ", " желает ", " знать ", " где ", " сидит ", " фазан "};
        //Выводим изначальный массив в консоль
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        //int n = a.length; // Длина массива
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < a.length / 2; i++) {

            temp = a[a.length - i - 1];
            a[a.length - i - 1] = a[i];
            a[i] = temp;


        }
        //Выводим конечный массив в консоль
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}

