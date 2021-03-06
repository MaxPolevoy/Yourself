package com.company.Array;

//Массив — это структура данных, в которой хранятся элементы одного типа.

public class Task_01 {
    public static void main(String[] args) {
        int[] myArray; // объявление массива типа int
        myArray = new int[4]; // создание, то есть, выделение памяти для массива на 10 элементов типа int

        int[] miArray = new int[4]; // объявление и выделение памяти “в одном флаконе”

        int[] meArray = new int[10]; // создали массив целых чисел на 10 элементов и присвоили ему имя meArray
        System.out.println(meArray.length); // вывели в консоль длину массива, то есть количество элементов,
        // которые мы можем поместить в массив


        String[] seasons  = new String[4]; /* объявили и создали массив. Java выделила память под массив из 4 строк,
        и сейчас в каждой ячейке записано значение null (поскольку строка — ссылочный тип)*/

        seasons[0] = "Winter"; /* в первую ячейку, то есть, в ячейку с нулевым номером мы записали строку Winter.
        Тут мы получаем доступ к нулевому элементу массива и записываем туда конкретное значение  */
        seasons[1] = "Spring"; // проделываем ту же процедуру с ячейкой номер 1 (второй)
        seasons[2] = "Summer"; // ...номер 2
        seasons[3] = "Autumn"; // и с последней, номер 3

        //Инициализацию также можно провести по-другому, совместив с инициализацией и объявлением:
        String[] siasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};

        //Более того, оператор new можно опустить:
        String[] saasons  = {"Winter", "Spring", "Summer", "Autumn"};






    }


}
