package iba.eu.java.education.classesTask1;

import java.util.Arrays;
import java.util.logging.Logger;

public class DeckOfCards {
    public static String getDeck(){
        java.util.logging.Logger log = Logger.getLogger(DeckOfCards.class.getName());
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle the cards
        /*for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }*/

        // Display the all the cards
        for (int i = 0; i < 52; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            log.info( rank + " of " + suit);
        }
        return "";
    }
}
