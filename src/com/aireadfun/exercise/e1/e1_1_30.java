package com.aireadfun.exercise.e1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by airead on 15/10/29.
 */
public class e1_1_30 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[][] b = new boolean[n][n];

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n; j++) {
                if (gcd(i, j) == 1) {
                    b[i][j] = true;
                }
            }
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                StdOut.printf("%b\t", b[i][j]);
            }
            StdOut.printf("\n");
        }

    }

    public static int gcd(int a, int b) {
        if (a == 1) {
            return a;
        }
        if (b == 1) {
            return b;
        }
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        if (a > b) {
            a %= b;
        } else {
            b %= a;
        }

        return gcd(a, b);
    }
}
