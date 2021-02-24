package com.meli.java.clase3.tt;

import java.util.Comparator;

public class HeapSortImpl<T> implements Sorter<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparable) {
        sortPriv(array, comparable);
    }

    @Override
    public void printSortType() {
        System.out.println("Heap Sort");
    }

    public void sortPriv(T arr[], Comparator<T> comparator)
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i, comparator);

        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0, comparator);
        }
    }

    void heapify(T arr[], int n, int i, Comparator<T> comparator)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && comparator.compare(arr[l], arr[largest]) > 0)
            largest = l;

        if (r < n && comparator.compare(arr[r], arr[largest]) > 0)
            largest = r;

        if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest, comparator);
        }
    }
}
