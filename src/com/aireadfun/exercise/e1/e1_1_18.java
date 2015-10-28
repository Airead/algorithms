package com.aireadfun.exercise.e1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by airead on 15/10/28.
 */
public class e1_1_18 {
    public static void main(String[] args) {
        StdOut.printf("mystery(%d, %d) = %d\n", 2, 25, mystery(2, 25));
        StdOut.printf("mystery(%d, %d) = %d\n", 3, 11, mystery(3, 11));
        StdOut.printf("mystery(%d, %d) = %d\n", 2, 26, mystery(2, 26));
        StdOut.printf("mystery(%d, %d) = %d\n", 3, 12, mystery(3, 12));

        StdOut.printf("mystery2(%d, %d) = %d\n", 2, 3, mystery2(2, 3));
        StdOut.printf("mystery2(%d, %d) = %d\n", 3, 3, mystery2(3, 3));
        StdOut.printf("mystery2(%d, %d) = %d\n", 2, 4, mystery2(2, 4));
        StdOut.printf("mystery2(%d, %d) = %d\n", 3, 4, mystery2(3, 4));
    }

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a * a, b /2);
        return mystery2(a * a, b / 2) * a;
    }
}
