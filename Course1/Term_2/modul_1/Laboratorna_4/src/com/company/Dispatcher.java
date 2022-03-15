package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Dispatcher {
    public static void main(String[] args) {

        ArrayList <Toy> toy = new ArrayList<Toy>();

        toy.add(new Doll("Lalka",200,10,3,30));
        toy.add(new Ball("Myach1",500,10,4,100));
        toy.add(new Cube("Kubik1",150,5,4,20));
        toy.add(new Constructor("Konsructor1",700,14,5,40));
        toy.add(new Doll("Lalka2",375,44,5,37));
        toy.add(new Doll("Lalka3",100,30,7,40));
        toy.add(new Ball("Myach2",450,16,4,180));
        toy.add(new Constructor("Constructor2",210,10,7,40));
        toy.add(new Constructor("Constructor56",451,24,3,85));
        toy.add(new Cube("Kubik2",340,88,2,18));

        System.out.println(toy);
        System.out.println();

        ArrayList<Toy> newtoy = new ArrayList<Toy>();

        for(Toy temp:toy){
            if(temp.minAge>=4 && temp.maxAge<=10){
                newtoy.add(temp);
            }
        }

        Collections.sort(newtoy,new SortByName());

        for(Toy temp:newtoy){
            System.out.println(temp);
        }
    }
}

