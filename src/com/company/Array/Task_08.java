package com.company.Array;

import java.util.Arrays;

public class Task_08 {
    public static void main(String[] args) {
        int[] x = new int[100];
        Arrays.fill(x, 888);
        System.out.println(Arrays.toString(x));
        System.out.println();
        for (int i = 0; i < x.length; i++)
            x[i] = 999;
        System.out.println(Arrays.toString(x));
    }
}
