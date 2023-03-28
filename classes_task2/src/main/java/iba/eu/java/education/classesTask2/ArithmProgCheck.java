package iba.eu.java.education.classesTask2;

import java.util.Arrays;

public class ArithmProgCheck {
    static boolean checkIsAP(int arr[]) {
        //zero size array check
        int n = arr.length;
        if (n == 0){
            return false;
        }
        // Sort array
        Arrays.sort(arr);
        // After sorting, difference between
        // consecutive elements must be same.
        int d = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++)
        {
            if (arr[i] - arr[i - 1] != d)
            {
                return false;
            }
        }
        return true;
    }
}
