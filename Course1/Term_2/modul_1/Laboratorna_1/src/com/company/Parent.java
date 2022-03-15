package com.company;

public abstract class Parent {

    String name;
    int age;

    public Parent(){

    }

    public Parent(String name,int age){
        this.name=name;
        this.age=age;
    }

    public abstract String get_info();
}
