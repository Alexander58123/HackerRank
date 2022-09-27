package com.javarush.task.HackerRank;

import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Zadacha10 {

    public static String upWorld(String str) {
        return str = str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        A = upWorld(A);
        B = upWorld(B);

        int proverkaSortirovki = A.compareToIgnoreCase(B);
        String vuvod = null;

        if (proverkaSortirovki <= 0)
            vuvod = "No";
        else
            vuvod = "Yes";




        System.out.println(A.length() + B.length());
        System.out.println(vuvod);
        System.out.println(A + " " + B);
    }
}
