package com.company;

public class Dispatcher {
    public static void main(String[] args) {

        View v=new View();
        Controller c=new Controller();
        IntPower ip1=v.input();
        v.print_res(ip1.first,ip1.second);
        System.out.println();

        IntPower ip2=v.input();
        v.print_res(ip2.first);
        System.out.println();

        IntPower ip3=v.input();
        v.print_res(ip3.second);
        System.out.println();

        IntPower ip4=v.input();
        double z=c.power(ip4.first,ip4.second);
        System.out.println(ip4.first+"^"+ip4.second+" == "+z);
        System.out.println();

        IntPower ip5=new IntPower(74,10);
        System.out.println(ip5.first+" "+ip5.second);


    }
}