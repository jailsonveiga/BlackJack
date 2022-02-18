package com.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Actor{
    private List<Card> hand;
    private String name;

    public Dealer() {

        this.hand = new ArrayList<>();
        this.name = "Dealer";
    }

    @Override
    public void drawCard(Deck deck) {
        this.hand.add(deck.getCards().get(0));
//        System.out.println(deck.getCards().get(0));
        deck.getCards().remove(0);
    }
    public int displayHand() {
        System.out.println("The current hand for " + this.name + " is");
        int sum = 0;
        for(int i = 0; i < hand.size(); i++) {
            if(this.hand.get(i).getRank() > 10) {
                sum += 10;
            }
            else if(this.hand.get(i).getRank() == 1){
                sum += 11;
            }
            else{
                sum += this.hand.get(i).getRank();
            }
            System.out.println(this.hand.get(i));
        }
        System.out.println("Total " + this.name + " points: " + sum);
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getHand() {
        return hand;
    }
}
