package com.company.Task1;

//Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем
// с помощью класса Scanner. Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.


//import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int i = 100;
        while (i >= 10) {
            System.out.print((i -= 10) + " ");
        }

        /*//пропусканням чисел, що діляться на 7

        for (int i = 1; i <= 20; i++)
        {
            if ( (i % 7) == 0) continue;
            System.out.println(i);
        }*/

        /*//Напиши програму, де за допомогою циклу for виводяться на екран парні числа від 1 до 15.
        // Кожне значення потрібно вивести з нового рядка.
        for (int i = 1; i <= 15; i++) {
            if ( i%2 == 0) {
                System.out.println(i);
            }

        }*/


        /*//Давай используем цикл for, чтобы вывести на экран прямоугольный треугольник из восьмёрок
        // со сторонами (катетами) 10 и 10. То есть в первой строке должна быть одна 8, начиная слева,
        // во второй - две и т.д. Пример вывода на экран: 8
        for (int i = 0; i <= 10; i++) {
            int starCount = 0 + i;
            for (int j = 0; j < starCount; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*//Давайте напишем программу, которая рисует на экране треугольник: в первой строчке выводит 10 звездочек,
        //во второй — 9 звездочек, затем 8, и т.д.
        for (int i = 0; i < 10; i++) {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++){
                System.out.print("*");
                }
            System.out.println();
        }*/







        /*//Вычисление факториала с помощью цикла for
        int f = 1;
        for (int i = 1; i <= 10; i++){
            f *= i;
        }
        System.out.println(f);
*/

        /*//Давайте напишем программу, которая вводит с клавиатуры 10 строк и выводит на экран,
        // сколько из этих строк было чисел.
        Scanner console = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++)
        {
            if (console.hasNextInt())
                count++;
            console.nextLine();
        }
        System.out.println(count);*/




        /*Scanner scaner = new Scanner(System.in);
        int num = scaner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println (sum);*/



        /*В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
        Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до
        end (не включительно), кратных multiple. Для этого используй цикл for. Подсказка: чтобы перейти
        к следующей итерации цикла, используй оператор continue.*//*
        Scanner scaner = new Scanner(System.in);
        int start = scaner.nextInt();
        int end = scaner.nextInt();
        int multiple = scaner.nextInt();
        int sum = 0;

        for (int i = start; i < end; ++i) {
            if (i % multiple == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }*/









        /*Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        String weekday;
        switch (dayNumber) {

            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Saturday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
            case 7:
                weekday = "Weekend";
                break;
            default:
                weekday = "Not month";
                break;

        }
        System.out.println(weekday);*/

        /*Scanner lk = new Scanner(System.in);
        int month = lk.nextInt(); // April
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Autumn";
        } else {
            season = "Not a Month";
        }
        System.out.println("April is in the " + season + ".");*/

        /*Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        String weekday;
        if (dayNumber == 1) {
            weekday = "Monday";
        } else if (dayNumber == 2) {
            weekday = "Tuesday";
        } else if (dayNumber == 3) {
            weekday = "Wednesday";
        } else if (dayNumber == 4) {
            weekday = "Saturday";
        } else if (dayNumber == 5) {
            weekday = "Friday";
        } else if ((dayNumber == 6) || (dayNumber == 7)) {
            weekday = "Weekend";
        } else {
            weekday = "Not month";
        }
        System.out.println(weekday);*/
    }
}


