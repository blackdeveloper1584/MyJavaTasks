package com.company;

public class Ball extends Toy{
    int weight;

    public Ball() {

    }

    public Ball(String name, int price, int maxAge, int minAge, int weight) {
        super(name, price, maxAge, minAge);
        this.weight = weight;
    }

    public String toString() {
        return super.toString() + " Weight: " + this.weight;
    }
}