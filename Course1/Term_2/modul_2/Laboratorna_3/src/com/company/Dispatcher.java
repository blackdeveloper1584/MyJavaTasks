package com.company;

public class Dispatcher {
    public static void main(String[] args) {

        Processor[] processors = {new Processor(), new Processor(), new Computer()};
        VideoCard[] videoCards = {new VideoCard(), new VideoCard(), new Computer().doVideoCard()};
        Motherboard[] motherboards = {new Motherboard(), new Motherboard(), new Computer().doMotherboard()};

        for(Processor temp:processors){
            temp.display_info();
            System.out.println();
        }

        System.out.println();

        for(VideoCard temp:videoCards){
            temp.display_info();
            System.out.println();
        }

        System.out.println();

        for(Motherboard temp:motherboards){
            temp.display_info();
            System.out.println();
        }
    }
}
