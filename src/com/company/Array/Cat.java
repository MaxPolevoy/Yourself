package com.company.Array;

import java.util.Arrays;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филипп Маркович");

        System.out.println(cats[1]);
        System.out.println(cats.toString());
        // Arrays.toString(cats);
        System.out.println(Arrays.toString(cats));
    }
}