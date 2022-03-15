package com.company;
import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String string = scanner.nextLine();

        StringBuilder sb = new StringBuilder(string);

        int h = 0, count = 0;

        for(int i = 0; i < sb.length(); i++){

            if(Character.toString(string.charAt(i)).equals(" ")){
                h = h+1;
            }

            else{
                h = 0;
            }

            count = max(h, count);

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
    // Не знаю яким ще способом можна зробити це завдання
}