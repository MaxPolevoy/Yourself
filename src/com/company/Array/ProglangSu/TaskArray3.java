package com.company.Array.ProglangSu;

public class TaskArray3 {
    public static void main(String[] args) {
        // Создание массивов myArrayInt1 и myArrayInt2 типа int и объявление переменных
        double[] myArrayInt1 = {2.4, 3.8, 11.2, 9.8, 1.18};
        double max = 0;
        for (int i = 0; i < myArrayInt1.length; i++) {
            if (max < myArrayInt1[i])
                max = myArrayInt1[i];
        }
        System.out.println(max);
    }
}

// Второй способ

//    // Нахождение максимального элемента в массиве используя MIN_VALUE и Math.max
//    public static void main(String[] args) {
//        // Нахождение максимального элемента в массиве myArray из 4 элементов типа double.
//        double[] myArray = {11, 5.8, 11.1, 10.9};
//
//        // Переменной max задаем минимальное double-значение.
//        double max = Double.MIN_VALUE;
//
//        // Перебираем все элементы массива.
//        for (int i = 0; i < myArray.length; i++) {
//            // Переменной max с помощью метода Math.max() присваиваем максимальное значение
//            // путем выбора наибольшего из двух значений ("старого" значения max и значения элемента).
//            max = Math.max(max, myArray[i]);
//        }
//
//        // Выводим на экран наибольшее число массива myArray.
//        System.out.println("Максимальный элемент в массиве myArray: " + max);
//    }
//}