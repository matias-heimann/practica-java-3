package com.meli.java.clase3.tt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BubleSortImpl<Integer> quickSort = (BubleSortImpl<Integer>)MyFactory.getInstance("sorter");
        if(quickSort == null){
            System.out.println("ERROR");
            return;
        }

        Integer[] numbers = new Integer[5];
        numbers[0] = 120;
        numbers[1] = 344;
        numbers[2] = 10;
        numbers[3] = 5;
        numbers[4] = 86;
        quickSort.sort(numbers, (i1, i2) -> i1 - i2);
        Arrays.stream(numbers).forEach(i -> System.out.print(i + " "));
        System.out.println();

        BubleSortImpl<String> quickSort2 = (BubleSortImpl<String>)MyFactory.getInstance("sorter");
        if(quickSort == null){
            System.out.println("ERROR");
            return;
        }
        String[] cadena = {"chau", "hola", "no", "si", "joya"};
        quickSort2.sort(cadena, (i1, i2) -> i1.compareTo(i2));
        Arrays.stream(cadena).forEach(i -> System.out.print(i+ " "));
        System.out.println();
        quickSort.printSortType();

    }
}
