package iba.eu.java.education.operatorsClass3;

import java.util.logging.Logger;

public class dogDemo {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(dogDemo.class.getName());
        Dog dog1 = new Dog("Spot", "Ruff!");
        Dog dog2 = new Dog("Scruffy", "Wurf!");
        Dog unkwnDog = new Dog();
        unkwnDog = dog1;

        if(dog1.name == dog2.name){
            log.info("dog1 and dog2 share same names!");
        }
        else log.info("dog1 and dog2 have different names...");

        if(dog1.says.equals(dog2.says)){
            log.info("dog1 and dog2 says same words!");
        }
        else log.info("dog1 and dog2 have different barks...");

        if (dog1.name == unkwnDog.name && dog1.says.equals(unkwnDog.says)){
            log.info("dog1 and unknwDog are twins!");
        }
    }
}
