package com.sukhovilin.algorithms.recursion;

import javax.sound.midi.Soundbank;
import java.util.*;

public class QSort {

    public static void main(String[] args) {
        new QSort().go();
    }


    private void go() {

        Random rnd = new Random();

        int[] raw = rnd.ints(1, 100).limit(4_000).toArray();
        int[] copy = new int[raw.length];
        System.arraycopy(raw, 0, copy, 0, raw.length);
        long start;

        start = System.nanoTime();
        qsort(raw, 0, raw.length - 1);
        System.out.println("t: " + (System.nanoTime() - start));

        start = System.nanoTime();
        Arrays.sort(copy);
        System.out.println("t: " + (System.nanoTime() - start));


    }

    private void qsort(int[] arr, int first, int last) {
        if (first >= last) return;

        int pivot = arr[last];
        int swapmarker = first;

        for (int current = first; current <= last; current++) {
            if (arr[current] <= pivot) {
                if (arr[swapmarker] > arr[current]) {
                    int t = arr[current];
                    arr[current] = arr[swapmarker];
                    arr[swapmarker] = t;
                }
                swapmarker++;
            }
        }
        qsort(arr, first, swapmarker - 2);
        qsort(arr, swapmarker, last);
    }


}
