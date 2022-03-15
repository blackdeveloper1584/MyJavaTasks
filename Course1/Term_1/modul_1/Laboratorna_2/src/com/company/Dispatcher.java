package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Dispatcher {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a:");
        double a=scan.nextDouble();
        System.out.print("Enter b:");
        double b=scan.nextDouble();
        System.out.print("Enter t:");
        double t=scan.nextDouble();
        double y;

        if(1<=t&&t<=2){
            y=a*Math.pow(t, 2)*Math.log10(t);
        }

        else{

            if(t<1){
                y=1;
            }

            else{
                y=Math.pow(Math.E,a*t)*Math.cos(b*t);
            }
        }

        System.out.println("Result is:"+y);
    }
}
