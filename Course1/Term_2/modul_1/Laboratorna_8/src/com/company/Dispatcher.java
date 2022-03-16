package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dispatcher {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        Pattern p = Pattern.compile(scan.nextLine());
        Matcher m = p.matcher(scan.nextLine());
        while (m.find()){
            System.out.println(m.start()+ " "+ m.group());
        }



    }
}
