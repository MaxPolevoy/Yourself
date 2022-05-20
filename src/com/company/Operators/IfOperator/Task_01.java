package com.company.Operators.IfOperator;


import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {

        //Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
        //а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num==1) {
            System.out.println("Вы ввели число " + num);
        } else if (num==2) {
            System.out.println("Вы ввели число " + num);
        } else if (num==3) {
            System.out.println("Вы ввели число " + num);
        }else System.out.println("Вы ввели число не равное 1,2,3");
    }
}