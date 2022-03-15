package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.print("Enter day:::");
        int day = sc.nextInt();
        System.out.print("Enter month:::");
        int month = sc.nextInt()-1;
        System.out.print("Enter year:::");
        int year = sc.nextInt();

        if(day>31) {
            System.out.println("The day must be less than 31!");
        }

        else if(month>12) {
            System.out.println("The month must be less than 12!");
        }

        gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);
        gregorianCalendar.set(Calendar.MONTH, month);
        gregorianCalendar.set(Calendar.YEAR, year);


        int weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);

        if(weekday == 1) {
            weekday = 7;
        }
        else {
            weekday--;
        }
        System.out.println();
        System.out.println(" Пн  Вт  Ср  Чт  Пт  Сб  Нд");

        for(int i = 1; i < weekday; i++) {
            System.out.print("    ");
        }

        while(gregorianCalendar.get(Calendar.MONTH)==month){
            weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);

            if(weekday == 1) {
                weekday = 7;
            }
            else {
                weekday-=1;
            }

            int day_of_week = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day_of_week);

            if(day_of_week == day) {
                System.out.print("*");
            }

            else{
                System.out.print(" ");
            }

            if(weekday == 7) {
                System.out.println();
            }
            gregorianCalendar.add(Calendar.DAY_OF_MONTH, 1);

        }
    }
}
