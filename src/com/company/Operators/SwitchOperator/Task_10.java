package com.company.Operators.SwitchOperator;

public class Task_10 {
    public static void main(String[] args) {

        Day day = Day.WEDNESDAY;
        switch (day)
        {
            case MONDAY:
                System.out.println("Понедельник");
                break;
            case TUESDAY:
                System.out.println("Вторник");
                break;
            case WEDNESDAY:
                System.out.println("Среда");
                break;
            case THURSDAY:
                System.out.println("Четверг");
                break;
            case FRIDAY:
                System.out.println("Пятница");
                break;
            case SATURDAY:
                System.out.println("Суббота");
                break;
            case SUNDAY:
                System.out.println("Воскресенье");
                break;
        }
    }
}
