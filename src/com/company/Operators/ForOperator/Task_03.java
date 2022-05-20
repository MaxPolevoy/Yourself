package com.company.Operators.ForOperator;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        //Подсчет количества введенных строк с помощью цикла for
        //Давайте напишем программу, которая вводит с клавиатуры 10 строк и выводит на экран,
        // сколько из этих строк было чисел.
        Scanner sc = new Scanner(System.in);
        int num = 0;
        for (int i = 0; i < 5; i++)
        {
            if (sc.hasNextInt())
                num++;
            sc.nextLine();
        }
        System.out.println(num);
    }
}
