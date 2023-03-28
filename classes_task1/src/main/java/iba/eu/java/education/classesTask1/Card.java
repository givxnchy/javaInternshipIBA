package iba.eu.java.education.classesTask1;

import java.util.Random;

public class Card {
    public static String getCard() {
        String[] suit = new String[]{"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] rank = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int rnd = new Random().nextInt(suit.length);
        int rnd1 = new Random().nextInt(rank.length);
        return suit[rnd] + " " + rank[rnd1];
    }
}
