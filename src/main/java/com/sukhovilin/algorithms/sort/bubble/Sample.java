package com.sukhovilin.algorithms.sort.bubble;

import java.util.Arrays;
import java.util.Random;

/**
 * Пузырьковая сортировка. O(N^2)
 * <p>
 * Данный алгоритм сортировки известен в первую очередь за счёт своей простоты, однако при этом он имеет одну из наиболее низких скоростей выполнения.
 * <p>
 * В качестве примера рассмотрим пузырьковую сортировку для чисел в возрастающем порядке.
 * <p>
 * Представим себе цепочку случайно расставленных чисел, для которых будут выполняться следующие шаги, начиная с начала цепочки:
 * <p>
 * сравнить два числа;
 * если число слева больше, то поменять их местами;
 * перейти на одну позицию вправо.
 * <p>
 * После прохождения по всей цепочке с выполнением данных шагов мы обнаружим, что наибольшее число оказалось в конце нашего ряда чисел.
 */
public class Sample {

    private static final Random RND = new Random();

    public static void main(String[] args) {

        int[] m = new int[10];

        // init
        for (int i = 0; i < m.length; i++)
            m[i] = RND.nextInt(50);


        System.out.println(Arrays.toString(m)); // before
        sort(m);
        System.out.println(Arrays.toString(m)); // after

    }

    private static void sort(int[] m) { // bubble sorting

        for (int i = m.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (m[j] > m[j + 1]) {
                    int t = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = t;
                }
    }
}
