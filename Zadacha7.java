package com.javarush.task.HackerRank;

import java.util.Scanner;

public class Zadacha7 {

    public static void main(String[] args) {


        int B, H;
        Scanner keyboard = new Scanner(System.in);
        B = keyboard.nextInt();
        H = keyboard.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("Java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(B * H);
        }


    }
}
