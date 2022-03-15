package com.company;

public class Child implements Parent{

    String name;
    String surname;
    int age;

    public Child(){

    }

    public Child(String name,int age,String surname){
        this.name=name;
        this.age=age;
        this.surname=surname;

    }

    @Override
    public String get_info(){
        return "Name:" + this.name+ " Age:" + this.age + " Surname:" + this.surname;
    }
}
