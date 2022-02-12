package com.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Actor{
    private List<Card> hand;

    public Dealer() {
        this.hand = new ArrayList<>();
    }

    @Override
    public void drawCard(Deck deck) {
        this.hand.add(deck.getCards().get(0));
        System.out.println(deck.getCards().get(0));
        deck.getCards().remove(0);
    }
}
