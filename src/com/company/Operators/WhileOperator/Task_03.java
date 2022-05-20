package com.company.Operators.WhileOperator;

import java.util.Scanner;
//вводим числа с клавиатуры (пока пользователь вводит что-то похожее на числа) и выводит на экран их сумму.
public class Task_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt())
        {
            int x = sc.nextInt();
            sum = sum + x;
        }
        System.out.println(sum);

    }
}
