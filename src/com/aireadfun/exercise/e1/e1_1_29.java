package com.aireadfun.exercise.e1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by airead on 15/10/28.
 */
public class e1_1_29 {

    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param a   the array of integers, must be sorted in ascending order
     * @param key the search key
     * @return index of key in array <tt>a</tt> if present; <tt>-1</tt> otherwise
     */
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            StdOut.printf("%d, ", arr[i]);
        }
        StdOut.printf("\n");
    }

    public static int rank(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else {
                while (mid > 0 && a[mid - 1] == a[mid]) {
                    mid--;
                }
                return mid;
            }
        }

        return lo;
    }

    public static int count(int[] a, int key) {
        int r = rank(a, key);
        int count = 0;
        while (r < a.length && a[r] == key) {
            r++;
            count++;
        }

        return count;
    }

    /**
     * Reads in a sequence of integers from the whitelist file, specified as
     * a command-line argument; reads in integers from standard input;
     * prints to standard output those integers that do <em>not</em> appear in the file.
     */
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 4, 4, 4, 6, 7};
        printArr(arr);

        StdOut.printf("%d rank: %d\n", 2, rank(arr, 2)); // 2
        StdOut.printf("%d rank: %d\n", 3, rank(arr, 3)); // 5
        StdOut.printf("%d rank: %d\n", 4, rank(arr, 4)); // 6
        StdOut.printf("%d rank: %d\n", 5, rank(arr, 5)); // 8

        StdOut.printf("%d count: %d\n", 2, count(arr, 2)); // 4
        StdOut.printf("%d count: %d\n", 3, count(arr, 3)); // 0
        StdOut.printf("%d count: %d\n", 4, count(arr, 4)); // 3
        StdOut.printf("%d count: %d\n", 5, count(arr, 5)); // 0
    }

}
