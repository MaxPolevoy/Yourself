package com.company.Task1;

import java.io.IOException;

public class Task_01 {
    String str1 = "Hello!";
    String str2 = "Hi!";

    public static void main(String[] args) throws IOException {
        int x = System.in.read();
        char c = (char) x;
        System.out.println("Код символа: " + c + " = " + x);
    }
}