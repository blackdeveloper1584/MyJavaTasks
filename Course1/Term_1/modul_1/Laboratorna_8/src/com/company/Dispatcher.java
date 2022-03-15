package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a;
        double y;
        int n;
        double r;
        System.out.print("Enter x:");
        double x=sc.nextDouble();
        System.out.print("Enter z:");
        double z=sc.nextDouble();
        y=0;
        n=0;
        a=(Math.pow(Math.log(3),n))*(Math.pow(x,n))/z;

        while(Math.abs(a)>=z){
            y+=a;
            n++;
            r=(Math.pow(Math.log(3),n))*(Math.pow(x,n))/n/(Math.pow(Math.log(3),n))*(Math.pow(x,n))/n;
            a+=r;
        }
        System.out.println("Result is:"+y);
    }
}
