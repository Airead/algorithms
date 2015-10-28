package com.aireadfun.exercise.e1;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by airead on 15/10/28.
 */
public class e1_1_11 {
    public static void main(String[] args) {
        boolean[][] arr = genArr(8, 9);

        System.out.println("arr:" + arr.length + " " + arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static boolean[][] genArr(int m, int n) {
        boolean[][] arr = new boolean[m][n];

        StdRandom.setSeed(47);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (StdRandom.uniform() < 0.7) {
                    arr[i][j] = true;
                }
            }
        }
        return arr;
    }
}
