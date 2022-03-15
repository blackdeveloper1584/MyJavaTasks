package com.company;

public class Doll extends Toy{

    int size;

    public Doll() {

    }

    public Doll(String name, int price, int maxAge, int minAge, int size) {
        super(name, price, maxAge, minAge);
        this.size = size;
    }

    public String toString() {
        return super.toString() + " Size: " + this.size;
    }
}