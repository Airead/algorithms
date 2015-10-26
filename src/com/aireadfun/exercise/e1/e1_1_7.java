package com.aireadfun.exercise.e1;

/**
 * Created by airead on 15/10/26.
 */
public class e1_1_7 {
    public static void main(String[] args) {
        // a
        double t = 0.9;
        while (Math.abs(t - 9.0/t) > .001) {
            t = (9.0/t + t) / 2.0;
        }
        System.out.println(t);

        // b
        int sum = 0;
        for (int i = 1; i < 1000; i*=2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);

        // c
        sum = 0;
        for (int i = 1; i < 1000; i*=2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
