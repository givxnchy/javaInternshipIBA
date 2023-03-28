package iba.eu.java.education.classesTask1;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static iba.eu.java.education.classesTask1.Card.getCard;
import static iba.eu.java.education.classesTask1.DeckOfCards.getDeck;
import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardsTest {

    @Test
    public static void main(String[] args) {
        java.util.logging.Logger log = Logger.getLogger(CardTest.class.getName());
        getDeck();
    }
}