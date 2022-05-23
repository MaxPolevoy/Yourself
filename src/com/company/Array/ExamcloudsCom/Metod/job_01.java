package com.company.Array.ExamcloudsCom.Metod;

/*
Создать массив типа String с размером 7.
Записать в него значения дней недели.
Вывести на консоль значение последнего элемента.
*/


public class job_01 {
    public static void main(String[] args) {
        String[] week = new String[] {
            "Mon", "Tuesday", "Wednesday", "Saturday", "Friday", "Saturday", "Sunday"
        };
        System.out.println("Last Element: " +week[6]);

    }
}
