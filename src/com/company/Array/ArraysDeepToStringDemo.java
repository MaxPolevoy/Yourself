package com.company.Array;

import java.util.Arrays;

public class ArraysDeepToStringDemo {
    public static void main(String[] args) {
        String[][] array = {{"один-один", "один-два", "один-три"},
                {"два-один", "два-два", "два-три"}};
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(array)); // ??

    }
}