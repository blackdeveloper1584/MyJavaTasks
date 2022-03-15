package com.company;

public class Fractal {
    int wholepart;
    int numerator;
    int denominator;

    Fractal(){

    }

    Fractal(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }

    Fractal(int numerator,int denominator,int wholepart){
        this(numerator,denominator);
        this.wholepart=wholepart;
    }

}