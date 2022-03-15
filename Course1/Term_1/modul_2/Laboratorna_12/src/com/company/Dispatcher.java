package com.company;

public class Dispatcher {
    public static void main(String[] args) {

        Car car1=new Car("Car1",140);
        ExecutiveCar first_car=new ExecutiveCar("First_Car",160);

        System.out.println(car1.information());
        System.out.println(first_car.information());

        car1.update_model();
        first_car.update_model();

        System.out.println(car1.information());
        System.out.println(first_car.information());
    }
}
