package com.company;

import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double[]mass=new double[12];
        int k;
        int h;

        for(int i=0;i<mass.length;i++){
            System.out.print("Enter a value for the mass "+i+":::");
            mass[i]=sc.nextDouble();
        }

        k=0;
        h=0;

        for(double el:mass){
            System.out.println("Array element with index "+h+":::"+el);
            h++;
        }

        for(double el:mass){
            if(el>-7){
                k++;
            }
        }

        System.out.println("Number of items greater than -7:::"+k);

    }
}