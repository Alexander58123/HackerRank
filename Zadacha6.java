package com.javarush.task.HackerRank;

/*
        Задача здесь состоит в том, чтобы прочитать n строк ввода, пока не достигнете EOF,
        затем пронумеровать и распечатать все n строк содержимого.

        Подсказка: метод Java Scanner.hasNext() полезен для решения этой проблемы.

        Формат ввода
        Считайте некоторые неизвестные n строк ввода из stdin(System.in ) до тех пор,
        пока вы не достигнете EOF; каждая строка ввода содержит непустую строку.

        Формат вывода
        Для каждой строки выведите номер строки, за которым следует один пробел,
        а затем содержимое строки, полученное в качестве входных данных.

 */

import java.util.Scanner;

public class Zadacha6 {

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        /* Введите свой код здесь.
        Считывание входных данных из STDIN.
        Вывод на печать в STDOUT. */

        Scanner keyboad = new Scanner(System.in);

        String stroka = "";
        int count = 1;
        while (keyboad.hasNext()) {
            stroka = keyboad.nextLine();
            System.out.println(count + " " + stroka);
            count++;
        }
    }
}
