package com.meli.java.clase3.tt;

import java.util.Comparator;

public class BubleSortImpl<T> implements Sorter<T>{
    @Override
    public void sort(T[] array, Comparator<T> comparator) {

        boolean isSorted = false;

        for(int i = 0; i < array.length && !isSorted; i++){
            isSorted = true;
            for(int j = 0; j < array.length - 1 - i; j++){
                if(comparator.compare(array[j], array[j+1]) > 0){
                    T aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                    isSorted = false;
                }
            }
        }
    }

    @Override
    public void printSortType() {
        System.out.println("Bubble sort");
    }
}
