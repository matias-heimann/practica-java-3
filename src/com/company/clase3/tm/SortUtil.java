package com.company.clase3.tm;

public class SortUtil {

    public static <T extends Precedable<T>> void ordenar(T[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j].precede((T)arr[j+1]) > 0){
                    T aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
}
