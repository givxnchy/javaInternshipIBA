package iba.eu.java.education.operatorsClass;

import static org.junit.jupiter.api.Assertions.*;

class arithmeticDemoTest {

    @org.junit.jupiter.api.Test
    void main() {
        int result = 1 + 2; // result is now 3
        result -= 1; // result is now 2
        result *= 2; // result is now 4
        result /= 2; // result is now 2
        result += 8; // result is now 10
        result %= 7; // result is now 3

        int expResult = 3;
        assertEquals(expResult,result);
    }
}