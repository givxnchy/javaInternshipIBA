package iba.eu.java.education.conversionClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class primitive_convTest {
    @Test
    void main() {
        primitive_conv byteVar = new primitive_conv();
        primitive_conv intVar = new primitive_conv();
        primitive_conv longVar = new primitive_conv();
        byte expByte = 20;
        int expInt = 24;
        long expLong = 50;
        assertEquals(expByte, byteVar.primConvertToByte((byte) 10));
        assertEquals(expInt, intVar.primConvertToInt(10));
        assertEquals(expLong, longVar.primConvertToLong(40));
    }

}