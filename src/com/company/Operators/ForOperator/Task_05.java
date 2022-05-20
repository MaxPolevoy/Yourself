package com.company.Operators.ForOperator;

public class Task_05 {
    public static void main(String[] args) {
        //Рисуем на экране с помощью цикла for
        //Давайте напишем программу, которая рисует на экране треугольник:
        // в первой строчке выводит 10 звездочек, во второй — 9 звездочек, затем 8, и т.д.

        for (int i = 0; i < 10; i++) {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++)
                System.out.print("*" + " ");
            System.out.println();
        }
    }
}
