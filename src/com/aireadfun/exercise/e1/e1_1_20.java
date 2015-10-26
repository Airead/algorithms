package com.aireadfun.exercise.e1;

/**
 * Created by airead on 15/10/26.
 */
public class e1_1_20 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(lnN2(n));
        System.out.println("-----------");
        System.out.println(lnN(n));

    }

    public static double lnN(int n) {
        if (n == 1) {
            return 0;
        }

        return Math.log(n) + lnN(n - 1);
    }

    public static double lnN2(int n) {
        return Math.log(factorialN(n));
    }

    public static double factorialN(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorialN(n - 1);
    }

}
