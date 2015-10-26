package com.aireadfun.exercise.e1;

/**
 * Created by airead on 15/10/26.
 */

/*
0  x f 0 g 1
1  0 f 1 g 0
2  1 f 1 g 1
3  1 f 2 g 1
4  2 f 3 g 2
 */
public class e1_1_6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;

        for (int i = 0; i < 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
