package iba.eu.java.education.operatorsClass2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class shiftsDemoTest {

    @org.junit.jupiter.api.Test
    void main() {
        int a = 0b011;
        int b = -0b111;

        a = a << 2;
        b = b << 2;

        a = a >> 2;
        b = b >> 2;

        b = b >>> 3;
        a = a >>> 3;

        int expectedA = 0;
        int expectedB = 536870911;

        assertEquals(a, expectedA);
        assertEquals(b, expectedB);
    }
}