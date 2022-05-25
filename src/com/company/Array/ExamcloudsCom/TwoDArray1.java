package com.company.Array.ExamcloudsCom;

// пример демонстрирует каким образом можно установить значения в двухмерный массив 5x4.
// Для перебора строк используется внешний цикл for, для перебора столбцов - внутренний.
// Каждому следующему элементу присваивается значение на единицу большее чем предыдущее.

public class TwoDArray1 {
    public static void main(String[] args) {
        int[][] twoD = new int[5][4];
        int i, j, k = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                twoD[i][j] = k++;
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}