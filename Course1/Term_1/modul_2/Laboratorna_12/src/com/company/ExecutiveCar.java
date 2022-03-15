package com.company;

public class ExecutiveCar extends Car {

    public ExecutiveCar(){

    }

    public ExecutiveCar(String name,double max_speed){
        super.name=name;
        super.max_speed=max_speed;
    }

    @Override
    public double price(){
        this.update_model();
        return super.max_speed*250;
    }

    @Override
    public double update_model(){
        super.max_speed=super.max_speed+5;
        return super.max_speed;
    }

    @Override
    public String information(){
        return "Name of car:"+this.name+", "+" Speed of car:"+this.max_speed+", "+"Price of car:"+this.price();
    }
}