package com.company.Task4;


import java.util.Arrays;

public class SortsArrayIntegers {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 3, 7}; //объявляем и инициализируем массив
        System.out.println(array);//пытаемся вывести наш массив на экран без метода toString - получаем 16-ричное число
        System.out.println(Arrays.toString(array));//печатаем массив "правильно"
        //Arrays.sort(array, 0, 4);
        Arrays.sort(array); //сортируем весь массив от нулевого до четвёртого члена
        System.out.println(Arrays.toString(array));//выводим отсортированный массив на экран
        int key = Arrays.binarySearch(array,5); //пытаемся вывести наш массив на экран без
        // метода toString - получаем 16-ричное число
        System.out.println(key);
        System.out.println(Arrays.binarySearch(array, 10));//а теперь попробуем найти число, которого в массиве нет,
        // и сразу же выведем результат на экран


    }

}
