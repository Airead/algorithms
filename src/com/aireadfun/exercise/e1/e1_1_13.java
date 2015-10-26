package com.aireadfun.exercise.e1;

/**
 * Created by airead on 15/10/26.
 */
public class e1_1_13 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];

        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = count++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
