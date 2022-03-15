package com.company;

public class Dispatcher {
    public static void main(String[] args) {

        View view = new View();
        Controller controller = new Controller();
        Fractal f1 = view.enter();
        Fractal f2 = view.enter();
        System.out.println();

        System.out.println("The sum of two fractions>>>");
        view.audit_log(controller.sum(f1, f2));
        System.out.println("The difference of two fractions>>>");
        view.audit_log(controller.sub(f1, f2));
        System.out.println("The product of two fractions>>>");
        view.audit_log(controller.mult(f1, f2));
        System.out.println("The fraction of two fractions>>>");
        view.audit_log(controller.div(f1, f2));
    }
}