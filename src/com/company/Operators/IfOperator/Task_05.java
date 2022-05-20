package com.company.Operators.IfOperator;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        //Передать на вход программы число в качестве аргумента.
        //Если оно нечетное, распечатать его.
        //Используем оператор if.
        //Используйте метод Integer.parseInt() для преобразования из String в int.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Num(num);

    }

    private static void Num(int num) {
        if (num %2!=0){
            System.out.println("Число не четное: " + num);
        }else
            System.out.println("Число четное: " + num);
    }
}
