package com.company;

import java.io.*;

public class Car implements Externalizable{

    public String tradeMark;
    public int numberOfCylinders, power;


    public Car(){

    }


    public Car(String tradeMark, int numberOfCylinders, int power){
        this.tradeMark = tradeMark;
        this.numberOfCylinders = numberOfCylinders;
        this.power = power;
    }


    public void change_power(int power) {
        this.power = power;
    }


    @Override
    public String toString() {
        return this.tradeMark + " " + this.numberOfCylinders + " " + this.power;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(this.tradeMark);
        out.writeInt(this.numberOfCylinders);
        out.writeInt(this.power);

    }


    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.tradeMark = in.readUTF();
        this.numberOfCylinders = in.readInt();
        this.power = in.readInt();
    }
}