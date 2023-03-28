package iba.eu.java.education.classesTask1;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static iba.eu.java.education.classesTask1.Card.getCard;
class CardTest {
    @Test
    public static void main(String[] args) {
        java.util.logging.Logger log = Logger.getLogger(CardTest.class.getName());
        log.info("Your card is " + getCard());
    }
}