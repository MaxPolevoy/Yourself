package com.company.Operators.IfOperator;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        //Передать на вход программы число от 1 до 7 в качестве аргумента.
        //Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
        //Используем конструкцию if-else-if.
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("Понедельник");
            }
            if (num == 2) {
                System.out.println("Вторник");
            }
            if (num == 3) {
                System.out.println("Среда");
            }
            if (num == 4) {
                System.out.println("Четверг");
            }
            if (num == 5) {
                System.out.println("Пятница");
            }
            if (num == 6 || num == 7) {
                System.out.println("Выходной");
            } else System.out.println("Введенное число не есть днем недели");
        }else System.out.println("Вы ввели не целое число");
    }
}

