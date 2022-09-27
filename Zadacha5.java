package com.javarush.task.HackerRank;

import java.util.*;
import java.io.*;

public class Zadacha5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // для цикла, количество вводимых цифр

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();  // сохраняем в лонг т.к. самая большая емкость
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= -32768 && x <= 32767)
                    System.out.println("* short");
                if (x >= -2147483648 && x <= 2147483647)
                    System.out.println("* int");
                if (x >= -9223372036854775808L && x <= 9223372036854775807L)
                    System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

    }
}
