package com.company;

import java.util.Comparator;

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
    public String toString() {
        return this.name + " " + this.second_name + " " + this.year + " " + this.bal;
    }


    public static class ComparatorByName implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            return ((Student)o1).name.compareTo(((Student)o2).name);
        }
    }


    public static class ComparatorBySecondName implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            return ((Student)o1).second_name.compareTo(((Student)o2).second_name);
        }
    }


    public static class ComparatorByYear implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            return ((Student)o1).year-((Student)o2).year;
        }
    }


    public static class ComparatorByBal implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            return ((Student)o1).bal-((Student)o2).bal;
        }
    }
}

