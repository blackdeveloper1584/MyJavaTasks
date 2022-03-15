package com.company;

import java.lang.Math;

public class Dispatcher {
    public static void main(String[] args) {

        double[]mass1=new double[11];
        double[]mass2=new double[11];
        int k;

        for(int i=0;i<mass1.length;i++){
            mass1[i]=1*i-4*Math.sin(i);
        }

        for(double el:mass1){
            System.out.println("Element of mass: "+el);
        }

        k=0;

        for(double el:mass1){

            if(el>0){
                System.out.println(el);

                mass2[k]=el;
                k++;
            }
        }

        for(int i=k;i<mass2.length;i++){
            mass2[i]=-1000;
        }

        for(double el:mass2){
            System.out.println("Element of new array: "+el);
        }
    }
}