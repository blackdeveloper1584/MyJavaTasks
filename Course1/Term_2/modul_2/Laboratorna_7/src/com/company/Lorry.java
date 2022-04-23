package com.company;

import java.io.*;

public class Lorry extends Car{

    public int weight_CarryingAbility;


    public Lorry(){

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


    @Override
    public void writeExternal(ObjectOutput out) throws IOException{
        super.writeExternal(out);
        out.writeInt(this.weight_CarryingAbility);
    }


    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
        super.readExternal(in);
        this.weight_CarryingAbility = in.readInt();
    }
}
