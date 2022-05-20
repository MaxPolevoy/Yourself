package com.company.Array.ProglangSu;


//Следующий код отображает все элементы в массиве myList: при помощи - Цикл foreach

public class TestArray1 {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Вывести массив на экран
        for (double element: myList) {
            System.out.print(element+ " ");
        }
    }
}
