package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double y;
        double x;
        double ymin;
        double ymax;
        double xmax;
        double xmin;

        System.out.print("Enter a:");
        double a=scan.nextDouble();
        System.out.print("Enter b:");
        double b=scan.nextDouble();
        System.out.print("Enter h:");
        double h=scan.nextDouble();

        x=a;
        y=(Math.sqrt(Math.pow(x,2)+1))/x;
        ymax=y;
        ymin=y;
        xmax=x;
        xmin=x;

        while(x<=b){

            y=(Math.sqrt(Math.pow(x,2)+1))/x;
            System.out.println("result x:"+x+"\nresult y:"+y);

            if(y>ymax){
                ymax=y;
                xmax=x;
            }

            if(y<ymin){
                ymin=y;
                xmin=x;
            }

            x+=h;
        }
        
        System.out.println("Max y:"+ymax+"\nMax x:"+xmax);
        System.err.println("Min y:"+ymin+"\nMin x:"+xmin);
    }
}
