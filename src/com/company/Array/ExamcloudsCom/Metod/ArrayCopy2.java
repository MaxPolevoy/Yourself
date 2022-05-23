package com.company.Array.ExamcloudsCom.Metod;

import java.util.Arrays;

//Метод System.arraycopy() осуществляет копирование части массива в другой массив.
//Можно копировать в тот же массив с перекрытием областей:

public class ArrayCopy2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(array));

        System.arraycopy(array, 0, array, 4,4);
        System.out.println(Arrays.toString(array));
    }
}
