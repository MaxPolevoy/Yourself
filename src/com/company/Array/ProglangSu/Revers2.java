package com.company.Array.ProglangSu;


public class Revers2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{5, 5, 5, 5};
        int[] list = new int[]{10, 11, 12, 13, 14};

        // Метод можно вызвать путем передачи массива.
        // Например, следующий оператор вызывает метод printArray для отображения 3, 1, 2, 6, 4 и 2:
        printArray(new int[]{3, 1, 2, 6, 4, 2});

        System.out.println();
        printArray(array1);

        System.out.println();
        reverse(new int[]{1, 2, 3});

    }

    //Также как можно передать значение примитивного типа в метод, можно также передать массив в метод.
    //Например, следующий метод отображает элементы в int массиве:

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    //Возврат массива из метода
    //Метод может также возвращать массив. Например, метод, показанный ниже, возвращает массив,
    // который является реверсирование другого массива:

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }
}

