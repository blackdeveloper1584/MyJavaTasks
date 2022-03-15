package com.company;

import java.util.Comparator;

public class SortByName implements Comparator {

    @Override
    public int compare(Object arg1,Object arg2){
        if(arg1 instanceof Toy && arg2 instanceof Toy) {
            return ((Toy) arg1).name.compareTo(((Toy) arg2).name);
        }
        return -1;
    }
}
