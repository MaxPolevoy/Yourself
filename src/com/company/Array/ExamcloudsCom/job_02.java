package com.company.Array.ExamcloudsCom;

/*Создать массив типа String размером 3х6.
        И записать в него значения:
        a1  a2  a3  a4  a5  a6
        b1  b2  b3  b4  b5  b6
        c1  c2   c3  c4  c5  c6
        Распечатать массив.*/

public class job_02 {
    public static void main(String[] args) {
        String[][] TwoArray = new String[3][6];
        char simbyl = 'a';

        for (int i = 0; i < args[1].length(); i++) {
            for (int j = 0; j < args[0].length(); j++) {
                TwoArray[i][j] = simbyl + "" + (j + 1);
                System.out.print(TwoArray[i][j] + " ");
            }
            System.out.println();
            simbyl++;
        }


    }
}
