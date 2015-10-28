package com.aireadfun.exercise.e1;

/**
 * Created by airead on 15/10/26.
 */
public class e1_1_24 {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);

        int gcd = gcd(p, q);
        System.out.println(gcd);
        System.out.println("-------");

        int gcd2 = gcd2(p, q, 0);
        System.out.println(gcd2);
    }

    public static int gcd(int p, int q) {
        while (p > 0 && q > 0) {
            if (p > q) {
                p = p - q;
            } else {
                q = q - p;
            }
        }

        if (p == 0) {
            return q;
        } else {
            return p;
        }
    }

    public static int gcd2(int p, int q, int depth) {
        System.out.println("p: " + p + ", q: " + q);
        if (p == 0) {
            return q;
        }

        if (q == 0) {
            return p;
        }

        if (p > q) {
            p = p - q;
        } else {
            q = q - p;
        }

        return gcd2(p, q, depth + 1);
    }
}
