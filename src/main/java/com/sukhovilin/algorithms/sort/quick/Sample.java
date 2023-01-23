package com.sukhovilin.algorithms.sort.quick;

import java.util.Arrays;
import java.util.Random;

/**
 * Быстрая сортировка. O(n * log(n))
 * <p>
 * В списке с элементами выбирается опорный элемент — по сути любой элемент,
 * относительно которого нужно отсортировать остальные значения. Значения меньше его — слева, значения больше — справа.
 * <p>
 * Далее у правой и левой части также выбирается по опорному элементу и происходит то же самое: сортируются значения
 * относительно этих элементов, потом у образовавшихся частей выбираются  опорные элементы — и так до тех пор, пока мы не получим отсортированный ряд.
 */
public class Sample {

    public static void main(String[] args) {

        int[] arr = new Random().ints(20, 5, 50).toArray();

        System.out.println(Arrays.toString(arr));
        qSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void qSort(final int[] array, final int low, final int high) {

        int l = low;
        int r = high;
        int mid = array[(low + high) / 2];

        do {
            while (array[l] < mid)
                l++;
            while (array[r] > mid)
                r--;
            if (l <= r) {

                // swap
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                //~swap

                l++;
                r--;
            }
        } while (l <= r);

        if (low < r)
            qSort(array, low, r);

        if (l < high)
            qSort(array, l, high);
    }
}
