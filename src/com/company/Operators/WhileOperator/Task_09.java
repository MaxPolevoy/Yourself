package com.company.Operators.WhileOperator;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        //•	Программа должна выводить на экран второе минимальное из введенных целых чисел.
        //•	Если введено несколько вторых минимальных чисел, необходимо вывести любое.
        //не выполняет эти пункты хотя по факту его показывает.
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x < min)
                min = x;
        }
        System.out.println(min);

    }
}
//?????????????????????????????????????????????????????????