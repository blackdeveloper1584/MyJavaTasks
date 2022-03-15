package com.company;

public class Dispatcher {
    public static void main(String[] args) {

        Parent p1=new Child("Bobil",45,"Bobikovych");
        System.out.println(p1.get_info());

        Parent p2=new Child("Barsik",70,"Barsikovych");
        System.out.println(p2.get_info());

        Parent p3=new Child("Pudil",4,"Pudilovych");
        System.out.println(p3.get_info());

    }
}
