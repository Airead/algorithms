package com.aireadfun.exercise.e1;

/**
 * Created by airead on 15/10/26.
 */
public class e1_1_22 {
    public static void main(String[] args) {
        int key = Integer.parseInt(args[0]);
        int num = 100;
        int[] arr = genArr(num);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
        System.out.println("rank: " + rank(key, arr));
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }

        int mid = lo + (hi - lo) / 2;

        System.out.println(lo + " " + hi + " " + mid);

        if (lo > hi) return -1;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth + 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth + 1);
        } else {
            return mid;
        }
    }

    public static int[] genArr(int num) {
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = i;
        }

        return arr;
    }
}
