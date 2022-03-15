package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a:");
        double a=sc.nextDouble();
        System.out.print("Enter b:");
        double b=sc.nextDouble();
        double u=4.5;
        double y;

        y=(Math.sqrt(a+Math.pow(Math.abs(b),1.0/4)))/(Math.pow(Math.pow(Math.E,Math.abs(a+Math.sin(u))),1.0/3))+Math.tan(a);

        System.out.println("Result is:"+y);
    }
}