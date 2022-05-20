package com.company.Array.ProglangSu;

import java.util.Arrays;

public class Revers {

    public static void main(String[] args) {

        int[] result = new int[7];
        int[] list = new int[] {6,7,8,9,10};

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
