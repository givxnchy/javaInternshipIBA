package iba.eu.java.education.arraysClass;

import java.util.logging.Logger;

public class arrays_3d_assign {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(arrays_3d_assign.class.getName());
        int[][][] threeD_arr = new int[3][3][3];
        threeD_arr[0][0][0] = 2;
        threeD_arr[0][0][1] = 5;
        threeD_arr[0][0][2] = 5;
        threeD_arr[0][1][0] = 8;
        threeD_arr[0][1][1] = 6;
        threeD_arr[0][1][2] = 1;
        threeD_arr[0][2][0] = 3;
        threeD_arr[0][2][1] = 5;
        threeD_arr[0][2][2] = 8;
        threeD_arr[1][0][0] = 6;
        threeD_arr[1][0][1] = 3;
        threeD_arr[1][0][2] = 8;
        threeD_arr[1][1][0] = 5;
        threeD_arr[1][1][1] = 1;
        threeD_arr[1][1][2] = 8;
        threeD_arr[1][2][0] = 2;
        threeD_arr[1][2][1] = 7;
        threeD_arr[1][2][2] = 0;
        threeD_arr[2][0][0] = 66;
        threeD_arr[2][0][1] = 35;
        threeD_arr[2][0][2] = 84;
        threeD_arr[2][1][0] = 51;
        threeD_arr[2][1][1] = 13;
        threeD_arr[2][1][2] = 84;
        threeD_arr[2][2][0] = 26;
        threeD_arr[2][2][1] = 10;
        threeD_arr[2][2][2] = 6;
        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: threeD_arr) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.print(item + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
