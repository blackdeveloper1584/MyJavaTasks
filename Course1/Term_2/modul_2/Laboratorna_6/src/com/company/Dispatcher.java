package com.company;

import java.io.*;

public class Dispatcher {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Car car1 = new Car("Car1",10000,4567);
        Car car2 = new Car("Car2",2354,29839);
        Lorry lorry1 = new Lorry("Lorry1",234,4586,90);
        Lorry lorry2 = new Lorry("Lorry2",38947,3495,89072);
        Lorry lorry3 = new Lorry("Lorry3",489375,90,234234);

        Lorry [] lorry_list_1 = {lorry1 , lorry2, lorry3};

        File file = new File("D:\\MyJavaTasks\\Course1\\Term_2\\modul_2\\Laboratorna_6\\test.txt");


        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(lorry_list_1);
        objectOutputStream.flush();
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Lorry [] lorry_list_2 = (Lorry[]) objectInputStream.readObject();
        objectInputStream.close();


        for(Lorry temp: lorry_list_2){
            System.out.println(temp);
        }
   }
}


