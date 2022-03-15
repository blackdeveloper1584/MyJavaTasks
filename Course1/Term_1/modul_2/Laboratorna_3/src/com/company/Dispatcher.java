package com.company;

import java.lang.Math;

public class Dispatcher {
    public static void main(String[] args) {

        double[]massx=new double[11];
        double[]massy=new double[11];
        double[]massz=new double[11];

        int h;
        int k;


        for(int i=0;i<massx.length;i++){
            massx[i]=Math.sin(i)+Math.cos(i);
        }

        for(int i=0;i<massy.length;i++){
            massy[i]=Math.pow(i,2)*Math.tan(i);
        }

        for(double el:massx){
            System.out.println("Element of massx "+el);
        }

        for(double el:massy){
            System.out.println("Element of massy "+el);
        }
        
        k=0;
        h=0;

        for(int i=0;i<massz.length;i++){
            massz[i]=massx[k]*massy[h];
            k++;
            h++;
        }

        for(double el:massz){
            System.out.println("Element of massz "+el);
        }
    }
}