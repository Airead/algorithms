package com.aireadfun.exercise.e1;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by airead on 15/10/28.
 */
public class e1_1_28 {

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

    /**
     * Reads in a sequence of integers from the whitelist file, specified as
     * a command-line argument; reads in integers from standard input;
     * prints to standard output those integers that do <em>not</em> appear in the file.
     */
    public static void main(String[] args) {

        // read the integers from a file
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        int[] noDupWhiteList = new int[whitelist.length];

        printArr(whitelist);

        int count = 0;
        // sort the array
        Arrays.sort(whitelist);

        for (int i = 0; i < whitelist.length; i++) {
            if (i == 0) {
                noDupWhiteList[i] = whitelist[i];
            } else {
                if (whitelist[count] != whitelist[i]) {
                    count++;
                    noDupWhiteList[count] = whitelist[i];
                }
            }
        }

        int[] wlist = new int[count + 1];
        for (int i = 0; i < count + 1; i++) {
            wlist[i] = noDupWhiteList[i];
        }

        printArr(wlist);

        // read integer key from standard input; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch.indexOf(whitelist, key) == -1)
                StdOut.printf("- %d\n", key);
            else
                StdOut.printf("+ %d\n", key);
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            StdOut.printf("%d, ", arr[i]);
        }
        StdOut.printf("\n");
    }

}
