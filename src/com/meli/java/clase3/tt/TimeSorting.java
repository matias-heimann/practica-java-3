package com.meli.java.clase3.tt;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class TimeSorting {
    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        Integer[] list = new Integer[100000];
        for(int i = 0; i < list.length; i++){
            list[i] = 100000 - i;
        }
        Sorter<Integer> sorter = (Sorter<Integer>) MyFactory.getInstance("sorter");
        if(sorter == null){
            System.out.println("ERROR");
            return;
        }
        long start = System.currentTimeMillis();
        sorter.sort(list, (i1, i2) -> i1 - i2);
        System.out.println(System.currentTimeMillis() - start);
    }
}
