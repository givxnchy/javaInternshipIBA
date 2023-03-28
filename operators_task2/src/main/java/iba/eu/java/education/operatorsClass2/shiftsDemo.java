package iba.eu.java.education.operatorsClass2;

import java.util.logging.Logger;

public class shiftsDemo {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(shiftsDemo.class.getName());

        int a = 0b011;
        int b = -0b111;

        a = a << 2;
        b = b << 2;

        a = a >> 2;
        b = b >> 2;

        b = b >>> 3;
        a = a >>> 3;

        log.info(a + " " + b);
        //System.out.println(a + " " + b);
    }
}
