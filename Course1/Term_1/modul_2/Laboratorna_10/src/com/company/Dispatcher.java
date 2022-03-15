package com.company;

public class Dispatcher {

    public static void main(String[] args) {
        Car car1 = new Car("Car1", 10000, 4567);
        Lorry lorry1 = new Lorry("Lorry1", 234, 4586, 90);
        System.out.println(car1.toString());
        System.out.println(lorry1.toString());
        System.out.println();


        Car car2 = new Car("Car2", 2354, 29839);
        Lorry lorry2 = new Lorry("Lorry2", 38947, 3495, 89072);
        System.out.println(car2.equals(lorry2));
        System.out.println(lorry2.equals(lorry1));
        System.out.println();


        Car car3 = new Car("Car3", 20020, 90000);
        Lorry lorry3 = new Lorry("Lorry3", 489375, 90, 234234);
        car3.change_power(173641);
        car3.change_power(264782);
        lorry3.change_tradeMark("Car3");
        lorry3.change_weight_CarryingAbility(934);
        System.out.println(car3.equals(lorry3));
        System.out.println(lorry3.equals(car3));
        System.out.println();


        Car car4 = new Car("Car4", 3485, 734);
        Lorry lorry4 = new Lorry("Lorry4", 5894, 1, 235);
        System.out.println(car4.toString());
        System.out.println(lorry4.toString());
        lorry4.change_tradeMark("Car4");
        System.out.print(car4.equals(lorry4));
    }
}
