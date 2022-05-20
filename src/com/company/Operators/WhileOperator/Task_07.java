package com.company.Operators.WhileOperator;

public class Task_07 {
    public static void main(String[] args) {
        //Необходимо вывести на экран вот такую последовательность чисел:
        //100 90 80 70 60 50 40 30 20 10
        int i = 100;
        while (i >= 10) {
            System.out.println(i);
            i -= 10;
        }
    }
}
