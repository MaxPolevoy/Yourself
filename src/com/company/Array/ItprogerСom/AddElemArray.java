package com.company.Array.ItprogerСom;

import java.util.Arrays;
import java.util.Scanner;

public class AddElemArray {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner x = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Add element: ");
            arr[i] = x.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
