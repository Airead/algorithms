package com.aireadfun.exercise.e1;

/**
 * Created by airead on 15/10/23.
 */
public class e1_1_3 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        boolean ret = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                ret = false;
                break;
            }
        }

        System.out.println("ret = " + ret);
    }
}
