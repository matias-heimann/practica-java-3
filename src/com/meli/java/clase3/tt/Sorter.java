package com.meli.java.clase3.tt;

import java.util.Comparator;

public interface Sorter <T>{

    public void sort(T[] array, Comparator<T> comparable);
    public void printSortType();

}
