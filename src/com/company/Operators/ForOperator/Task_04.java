package com.company.Operators.ForOperator;

public class Task_04 {
    public static void main(String[] args) {
        //Вычисление факториала с помощью цикла for
        //Давайте напишем программу, которая ничего не вводит, а скажем, что-нибудь вычисляет. Что-то сложное. Например, факториал числа 10.
        //Факториалом числа n (обозначается n!) называется произведение ряда чисел: 1*2*3*4*5*..*n;

        int f = 1;
        for (int i = 1; i <= 4; i++) {
            f = f * i;

        }
        System.out.println(f);
    }
}
