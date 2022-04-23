package com.company;

public class Car {

    public String tradeMark;
    public int numberOfCylinders, power;


    public Car() {

    }


    public Car(String tradeMark, int numberOfCylinders, int power) {
        this.tradeMark = tradeMark;
        this.numberOfCylinders = numberOfCylinders;
        this.power = power;
    }


    public void change_power(int power) {
        this.power = power;
    }


    @Override
    public String toString() {
        return this.tradeMark + " " + this.numberOfCylinders + " " + this.power;
    }
}
