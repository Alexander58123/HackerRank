package com.javarush.task.HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Zadacha9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble(); // здесь вводим один раз число с плавающей точкой
        scanner.close(); // поток закрываем

        NumberFormat us = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String dollar = us.format(payment);

        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String rupiya = india.format(payment);

        NumberFormat china = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        String yuan = china.format(payment);

        NumberFormat france = NumberFormat.getCurrencyInstance(new Locale("sk", "SK"));
        String evro = france.format(payment);


        System.out.println("US: " + dollar);
        System.out.println("India: " + rupiya);
        System.out.println("China: " + yuan);
        System.out.println("France: " + evro);
    }
}