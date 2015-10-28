package com.aireadfun.exercise.e1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by airead on 15/10/28.
 */
public class e1_1_19 {
    private static long[] fibs = new long[1000];
    public static void main(String[] args) {
        fibs[0] = 0;
        fibs[1] = 1;
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            fibs[i] = F(i);
            StdOut.println(i + " " + fibs[i]);
        }
    }

    public static long F(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (fibs[n] != 0) {
            return fibs[n];
        }
        return F(n - 1) + F(n - 2);
    }
}
