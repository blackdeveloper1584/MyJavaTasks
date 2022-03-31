package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dispatcher {

    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);

        System.out.print("Enter your string: ");
        String string = scan.nextLine();

        Pattern p = Pattern.compile("\s");
        Matcher m1 = p.matcher(string);
        Matcher m2 = p.matcher(string);

        int length_of_mass = 0;

        while (m1.find()){
            m1.start();
            length_of_mass++;
        }

        int mass [] = new int[length_of_mass];
        int i = 0;

        while (m2.find()){
            mass[i] = m2.start();
            i++;
        }

        int h = 0, count = 0;

        for(int j = 0; j < mass.length - 1; j++){

            if(Math.abs(mass[j+1]-mass[j]) == 1){
                h++;
            }

            else{
                h = 0;
            }

            count = max(h, count);
        }

        if(count >= 1){
            count++;        //Додаємо 1, оскільки по массиві проходились на один елемент менше
        }

        else  if(mass.length == 1){
            count = 1;
        }

        System.out.println("The maximum number of spaces in the string: " + count);
    }

    public static  int max (int a, int b){

        int max = 0;

        if(a > b){
            max = a;
        }

        else {
            max = b;
        }

        return max;
    }
}
