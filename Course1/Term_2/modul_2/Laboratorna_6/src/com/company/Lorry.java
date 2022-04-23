package com.company;

import java.io.*;

public class Lorry extends Car implements Serializable {

    public int weight_CarryingAbility;


    public Lorry() {

    }


    public Lorry(String tradeMark, int numberOfCylinders, int power, int weight_CarryingAbility){
        super(tradeMark, numberOfCylinders, power);
        this.weight_CarryingAbility = weight_CarryingAbility;
    }


    public void change_weight_CarryingAbility(int weight_carring_ability){
        this.weight_CarryingAbility = weight_carring_ability;
        System.out.println("The weight of car ability was changed on:::" + this.weight_CarryingAbility);
    }


    public void change_tradeMark(String new_treadMark){
        super.tradeMark = new_treadMark;
        System.out.println("The model of car was changed on:::" + super.tradeMark);
    }


    @Override
    public String toString() {
        return super.toString() + " " + this.weight_CarryingAbility;
    }

    
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeUTF(tradeMark);
        objectOutputStream.writeInt(numberOfCylinders);
        objectOutputStream.writeInt(power);
    }


    private void readObject(ObjectInputStream objectInputStream) throws Exception {
        objectInputStream.defaultReadObject();
        this.tradeMark = objectInputStream.readUTF();
        this.numberOfCylinders = objectInputStream.readInt();
        this.power = objectInputStream.readInt();
    }
}
