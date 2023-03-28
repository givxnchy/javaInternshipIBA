package iba.eu.java.education.arraysClass;

public class arrays_3d_declare {
    public static void main(String[] args) {
        int[][][] threeD_arr = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

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
