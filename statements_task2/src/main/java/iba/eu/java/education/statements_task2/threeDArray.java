package iba.eu.java.education.statements_task2;

import java.util.Arrays;

public class threeDArray {
    public static void main(String[] args) {
        char[][][] three_D_arr = {
                {
                        {'c', 'g', 'h'},
                        {'q', 'r', 'u'},
                        {'y', 's', 'o'}
                },
                {
                        {'y', 'u', 'q'},
                        {'s', 'z', 'h'},
                        {'i', 'w', 'y'}
                },
                {
                        {'y', 'u', 'q'},
                        {'s', 'z', 'h'},
                        {'i', 'w', 'y'}
                }
        };
        System.out.println(checkThreeDimensionalArray(three_D_arr));
    }

    public static boolean checkThreeDimensionalArray(char[][][] array) {
        boolean checkVertical = false;
        boolean checkHorizontal = false;
        boolean checkDiagonal = false;

        for (char[][] arr : array) {
            if (!checkVertical) {
                checkVertical = checkVertical(arr);
            }
            if (!checkDiagonal) {
                checkDiagonal = checkDiagonal(arr);
            }

            for (char[] row : arr) {
                if (!checkHorizontal) {
                    checkHorizontal = checkHorizontal(row);
                }
            }
        }

        return checkVertical || checkDiagonal || checkHorizontal;
    }


    public static boolean checkDiagonal(char[][] arr) {
        int size = arr.length;
        char firstElemFirstRow = arr[0][0];
        char lastElemFirstRow = arr[0][size - 1];

        int count = 0;

        for (int pos = 1; pos < size; pos++) {
            char curr = arr[pos][pos];
            if (curr != firstElemFirstRow) {
                break;
            }

            count++;
        }

        if (count == 2) {
            return true;
        } else {
            count = 0;
        }

        for (int pos = size - 2; pos >= 0; pos--) {
            char curr = arr[(size - 1) - pos][pos];
            if (curr != lastElemFirstRow) {
                break;
            }

            count++;
        }

        return count == 2;
    }

    public static boolean checkVertical(char[][] arr) {
        int rowLength = arr[0].length;
        char firstElem;
        int count = 0;

        for (int col = 0; col < arr.length; col++) {
            count = 0;
            firstElem = arr[0][col];

            for (int row = 1; row < rowLength; row++) {
                char currElem = arr[row][col];
                if (currElem != firstElem) {
                    row = rowLength;
                }
                count++;

            }
            if (count == 2) {
                col = arr.length;
            }
        }
        return count == 2;
    }

    public static boolean checkHorizontal(char[] row) {
        char firstElem = row[0];
        char curr;
        int count = 0;

        for (int i = 1; i < row.length; i++) {
            curr = row[i];
            if (curr != firstElem) {
                i = row.length;
            }
            count++;
        }

        return count == 2;
    }
}