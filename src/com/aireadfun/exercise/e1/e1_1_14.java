package com.aireadfun.exercise.e1;

/**
 * Created by airead on 15/10/26.
 */
public class e1_1_14 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        System.out.println(lg(N));
    }

    public static int lg(int N) {
        int c = 1;

        for (int i = 0; i < N; i++) {
            c *= 2;
            if (c > N) {
                return i;
            }
        }

        return -1;
    }
}
