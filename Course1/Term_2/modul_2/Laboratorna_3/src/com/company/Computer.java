package com.company;

public class Computer extends Processor{

    int flag = 0;

    public void display_info(){
        flag = 1;
        check();
    }

    public VideoCard doVideoCard(){
        return new VideoCard(){

            public void display_info(){
                flag = 2;
                check();
                super.display_info();
                System.out.println("Computer");
            }
        };
    }

    public Motherboard doMotherboard(){
        return new Motherboard(){

            public void display_info(){
                flag = 2;
                check();
                super.display_info();
                System.out.println("Computer");
            }

        };
    }

    public void check(){

        switch (flag){

            case 1:
                super.display_info();
                new VideoCard().display_info();
                System.out.println("Computer");
                break;

            case 2:
                super.display_info();
                new Motherboard().display_info();
                System.out.println("Computer");
                break;

            default:
                super.display_info();
        }
    }
}
