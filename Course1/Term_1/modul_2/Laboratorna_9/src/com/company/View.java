package com.company;

import java.util.Scanner;

public class View {

    Controller controller=new Controller();

    Fractal enter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        Fractal fractal = new Fractal(numerator, denominator);
        return fractal;
    }

    void logLine(int length_of_line) {
        for(int i = 0; i < length_of_line; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    void audit_log(Fractal fractal) {

        Fractal reducedFractal = controller.reduce(fractal);
        Fractal fractal_with_whole_part = reducedFractal;

        if(fractal.denominator == fractal.numerator) {
            System.out.println(1);
        }
        else if(fractal.numerator == 0) {
            System.out.println(0);
        }
        else {
            if(reducedFractal.numerator > reducedFractal.denominator) {
                fractal_with_whole_part = controller.fractal_with_whole_part(reducedFractal);
            }
            if(fractal_with_whole_part.wholepart < 0) {
                fractal_with_whole_part.numerator = Math.abs(fractal_with_whole_part.numerator);
                fractal_with_whole_part.denominator = Math.abs(fractal_with_whole_part.denominator);
            }

            int length_of_line = Integer.toString(Math.max(Math.abs(fractal_with_whole_part.numerator), Math.abs(fractal_with_whole_part.denominator))).length();
            if(fractal_with_whole_part.wholepart != 0) {
                int wholePartLength = Integer.toString(fractal_with_whole_part.wholepart).length();

                for(int i = 0; i < wholePartLength; i++) {
                    System.out.print(" ");
                }

                System.out.println(fractal_with_whole_part.numerator);
                System.out.print(fractal_with_whole_part.wholepart);
                this.logLine(length_of_line);

                for(int i = 0; i < wholePartLength; i++) {
                    System.out.print(" ");
                }

                System.out.println(fractal_with_whole_part.denominator);
            }

            else {
                System.out.println(fractal_with_whole_part.numerator);
                this.logLine(length_of_line);
                System.out.println(fractal_with_whole_part.denominator);
            }
        }

    }
}