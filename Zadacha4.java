package com.javarush.task.HackerRank;

import java.util.Scanner;

public class Zadacha4 {

    // Задача на ряды из хакерранк

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // количество строк
        int itog = 0;

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt(); // количество чисел в строке

            for (int j = 1, k = 1; j <= n; j++) {

                if (j == 1)
                    itog = a + (k * b) + itog;
                else
                    itog = k * b + itog;
                k = k * 2;
                System.out.print(itog + " ");
            }

            itog = 0;
            System.out.println();
        }

        in.close();
    }
}
