package com.company.Array.ExamcloudsCom;


//Следующий пример демонстрирует как получать длину массива. Для этого используется переменная length.
//С одномерным массивом все понятно - его длина это количество его элементов.

//Длина многомерного массива - это количество элементов его первой размерности.
// Например, длина массива array2 - это 2.

// Также можно получить длину каждой строки массива.
// Например, array2[0].length - вернет количество элементов в строке с индексом ноль.

public class ArraySize {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[][] array2 = {
                {1, 1, 1},           // array2[0].length
                {2, 2, 2, 2, 2}     // array2[1].length
        };
        System.out.println("Размер массива array1 = " + array1.length);
        System.out.println("Размер массива array2 = " + array2.length);
        System.out.println("Размер 1-строки массива array2 = " + array2[0].length);
        System.out.println("Размер 2-строки массива array2 = " + array2[1].length);
    }
}

