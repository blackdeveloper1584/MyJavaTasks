package com.company;

public class Student {

    String name, second_name;
    int year, bal;

    public Student(){

    }

    public Student(String name, String second_name, int year, int bal){

        this.name = name;
        this.second_name = second_name;
        this.year = year;
        this.bal = bal;
    }


    @Override
    public String toString(){
        return this.name + " " + this.second_name + " " + this.year + " " + this.bal;
    }
}
