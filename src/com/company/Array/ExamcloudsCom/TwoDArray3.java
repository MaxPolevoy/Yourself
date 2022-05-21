package com.company.Array.ExamcloudsCom;

// Блок инициализации для двумерного массива
// Для многомерных массивов можно также использовать блок для инициализации,
// если значения всех элементов заранее известны. Каждая отдельная строка заключается в фигурные скобки:

public class TwoDArray3 {
    public static void main(String[] args) {
        double[][] arrayTwoD = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12},
                {13, 14}
        };
        for (double[] arrayOneD : arrayTwoD) { // перебираем строки
            for (double element: arrayOneD) { // перебор елементов одномерного массива
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
