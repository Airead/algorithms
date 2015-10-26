package com.aireadfun.exercise.e1;

/**
 * Created by airead on 15/10/26.
 */
public class e1_1_9 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if (num == 0) {
            System.out.println(0);
        }

        String ret = "";
        while (num > 0) {
            String bit = String.valueOf(num % 2);
            ret = bit + ret;
            num = num / 2;
        }
        System.out.println(ret);
    }
}
