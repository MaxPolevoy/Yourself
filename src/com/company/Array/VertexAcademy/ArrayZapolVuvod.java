package com.company.Array.VertexAcademy;

public class ArrayZapolVuvod {
    public static void main(String[] args) {
        int [] array = new int [10];
        for (int i=0; i< array.length;i=i+2){
            array[i] = i;
            System.out.println(array[i]);
        }
//        for (int i=0; i< array.length;i++){
//            System.out.println(array[i]);
//        }
    }
}
