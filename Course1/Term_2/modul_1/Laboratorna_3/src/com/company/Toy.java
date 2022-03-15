package com.company;

public abstract class Toy {

    String name;
    int price;
    int maxAge;
    int minAge;

    public Toy() {

    }

    public Toy(String name, int price, int maxAge, int minAge) {
        this.name = name;
        this.price = price;
        this.maxAge = maxAge;
        this.minAge = minAge;
    }

    public String toString() {
        return "Name: " + this.name + " Price: " + this.price + " MaxAge: " + this.maxAge + " MinAge: " + this.minAge;
    }
}