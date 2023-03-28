package iba.eu.java.education.operatorsClass;

import java.util.logging.Logger;

public class arithmeticDemo {
    public static void main (String[] args){
        Logger log = Logger.getLogger(arithmeticDemo.class.getName());
        int result = 1 + 2; // result is now 3
        log.info(String.valueOf(result));

        result -= 1; // result is now 2
        log.info(String.valueOf(result));

        result *= 2; // result is now 4
        log.info(String.valueOf(result));

        result /= 2; // result is now 2
        log.info(String.valueOf(result));

        result += 8; // result is now 10
        result %= 7; // result is now 3
        log.info(String.valueOf(result));
    }
}
