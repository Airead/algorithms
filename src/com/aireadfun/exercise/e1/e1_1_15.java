package com.aireadfun.exercise.e1;

import java.util.Random;

/**
 * Created by airead on 15/10/26.
 */
public class e1_1_15 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        int[] marr = new int[100];

        Random random = new Random(47);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
//            System.out.println(arr[i]);
            marr[arr[i]]++;
        }

        int sum = 0;
        for (int i = 0; i < marr.length; i++) {
            sum += marr[i];
        }

        System.out.println(sum + "  " + arr.length);
    }
}
