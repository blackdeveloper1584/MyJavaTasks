package com.company;

public class Constructor extends Toy{

    int count;

    public Constructor() {

    }

    public Constructor(String name, int price, int maxAge, int minAge, int count) {
        super(name, price, maxAge, minAge);
        this.count = count;
    }

    public String toString() {
        return super.toString() + " Variants: " + this.count;
    }
}