package com.aireadfun.exercise.e1;

/**
 * Created by airead on 15/10/26.
 */
public class e1_1_16 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        System.out.println(exR1(N));
    }

    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }

        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
