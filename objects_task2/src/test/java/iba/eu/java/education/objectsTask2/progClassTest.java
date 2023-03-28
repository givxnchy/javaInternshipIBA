package iba.eu.java.education.objectsTask2;

import java.util.Arrays;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
class progClassTest {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(progClass.class.getName());
        progClass progression1 = new progClass(3, 4, 5);
        progClass progression2 = new progClass(1, 5, 0);
        progClass progression3 = new progClass();
        log.info("progression 1 = " + Arrays.toString(progression1.getProg()));
        log.info("progression 2 = " + Arrays.toString(progression2.getProg()));
        log.info("progression 3 = " + Arrays.toString(progression3.getProg()));
        log.info("size of progression1 is " + progression1.getSize());
        log.info("first element of progression1 is  " + progression1.getStart());
        log.info("last element of progression1 is  " + progression1.getLast());
        log.info("step of progression1 is  " + progression1.getStep());
        log.info("summary of progression1 is  " + progression1.getSum());
    }
}