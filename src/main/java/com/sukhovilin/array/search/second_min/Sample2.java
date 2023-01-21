package com.sukhovilin.array.search.second_min;

public class Sample2 {

    public static void main(String[] args) {

        int[] arr = { 3, 2, 4, 7, 2, 9, 12, 2};
        int[] arr1 = {-4, -5, -4, 0, 2, 10, 3, -3};

        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;

        for (int el : arr) {

            if (el < f) {
                s = f;
                f = el;
            }
else if (el<s){
s=el;
            }
//            if (el < s && el > f) {
//                s = el;
//            }


        }

        System.out.println(f);
        System.out.println(s);


        int[] elements = { 3, 2, 4, 7, 2, 9, 12, 2};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < smallest) {
                secondSmallest = smallest;
                smallest = elements[i];
            } else if (elements[i] < secondSmallest) {
                secondSmallest = elements[i];
            }
        }

        System.out.println(smallest);
        System.out.println(secondSmallest);

    }

}
