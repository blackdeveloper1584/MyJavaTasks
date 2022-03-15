package com.company;

import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[][]mass=new double[6][6];

        for(int i=0;i<mass.length;i++){
            for(int j=0;j<mass.length;j++){
                System.out.print("Enter element:::");
                mass[i][j]=sc.nextDouble();
            }
        }

        for(int i=0;i<mass.length;i++){
            for(int j=0;j<mass.length;j++){
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }

        for(int k=0;k<mass.length;k++){
            for(int i=0;i<mass[k].length-1;i++){
                for(int j=mass[k].length-1;j>i;j--){
                    if(mass[k][j]>mass[k][j-1]){
                        double temp=mass[k][j-1];
                        mass[k][j-1]=mass[k][j];
                        mass[k][j]=temp;
                    }
                }
            }
        }

        for(int i=0;i<mass.length;i++){
            for(int j=0;j<mass.length;j++){
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }

    }
}