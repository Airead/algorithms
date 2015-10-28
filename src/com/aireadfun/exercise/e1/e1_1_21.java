package com.aireadfun.exercise.e1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by airead on 15/10/28.
 */
public class e1_1_21 {
    public static void main(String[] args) {
        StdOut.printf("name\tone\ttwo\tratio\n");
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int one = StdIn.readInt();
            int two = StdIn.readInt();
            StdOut.printf("%s\t%d\t%d\t%.3f\n", name, one, two, one * 1.0 / two);
        }
    }
}
