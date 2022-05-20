package com.company.Operators.SwitchOperator;

public class Task_11 {
    public static void main(String[] args) {
        int i = 10;
        switch (i) {
            case 1:
            case 2:
                System.out.println("один или два");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("от трех до пяти");
                break;
            default:
                System.out.println("много");
        }

    }
}

