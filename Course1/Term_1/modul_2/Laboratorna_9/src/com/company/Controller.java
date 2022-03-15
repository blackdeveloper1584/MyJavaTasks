package com.company;

public class Controller {

    Fractal sum(Fractal fractal1, Fractal fractal2) {
        int numerator = fractal1.numerator * fractal2.denominator + fractal2.numerator * fractal1.denominator;
        int denominator = fractal1.denominator * fractal2.denominator;

        Fractal res=new Fractal(numerator,denominator);
        return res;
    }

    Fractal mult(Fractal fractal1, Fractal fractal2) {
        int numerator = fractal1.numerator * fractal2.numerator;
        int denominator = fractal1.denominator * fractal2.denominator;

        Fractal res=new Fractal(numerator,denominator);
        return res;
    }

    Fractal sub(Fractal fractal1, Fractal fractal2) {
        int numerator = fractal1.numerator * fractal2.denominator - fractal2.numerator * fractal1.denominator;
        int denominator = fractal1.denominator * fractal2.denominator;

        Fractal res=new Fractal(numerator,denominator);
        return res;
    }

    Fractal div(Fractal fractal1, Fractal fractal2) {
        int numerator = fractal1.numerator * fractal2.denominator;
        int denominator = fractal1.denominator * fractal2.numerator;

        Fractal res=new Fractal(numerator,denominator);
        return res;
    }

    int get_largest_common_multiple(int numerator, int denominator){

        while(denominator!=0){
            int res=numerator%denominator;
            numerator=denominator;
            denominator=res;
        }

        return numerator;

    }

    Fractal reduce(Fractal fractal){
        int largestCommonMultiple=get_largest_common_multiple(fractal.numerator,fractal.denominator);
        int numerator=fractal.numerator/largestCommonMultiple;
        int denominator=fractal.denominator/largestCommonMultiple;

        Fractal res=new Fractal(numerator,denominator);
        return res;
    }


    Fractal fractal_with_whole_part(Fractal fractal){
        int wholepart=fractal.numerator/fractal.denominator;
        int numerator=fractal.numerator-(wholepart*fractal.denominator);

        Fractal res=new Fractal(numerator,fractal.denominator,wholepart);
        return res;
    }
}
