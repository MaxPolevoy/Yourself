package com.company.Task4;

public class Task4Mass {
    public static void main(String[] args) {
        int[] myArray = new int[3]; // объявление и создание массива на 3 элементов типа int
        System.out.println(myArray.length);

        String[] seasons = new String[4]; /* объявили и создали массив. Java выделила память под массив из 4 строк, и сейчас в каждой ячейке записано значение null (поскольку строка — ссылочный тип)*/

        seasons[0] = "Winter"; /* в первую ячейку, то есть, в ячейку с нулевым номером мы записали строку Winter. Тут мы получаем доступ к нулевому элементу массива и записываем туда конкретное значение  */
        seasons[1] = "Spring"; // проделываем ту же процедуру с ячейкой номер 1 (второй)
        seasons[2] = "Summer"; // ...номер 2
        seasons[3] = "Autumn"; // и с последней, номер 3
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
        }
        System.out.println();
            String[] sesons2 = new String[]{"Winter", "Spring", "Summer", "Autumn"}; // Инициализация - совместив с инициализацией и объявлением
            for (int i2 = 0; i2 < 4; i2++) {
                System.out.println(seasons[i2]);
            }
        System.out.println();

                String[] sesons3 = {"Winter", "Spring", "Summer", "Autumn"}; // Инициализация - оператор new можно опустить
                for (int i3 = 0; i3 < 4; i3++) {
                    System.out.println(seasons[i3]);

                }
            }
        }
