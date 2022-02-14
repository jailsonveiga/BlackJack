package com.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;
    // List<Card> arrList = new ArrayList();
    // ArrayList<Card> arrList = new ArrayList<>();
    private final static int[] RANKS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}; // use all Cap-letters when we define our final

    public Deck() {
        // Collections -> List -> ArrayLists<>()
        this.deck = new ArrayList<>();

        for(int i = 0; i < RANKS.length; i++) {
            for(Suit s : Suit.values()) {
                deck.add(new Card(s, RANKS[i]));
                System.out.println(deck.get(deck.size() - 1));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public List<Card> getCards() {
        return deck;
    }
}
