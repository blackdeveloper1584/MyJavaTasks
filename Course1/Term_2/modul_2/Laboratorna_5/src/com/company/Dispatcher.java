package com.company;

import java.io.*;

public class Dispatcher {

    public static void main(String[] args) throws IOException {

        Car car1 = new Car("Car1",10000,4567);
        Car car2 = new Car("Car2",2354,29839);
        Lorry lorry1 = new Lorry("Lorry1",234,4586,90);
        Lorry lorry2 = new Lorry("Lorry2",38947,3495,89072);
        Lorry lorry3 = new Lorry("Lorry3",489375,90,234234);

        Car[] cars_list = {car1, car2, lorry1, lorry2, lorry3};

        File file = new File("D:\\MyJavaTasks\\Course1\\Term_2\\modul_2\\Laboratorna_5\\test.txt");


        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));

        for(Car temp:cars_list){
            dataOutputStream.writeUTF(temp.tradeMark);
            dataOutputStream.writeInt(temp.numberOfCylinders);
            dataOutputStream.writeInt(temp.power);
            if(temp instanceof Lorry){
                dataOutputStream.writeInt(((Lorry) temp).weight_CarryingAbility);
            }
        }

        dataOutputStream.flush();
        dataOutputStream.close();


        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));

        for(int i = 1; i <= 5; i++){
            System.out.print(dataInputStream.readUTF() + " " + dataInputStream.readInt() + " " + dataInputStream.readInt());

            if(i > 2){
                System.out.print(" " + dataInputStream.readInt());
            }

            System.out.println();
        }

        dataInputStream.close();
    }
}
