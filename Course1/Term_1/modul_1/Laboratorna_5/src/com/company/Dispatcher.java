package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        double a;
        double result;
        int n;

        System.out.print("Enter x:");
        double x=sn.nextDouble();
        System.out.print("Enter r:");
        double r=sn.nextDouble();

        n=1;
        a=(Math.pow(Math.log(3),n)*Math.pow(x, n))/n;
        result=0;

        while(Math.abs(a)>=r){
            result+=a;
            n++;
            a=(Math.pow(Math.log(3),n)*Math.pow(x, n))/n;
        }

        System.out.println("Result is:"+result);
    }
}
