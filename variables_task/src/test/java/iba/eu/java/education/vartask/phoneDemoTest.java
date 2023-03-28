package iba.eu.java.education.vartask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class phoneDemoTest {

    @Test
    void main() {
        Phone iphone11 = new Phone(1154.4, "+375449285", "White", 1000);
        Phone iphone12 = new Phone(1235.1, "+375543235", "Black", 1500);
        double expBuild1 = 1154.4;
        String expNumber1 = "+375449285";
        String expColor1 = "White";
        int expPrice1 = 1000;
        double expBuild2 = 1235.1;
        String expNumber2 = "+375543235";
        String expColor2 = "Black";
        int expPrice2 = 1500;

        assertEquals(iphone11.buildVersion,expBuild1);
        assertEquals(iphone11.callNumber,expNumber1);
        assertEquals(iphone11.color,expColor1);
        assertEquals(iphone11.price,expPrice1);

        assertEquals(iphone12.buildVersion,expBuild2);
        assertEquals(iphone12.callNumber,expNumber2);
        assertEquals(iphone12.color,expColor2);
        assertEquals(iphone12.price,expPrice2);
    }
}