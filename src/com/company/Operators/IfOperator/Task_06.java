package com.company.Operators.IfOperator;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        //С помощью класса Scanner ввести целое число.
        //Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10 или ноль”,
        // иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
        //Используем оператор if-else.
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num > 0 && num < 10) {
                System.out.println("Положительное число меньше 10 или 0: " + num);
            } else
                System.out.println("Положительное число больше 10 или отрицательное: " + num);

        }else
            System.out.println("Введеннове Вами число не целое");
    }
}

