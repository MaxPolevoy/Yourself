package com.company.Operators.SwitchOperator;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner Month = new Scanner(System.in);
        int month = Month.nextInt();
        switch (month) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("No month");

        }

    }
}
