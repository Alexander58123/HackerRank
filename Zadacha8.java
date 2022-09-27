package com.javarush.task.HackerRank;

import java.time.LocalDate;
import java.util.*;
import java.util.Calendar;

public class Zadacha8 {

    public static String findDay(int month, int day, int year) {
        String result = "";

        // Calendar date = new GregorianCalendar(year, month, day);
        LocalDate data2 = LocalDate.of(year, month, day);
        result = String.valueOf(data2.getDayOfWeek());
        /*
        switch (date.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                result = "SUNDAY";
                break;
            case 2:
                result = "MONDAY";
                break;
            case 3:
                result = "TUESDAY";
                break;
            case 4:
                result = "WEDNESDAY";
                break;
            case 5:
                result = "THURSDAY";
                break;
            case 6:
                result = "FRIDAY";
                break;
            case 7:
                result = "SATURDAY";
                break;
        }

         */

        return result;
    }


    public static void main(String[] args) {

        String test = findDay(8, 5, 2015);
        System.out.println(test);
    }
}

