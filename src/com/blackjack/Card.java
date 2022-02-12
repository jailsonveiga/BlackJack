package com.blackjack;

public class Card {
    // Cards have two main properties: Suit, Rank
    // Suit: Diamonds, Clubs, Hearts, Spades
    // Rank: Ace, 2, 3, ..., Jack, Queen, King
    // We need to make our own specific enum for Suit

    private Suit suit;
    private int rank; // 1 = Ace, 11 = Jack, 12 = Queen, 13 = King

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        String strRank = "";

        switch(rank) {
            case 1 -> strRank = "Ace";
            case 11 -> strRank = "Jack";
            case 12 -> strRank = "Queen";
            case 13 -> strRank = "King";
            default -> strRank = Integer.toString(rank);
        }
        return "This is the " + strRank + " of " + this.suit;
    }
}
