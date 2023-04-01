package iba.eu.java.education.statementsClass3;

import java.util.Arrays;
import java.util.logging.Logger;

import static iba.eu.java.education.statementsClass3.sortArray.sortArr;

class sortArrayTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(sortArrayTest.class.getName());
        int[] arr = new int[]{1, 6, 7, 3, 1, 25};
        sortArr(arr);
        logger.info("Sorted array equals to : " + Arrays.toString(arr));
    }
}