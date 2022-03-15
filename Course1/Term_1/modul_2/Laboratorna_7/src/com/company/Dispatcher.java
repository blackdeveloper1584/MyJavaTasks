package com.company;

import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter your string:");
        String s=sc.nextLine();
        int count=0;

        for(int i=0;i<s.length();i++){

            if(Character.toString(s.charAt(i)).equals("A")){
                count++;
            }
        }

        System.out.println("The number of items in string:::"+count);

    }
}