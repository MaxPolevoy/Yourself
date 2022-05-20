package com.company.Operators.WhileOperator;

public class Task_06 {
    public static void main(String[] args) {
        //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
        int q =10 ;
        while (q<=20){
            int square = q*q;
            System.out.println(square);
            q++;
        }
    }
}
