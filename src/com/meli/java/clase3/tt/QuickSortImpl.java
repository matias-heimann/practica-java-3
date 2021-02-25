package com.meli.java.clase3.tt;

import java.util.Comparator;

public class QuickSortImpl<T> implements Sorter<T>{
    @Override
    public void sort(T[] array, Comparator<T> comparable) {
        quickSortIterative(array, 0, array.length - 1, comparable);
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

        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (comparator.compare(arr[j], pivot) <= 0) {
                i++;

                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private void quickSortIterative(T[] arr, int l, int h, Comparator<T> comparator)
    {
        int[] stack = new int[h - l + 1];

        int top = -1;

        stack[++top] = l;
        stack[++top] = h;

        while (top >= 0) {
            // Pop h and l
            h = stack[top--];
            l = stack[top--];

            int p = partition(arr, l, h, comparator);

            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }
    }
}
