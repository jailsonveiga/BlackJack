package com.blackjack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to blackJack");
//        Card testCard = new Card(Suit.DIAMONDS, 3);
//        Card queenHearts = new Card(Suit.HEARTS, 12);
//        Card aceClubs = new Card(Suit.CLUBS, 1);
//
//        System.out.println(testCard);
//        System.out.println(queenHearts);
//        System.out.println(aceClubs);

        Deck deck = new Deck();
        deck.shuffle();
        Player margie = new Player();
        System.out.println("You just draw a: ");
        margie.drawCard(deck);


    }
}
