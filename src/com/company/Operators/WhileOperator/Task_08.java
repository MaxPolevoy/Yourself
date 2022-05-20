package com.company.Operators.WhileOperator;

import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        //Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
        // например, строка или символ. Выведи на экран максимальное четное число из введенных.
        // Если введено несколько таких чисел, необходимо вывести любое из них.

        Scanner sc = new Scanner(System.in);
        int max2 = getMax2();
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if ((x > max2) && (x % 2 == 0))
                max2 = x;
        }
        System.out.println(max2);
    }

    private static int getMax2() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            return x;
        } else System.out.println("Ведите число");
        return 0;
    }
}
