package com.company.Operators.ForeachOperator;

public class Task_01 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println();
        String[] names = {"Олег", "Иван", "Дима", "Юля"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
        int[] array = {51,136,387};

        for (int i:array) {
            System.out.println(i);
        }
    }
}
