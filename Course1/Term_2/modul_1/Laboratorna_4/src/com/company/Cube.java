package com.company;

public class Cube extends Toy{

    int count;

    public Cube() {

    }

    public Cube(String name, int price, int maxAge, int minAge, int count) {
        super(name, price, maxAge, minAge);
        this.count = count;
    }

    public String toString() {
        return super.toString() + " Amount: " + this.count;
    }
}