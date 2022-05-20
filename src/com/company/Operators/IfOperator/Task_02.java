package com.company.Operators.IfOperator;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        //Необходимо написать программу, где бы пользователю предлагалось ввести число  1.
        // Если пользователь ввёл число 1, программа должна вывести сообщение:
        // "Вы ввели число 1". Если пользователь ввёл другое число, программа должна вывести такое сообщение:
        // "Вы ввели число не равное 1"
        System.out.println("Введите число 1: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("Вы ввели число " + num);
        } else
            System.out.println("Вы ввели число не равное 1");
    }
}
