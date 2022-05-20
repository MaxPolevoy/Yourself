package com.company.Operators.ForOperator;

public class Task_06 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int starCount = 0 + i;
            for (int j = 0; j < starCount; j++)
                System.out.print("*" + " ");
            System.out.println();
        }
    }
}