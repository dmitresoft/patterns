package com.sukhovilin.algorithms.sort.insert;

import java.util.Arrays;
import java.util.Random;

/**
 * Сортировка методом вставки. O(N^2).
 * <p>
 * В очередной раз для примера возьмём ряд чисел, которые мы хотим расставить в возрастающем порядке.
 * <p>
 * Данный алгоритм заключается в выставлении маркера, слева от которого элементы будут уже частично отсортированы между собой.
 * На каждом шаге алгоритма будет выбираться один из элементов и помещаться на нужную позицию в уже отсортированной последовательности.
 * Таким образом, отсортированная часть будет увеличиваться до тех пор, пока не будут просмотрены все элементы.
 */
public class Sample {

    private static final Random RND = new Random();
    private static final int MAX = 20;

    public static void main(String[] args) {

        int[] m = new int[10];

        // init
        for (int i = 0; i < m.length; i++)
            m[i] = RND.nextInt(MAX);

        System.out.println(Arrays.toString(m));
        sort(m);
        System.out.println(Arrays.toString(m));

    }

    private static void sort(int[] m) { // Insert sorting implementation
        for (int j = 1; j < m.length; j++) {

            final int tmp = m[j];

            int k = j;

            for (; k > 0 && tmp < m[k - 1]; k--)
                m[k] = m[k - 1];

            m[k] = tmp;
        }
    }

}
