package com.meli.java.clase3.tt;

import java.util.Comparator;

public class QuickSortImpl<T> implements Sorter<T>{
    @Override
    public void sort(T[] array, Comparator<T> comparable) {
        sort(array, 0, array.length - 1, comparable);
    }

    @Override
    public void printSortType() {
        System.out.println("Quick Sort");
    }

    @Override
    public String toString() {
        return "QUICK SORT";
    }

    private int partition(T arr[], int low, int high, Comparator<T> comparator)
    {
        T pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (comparator.compare(arr[j], pivot) <= 0)
            {
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        T temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    private void sort(T arr[], int low, int high, Comparator<T> comparator)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high, comparator);
            sort(arr, low, pi-1, comparator);
            sort(arr, pi+1, high, comparator);
        }
    }
}
