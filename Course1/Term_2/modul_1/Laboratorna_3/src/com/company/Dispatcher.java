package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Dispatcher {
    public static void main(String[] args) {

        Toy[] toy = new Toy[10];

        toy[0]=new Doll("Lalka",200,10,3,30);
        toy[1]=new Ball("Myach1",500,10,4,100);
        toy[2]=new Cube("Kubik1",150,5,4,20);
        toy[3]=new Constructor("Konsructor1",700,14,5,40);
        toy[4]=new Doll("Lalka2",375,44,5,37);
        toy[5]=new Doll("Lalka3",100,30,7,40);
        toy[6]=new Ball("Myach2",450,16,4,180);
        toy[7]=new Constructor("Constructor2",210,10,7,40);
        toy[8]=new Constructor("Constructor56",451,24,3,85);
        toy[9]=new Cube("Kubik2",340,88,2,18);

        System.out.println(Arrays.toString(toy));
        System.out.println();


        Toy[] newtoy=new Toy[10];


        int j=0;
        for(Toy temp:toy){
            if(temp.minAge>=4 && temp.maxAge<=10){
              newtoy[j]=temp;
              j++;

            }
        }


        Arrays.sort(newtoy,new SortByName());

        for (Toy temp:newtoy){
            if(!Objects.isNull(temp)) {
                System.out.println(temp);
            }
        }

//        System.out.println(Arrays.toString(newtoy));
    }
}
