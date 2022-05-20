package com.company.Operators.SwitchOperator;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        //Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
        //а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Вы ввели число " + num);
                    break;
                case 2:
                    System.out.println("Вы ввели число " + num);
                    break;
                case 3:
                    System.out.println("Вы ввели число " + num);
                default:
                    System.out.println("Вы ввели число");
            }

        }else System.out.println("Не целое число");
    }
}