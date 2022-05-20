package com.company.Operators.WhileOperator;

import java.util.Scanner;

//программа будет считывать числа с клавиатуры (пока пользователь вводит что-то похожее на числа),
//на экран нужно будет вывести наибольшее из введенных чисел.

public class Task_04 {
    public static void main(String[] args) {

        /* Вариант 1:

        Scanner sc = new Scanner(System.in);
        int max = 0;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x > max)
                max = x;
        }
        System.out.println(max); //Тут есть интересный момент: если все введённые числа
        // с клавиатуры будут отрицательными, программа выведет на экран число 0. Что, собственно говоря, неверно.
        //__________________________________________________________________________________*/

        /*// Вариант 2:
        //Присвоить самое маленькое значение типа int.
        // Для него есть специальная константа: Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int max1 = Integer.MIN_VALUE;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x > max1)
                max1 = x;
        }
        System.out.println(max1);
        //_______________________________________________________________________________________
        */

        // Вариант 3:
        // Еще лучше — инициализировать max первым введенным числом(прим метод). Это лучший вариант.
        // Но это можно сделать только в том случае, если по условию задачи пользователь
        // должен ввести хотя бы одно число.
        Scanner sc = new Scanner(System.in);
        int max2 = getMax2();
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x > max2)
                max2 = x;
        }
        System.out.println(max2);
    }

    private static int getMax2() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            return x;
        } else System.out.println("Ведите число");
        return 0;
    }
}

