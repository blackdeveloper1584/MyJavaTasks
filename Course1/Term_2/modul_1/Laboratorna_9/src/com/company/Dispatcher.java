package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dispatcher {

    public static void main(String[] args) {

        task1();
        task2();
    }


    public static void task1(){

        double a = 0.7;
        double b = 0.05;
        double x = 0.5;

        double r =  Math.pow(x, 2) * (x + 1) / b - Math.pow(Math.sin(x + a), 2);
        double s = Math.sqrt(x * b / a) + Math.pow(Math.sin(Math.pow(x + b, 3)), 2);

        System.out.println(r);
        System.out.printf("%011.3f%n", r);
        System.out.println();

        System.out.println(s);
        System.out.printf("%011.3f%n", s);
        System.out.println();

    }

    public static void task2(){

        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");

        System.out.println("Current date, month and year: " + simpleDateFormat.format(date));
    }
}
