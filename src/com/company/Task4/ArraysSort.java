package com.company.Task4;

import java.util.Arrays;

//отсортировать этот массив по возрастанию: от меньших чисел к большим
public class ArraysSort {
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        //Arrays.sort(numbers, 0, 9); //сортируем весь массив от нулевого до четвёртого члена
        Arrays.sort(numbers); //сортируем весь массив от нулевого до четвёртого члена
        System.out.println(Arrays.toString(numbers));



        }
    }

