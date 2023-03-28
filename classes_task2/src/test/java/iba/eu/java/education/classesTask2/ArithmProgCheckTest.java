package iba.eu.java.education.classesTask2;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static iba.eu.java.education.classesTask2.ArithmProgCheck.checkIsAP;
import static org.junit.jupiter.api.Assertions.*;

class ArithmProgCheckTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ArithmProgCheckTest.class.getName());
        int arr[] = {0, 15, 25, 20, 10, 5};
        if (checkIsAP(arr))
            logger.info("This array is Arithmetic progression");
        else
            logger.info("This array is not Arithmetic progression");
    }
    //assertEquals не получается реализовать
}