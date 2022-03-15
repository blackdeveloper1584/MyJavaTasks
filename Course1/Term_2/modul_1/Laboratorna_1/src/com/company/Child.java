package com.company;

public class Child extends Parent{

    String surname;

    public Child(){

    }

    public Child(String name,int age,String surname){
        super(name,age);
        this.surname=surname;

    }

    @Override
    public String get_info(){
        return "Name:"+super.name+" Age:"+super.age+" Surname:"+this.surname;
    }

}
