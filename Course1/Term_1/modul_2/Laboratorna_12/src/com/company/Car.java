package com.company;

public class Car {

    public String name;
    public double max_speed;

    public Car(){

    }

    public Car(String name,double max_speed){
        this.name=name;
        this.max_speed=max_speed;
    }

    public double price(){
        this.update_model();
        return this.max_speed*100;
    }

    public double update_model(){
        this.max_speed=this.max_speed+10;
        return this.max_speed;
    }

    public String information(){
        return "Name of car:"+this.name+", "+" Speed of car:"+this.max_speed+", "+"Price of car:"+this.price();
    }
}