package com.aireadfun.exercise.e1;

/**
 * Created by airead on 15/10/26.
 */
public class e1_1_5 {
    public static void main(String[] args) {
        double x = 0.1;
        double y = 0.8;

        boolean ret = true;

        if (x <= 0 || x >= 1) {
            ret = false;
        } else if (y <= 0 || y >= 1) {
            ret = false;
        }

        System.out.println(ret);
    }
}
