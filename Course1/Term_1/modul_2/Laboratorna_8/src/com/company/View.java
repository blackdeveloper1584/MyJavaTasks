package com.company;

import java.util.Scanner;

public class View {
    Scanner scan= new Scanner(System.in);

    void print_res(double f,double s){
        System.out.println("First num:::"+f);
        System.out.println("Second num:::"+s);

    }

    void print_res(double z){
        System.out.println("The num:::"+z);

    }

    void print_num(IntPower ip){
        System.out.println("first num::: "+ip.first+"\nsecond num::: "+ip.second);

    }

    IntPower input(){
        System.out.print("Enter first num>>>");
        double first_num=scan.nextDouble();
        System.out.print("Enter second num>>>");
        double second_num=scan.nextDouble();

        IntPower temp = new IntPower(first_num,second_num);
        return temp;
    }

}