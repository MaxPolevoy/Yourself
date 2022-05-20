package com.company.Array;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Task_02 {
    public static void main(String[] args) {
        String[] sesson = new String[4];
        int [][] sesson1 = {{10, 5, 6, 2}, {5, 10, 7, 2}};
        sesson[0] = "1";
        sesson[1] = "3";
        sesson[2] = "2";
        sesson[3] = "4";

        Arrays.sort(sesson);

        System.out.println(Arrays.toString(sesson));
        System.out.println(deepToString(sesson1));
        System.out.println(Arrays.binarySearch(sesson,"3"));

        System.out.println();

        for (int i = 0; i < sesson.length; i++) {
            System.out.println(sesson[i]);
        }

    }
}
