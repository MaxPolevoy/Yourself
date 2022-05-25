package com.company.AlgorithmArray.ExamcloudsCom;

//Числа Фибоначчи — элементы числовой последовательности
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, …,
// в которой первые два числа равны либо 1 и 1, либо 0 и 1,
// а каждое последующее число равно сумме двух предыдущих чисел:

// Если запустить данную программу и посмотреть на время выполнения обоих алгоритмов,
// то можно увидеть, что рекурсивный вариант работает дольше.

//Попробуйте изменить значение переменной n на 250, и программа зависнет.
// Проблема состоит в том, что скорость вычисления рекурсивного алгоритма крайне низкая.

import java.time.Duration;
import java.time.LocalTime;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 25;
        LocalTime localTime1 = LocalTime.now();
        System.out.print("Рекурсия " + recursive(n));
        LocalTime localTime2 = LocalTime.now();
        Duration duration1 = Duration.between(localTime1, localTime2);
        System.out.println(", время выполнения - " + duration1);

        LocalTime localTime3 = LocalTime.now();
        System.out.print("Цикл for " + calculateWithFor(n));
        LocalTime localTime4 = LocalTime.now();
        Duration duration2 = Duration.between(localTime3, localTime4);
        System.out.println(", время выполнения - " + duration2);
    }

    /**
     * Сложность О(n)
     *
     * @param n
     * @return
     */
    private static long calculateWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    /**
     * Сложность О(2^n)
     *
     * @param n
     * @return
     */
    private static long recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 2) + recursive(n - 1);
    }
}