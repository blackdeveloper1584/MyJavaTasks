package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double n;
        double e;
        double y;

        System.out.print("Enter x:");
        double x=sc.nextDouble();

        n=x*Math.log(x);
        e=(x*x)*1/Math.tan(x);

        if(n<e){
            y=n*Math.sin(e);
        }

        else{
            
            if(n==e){
                y=e*Math.cos(n);
            }

            else{
                y=Math.tan((e*n));
            }
        }

        System.out.println("Result is:"+y);
    }
}