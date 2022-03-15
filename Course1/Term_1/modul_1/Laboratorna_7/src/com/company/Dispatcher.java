package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        double a;
        double res;
        int n;
        int p;

        System.out.print("Enter x:");
        double x=sn.nextDouble();
        System.out.print("Enter r:");
        double r=sn.nextDouble();

        n=0;
        a=(Math.pow(Math.log(3),n)*Math.pow(x,n))/1;
        res=0;

        while(Math.abs(a)>=r){

            res+=a;
            n++;
            p=1;

            for(int i=1;i<=n;i++){
                p=p*i;
            }

            a=(Math.pow(Math.log(3),n)*Math.pow(x,n))/p;
        }

        System.out.println("Result is:"+res);
    }
}