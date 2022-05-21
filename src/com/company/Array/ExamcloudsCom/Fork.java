package com.company.Array.ExamcloudsCom;

class Fork {
    public static void main(String[] args) {
        int [] array = {1,3};
        int [][] array2 = {
                {5,5,5,},
                {6,8},
                {9},
        };


        if (array2.length == 2 | array2[2].equals(1)) {
            System.out.println("test case");
        } else {
            System.out.println("production " + array[1]);
        }
    }
}
