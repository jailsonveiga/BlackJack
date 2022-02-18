package com.blackjack;

import java.util.Scanner;

// todo: isolate methods & game logic, clean up main method
// todo: add better
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
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
        Player margie = new Player("Margie", 100);
        Dealer dealer = new Dealer();
//        System.out.println("You just draw a: ");
//        margie.drawCard(deck);

        while(true) { // outer while true loop is to show, either keep playing, or leave the table
            System.out.println("Hello! Would you like (1) start a new game? or (2) leave the Blackjack table?");
            margie.getHand().clear();// we ensure that we are starting with empty hands for the player and dealer
            dealer.getHand().clear();
            int playerPoints = 0;
            int dealerPoints = 0;
            int userResponse = input.nextInt();
            if(userResponse == 2) {
                break;
            }
            else if(userResponse == 1) {
                for(int i = 0; i < 2; i++) {
                    margie.drawCard(deck);
                    dealer.drawCard(deck);
                }
                margie.displayHand();
                System.out.println("************");
                dealer.displayHand();
                while(true) {
                    // we need to add a check to see if the user is over 21, then they lose
                    // we also need to add logic for dealer so they keep hitting until they have 17
                    System.out.println("Would you, " + margie.getName() + " like to (1) hit, or (2) stand?");
                    int userHitOrStand = input.nextInt();
                    if(userHitOrStand == 1) {
                        margie.drawCard(deck);
                        playerPoints = margie.displayHand();
                        // add in more logic to ecaluate the game outcome
                        // todo: add dealer logic
                        // todo: add method to evaluate game outcome
                    }
                    else if(userHitOrStand == 2) {
                        break;
                    }
                }
                dealerPoints = dealer.displayHand();
                while(dealerPoints < 17) {
                    Thread thread = new Thread();
                    thread.sleep(1000);
                    dealer.drawCard(deck);
                    dealerPoints = dealer.displayHand();
                }
                // todo: add method to evaluate game outcome
                    BlackJackGame.evaluateGame(playerPoints, dealerPoints);
            }
        }


    }
}
