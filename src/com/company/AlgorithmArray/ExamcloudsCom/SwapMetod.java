package com.company.AlgorithmArray.ExamcloudsCom;

public class SwapMetod {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        //Вариант 1: обмен значениями с использованием временной переменной
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Вариант 2: обмен значениями без использования временной переменной
        a = a + b; // a = 8, b = 5
        b = a - b; // a = 8, b = 3
        a = a - b; // a = 5, b = 3
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
