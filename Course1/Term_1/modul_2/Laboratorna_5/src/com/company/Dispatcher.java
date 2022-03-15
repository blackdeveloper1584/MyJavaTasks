package com.company;

import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double[][]mass=new double[6][6];
        double sum=0;

        for(int i=0;i<mass.length;i++){
            for(int j=0;j<mass.length;j++){
                System.out.println("Enter element:::");
                mass[i][j]=sc.nextDouble();
            }
        }

        for(int i=0;i<mass.length;i++){

            for(int j=0;j<mass.length;j++){
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<mass.length;i++){
            sum+=mass[i][i];
        }

        System.out.println("Sum of elements"+sum);
    }
}
