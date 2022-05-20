package com.company.Array;

public class Task_06 {
    public static void main(String[] args) {
        float f1 = 2.3f;
        float[][] f2 = {
                {42.0f},//0,0
                {1.7f, 2.3f}, //1,0; 1,1
                {2.6f, 2.7f}}; //2,0; 2,1
        float[] f3 = {2.7f}; // 0,0
        long x = 42L;
        // insert code here
        //if (f1 == f2)
        if (f1 == f2[2][1])
        if (x == f2[0][0])
        //if (f1 == f2[1,1])
        if (f3 == f2[2])
            System.out.println("true");
    }
}