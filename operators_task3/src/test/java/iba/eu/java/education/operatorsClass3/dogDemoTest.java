package iba.eu.java.education.operatorsClass3;

import static org.junit.jupiter.api.Assertions.*;

class dogDemoTest {

    @org.junit.jupiter.api.Test
    void main() {
        Dog dog1 = new Dog("Spot", "Ruff!");
        Dog dog2 = new Dog("Scruffy", "Wurf!");
        Dog unkwnDog = new Dog();
        unkwnDog = dog1;

        String expDog1Name = "Spot";
        String expDog2Name = "Scruffy";
        String expDog1Says = "Ruff!";
        String expDog2Says = "Wurf!";

        assertEquals(dog1.name,expDog1Name);
        assertEquals(dog2.name,expDog2Name);
        assertEquals(dog1.says,expDog1Says);
        assertEquals(dog2.says,expDog2Says);
    }
}