package com.sukhovilin.tasks.local_min;

public class App {
    public static void main(String[] args) {
        new App().go();
    }

    private void go() {
        int[] arr = {3,4,8,1,5};
        int result = localMin(arr, 1);
        System.out.println(result);
    }

    private int localMin(int[] arr, int n) {
        return _localMin(arr, 0, n - 1, n);
    }

    private int _localMin(int[] arr, int low, int high, int n) {
        int mid = low + (high - low) / 2;
        // Compare middle element with its neighbours
        // (if neighbours exist)
        if (mid == 0 || arr[mid - 1] > arr[mid] && mid == n - 1 ||
                arr[mid] < arr[mid + 1])
            return mid;

            // If middle element is not minima and its left
            // neighbour is smaller than it, then left half
            // must have a local minima.
        else if (mid > 0 && arr[mid - 1] < arr[mid])
            return _localMin(arr, low, mid - 1, n);

        // If middle element is not minima and its right
        // neighbour is smaller than it, then right half
        // must have a local minima.
        return _localMin(arr, mid + 1, high, n);
    }

}
