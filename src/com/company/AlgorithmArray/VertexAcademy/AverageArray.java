package com.company.AlgorithmArray.VertexAcademy;

// Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый

//2. Выведите массивы на экран в двух отдельных строках

//3. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)


import java.util.Arrays;

public class AverageArray {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];

        for (int i = 0; i < 5; i++) {    // Создаем цикл, который генерирует элементы массивов.
                                         // И генерируем числа в диапазоне от 0 до 5 включительно.
            mas1[i] = (int) (Math.random() * 6);
            mas2[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(mas1)); // выводим массивы в строку с помощью класса Arrays
        System.out.println(Arrays.toString(mas2));

        double average1 = 0; // создаем переменные для хранения средних арифметических массивов
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += mas1[i]; // находим сумму элементов массивов
            average2 += mas2[i];
        }
        average1 /= mas1.length; //делим сумму на количество элементов
        average2 /= 5;

        if (average1 > average1) { //сравниваем средние арифметические и выводим соответствующую фразу
            System.out.println("Среднее арифметическое первого массива " + average1 + " больше среднего арифметического " +
                    "второго массива (" + average2 + ")");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое первого массива " + average1 + " меньше среднего арифметического " +
                    "второго массива " + average2 + "");
        } else {
            System.out.println("Средние арифметические массивов равны (" + average1 + ")");
        }
    }
}


