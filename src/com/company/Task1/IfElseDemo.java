package com.company.Task1;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            compareNumber(num);
        } else {
            System.out.println("Значение введено не верно");
        }
    }

    public static void compareNumber(int num) {
        if (num > 0 && num < 10) {
            System.out.println("положительное число меньше 10");
        }
        else {
            System.out.println("положительное число больше 10 или отрицательное");

        }
    }
}