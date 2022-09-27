package com.javarush.task.HackerRank;

import java.util.Scanner;

public class Zadacha3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        int dlinaSlova = 0;
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String razdelitel = "";

            dlinaSlova = 15 - s1.length();

            for (int j = 1; j < dlinaSlova; j++) {
                razdelitel = razdelitel + " ";
            }

            if (x >= 0 && x < 10) {
                System.out.printf("%s%s00%d", s1, razdelitel, x);
            } else if (x > 9 && x < 100) {
                System.out.printf("%s%s0%d", s1, razdelitel, x);
            } else {
                System.out.printf("%s%s%d", s1, razdelitel, x);
            }
            System.out.println();
        }
        System.out.println("================================");

    }
}
