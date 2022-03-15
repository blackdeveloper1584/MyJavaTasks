package com.company;

import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double[]mass=new double[10];
        int k=0;

        for(int i=0;i<mass.length;i++){
            System.out.print("Enter element of array "+k+":::");
            mass[i]=sc.nextDouble();
            k++;
        }
        k=0;

        for(double el:mass){
            System.out.println("Element of array "+k+":::"+el);
            k++;
        }

        for (int i = 0; i < mass.length - 1; i++) {

            for (int j = mass.length - 1; j > i; j--) {
                if (mass[j]>mass[j-1]) {
                    double tmp = mass[j - 1];
                    mass[j - 1] = mass[j];
                    mass[j] = tmp;
                }
            }
        }
        k=0;

        for(double el:mass){
            System.out.println("Element of array "+k+":::"+el);
            k++;
        }
    }
}