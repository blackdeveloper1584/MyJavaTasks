package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        double res;
        double y;

        System.out.print("Enter n:");
        int n=sn.nextInt();
        res=0;

        for(int i=1;i<=n;i++){
            res=res+(Math.pow(i,2))/10;
        }

        y=Math.sqrt(res);

        System.out.println("Result is:"+y);
    }
}
