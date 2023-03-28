package iba.eu.java.education.conversionClass;

public class primitive_conv {
     byte primConvertToByte(byte b){
        byte result = 0;
        result = (byte) (b+10);
        return result;
    }

    int primConvertToInt(int i){
        int result = 0;
        result = (i+2)*2;
        return result;
    }

    long primConvertToLong(long l){
        long result = 0;
        result = (l+10)*1;
        return result;
    }
}
