package com.company;

public class Lorry extends Car {

    public int weight_CarryingAbility;

    public Lorry(){

    }

    public Lorry(String tradeMark,int numberOfCylinders,int power,int weight_CarryingAbility){
        super(tradeMark,power,numberOfCylinders);
        this.weight_CarryingAbility=weight_CarryingAbility;
    }

    public void change_weight_CarryingAbility(int weight_carring_ability){
        this.weight_CarryingAbility=weight_carring_ability;
        System.out.println("The weight of car ability was changed on:::"+this.weight_CarryingAbility);
    }

    public void change_tradeMark(String new_treadMark){
        super.tradeMark=new_treadMark;
        System.out.println("The model of car was changed on:::"+super.tradeMark);
    }

    @Override
    public String toString(){
        return super.tradeMark+" "+super.power+" "+super.numberOfCylinders+" "+this.weight_CarryingAbility;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Lorry){
            return this.tradeMark==((Lorry)o).tradeMark;
        }

        else{
            return false;
        }
    }
}