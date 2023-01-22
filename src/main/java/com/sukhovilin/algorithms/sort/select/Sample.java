package com.sukhovilin.algorithms.sort.select;

import java.util.Arrays;
import java.util.Random;

/**
 * Сортировка методом выбора. Перестановки: O(N) сравнения: O(N^2)
 * <p>
 * Данный алгоритм имеет схожесть с пузырьковой сортировкой, но работает он несколько быстрее.
 * Опять в качестве примера возьмём ряд чисел, которые мы хотим расставить в возрастающем порядке.
 * <p>
 * Суть алгоритма заключается в последовательном переборе всех чисел и выборе наименьшего элемента,
 * который мы возьмём и поменяем местами с крайним элементом слева (0 элементом).
 * <p>
 * Тут у нас получается ситуация, схожая с пузырьковой сортировкой,
 * но в данном случае отсортированным элементом у нас будет наименьший.
 * <p>
 * Поэтому, следующий проход по элементам будет начинаться с элемента под индексом 1.
 * Опять же, данные проходы будет повторяться до тех пор, пока все элементы не будут отсортированы.
 */
public class Sample {

    private static final Random RND = new Random();

    public static void main(String[] args) {

        int[] m = new int[20];

        // init
        for (int i = 0; i < m.length; i++)
            m[i] = RND.nextInt(100);

        System.out.println(Arrays.toString(m));
        sort(m);
        System.out.println(Arrays.toString(m));

    }

    private static void sort(int[] m) { // select sorting
        for (int j = 0; j < m.length - 1; j++) {

            int min = j;

            for (int k = j + 1; k < m.length; k++)
                if (m[min] > m[k])
                    min = k;

            // swap
            int t = m[j];
            m[j] = m[min];
            m[min] = t;
        }
    }

}
