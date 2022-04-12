package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Dispatcher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number from 1 to 3:::");
        int number = scanner.nextInt();

//        if(args.length > 0){
//            number = Integer.parseInt(args[0]);
//        }
//
//        else {
//            number = 0;
//        }

        Student student1 = new Student("Topic", "Topickovych", 11, 80);
        Student student2 = new Student("Tuzyk", "Vivch", 10, 41);
        Student student3 = new Student("Bob", "Pudel", 17, 100);
        Student student4 = new Student("Nika", "Hasky", 8, 98);
        Student student5 = new Student("Jack", "Pidbool", 21, 37);
        Student student6 = new Student("Bobik", "Bobikovych", 19, 99);
        Student student7 = new Student("Barsik", "Barsikovych", 60, 51);
        Student student8 = new Student("Luccy", "Luccyvych", 21, 2);
        Student student9 = new Student("Jack", "Jackovych", 7, 12);
        Student student10 = new Student("Pudel", "Pudelovych", 45, 74);


        Student[] s = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};

        for (Student temp:s){
            System.out.println(temp);
        }

        System.out.println();

        switch (number){

            case 1: Arrays.sort(s, new Student.ComparatorBySecondName());
                break;

            case 2: Arrays.sort(s, new Student.ComparatorByYear());
                break;

            case 3: Arrays.sort(s, new Student.ComparatorByBal());
                break;

            default: Arrays.sort(s, new  Student.ComparatorByName());
        }

        for (Student temp : s){
            System.out.println(temp);
        }
    }
}
