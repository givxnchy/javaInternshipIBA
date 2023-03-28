package iba.eu.java.education.conceptClass;

import java.util.logging.Logger;

public class demoDog {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(demoDog.class.getName());
        Doggy dog1 = new Doggy();
        dog1.age = 5;
        dog1.gender = "female";
        dog1.breed = "German shepard";
        log.info("Dog age = " + dog1.age + " Dog's breed is - " + dog1.breed + " dog's number of paws is = " + dog1.paws +
                " dog's gender is " + dog1.gender);
    }
}
