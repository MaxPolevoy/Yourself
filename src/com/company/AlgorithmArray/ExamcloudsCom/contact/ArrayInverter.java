package com.company.AlgorithmArray.ExamcloudsCom.contact;


// Обратите внимание, что в классе ArrayInverter нет метода main() - будем вызывать метод invert() из другого класса.
// Для вызова метода, находящегося в другом классе, пишем имя класса - ArrayInverter.invert(array1):


public class ArrayInverter {
    public static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] =  tmp;
        }
    }
}