package com.company.Array.ExamcloudsCom;

public class ArrayMonthDay {
    public static void main(String[] args) {
        int[] monthDay = new int[12];
        monthDay[0] = 31;
        monthDay[2] = 28;
        monthDay[3] = 31;
        monthDay[4] = 30;
        monthDay[5] = 31;
        monthDay[6] = 31;
        monthDay[7] = 31;
        monthDay[8] = 30;
        monthDay[9] = 31;
        monthDay[10] = 30;
        monthDay[11] = 31;

        System.out.println("В феврале " + monthDay[2] + " дней");
    }
}
