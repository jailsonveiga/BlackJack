package com.blackjack;

public class BlackJackGame {
    public static void evaluateGame(int playerPoints, int dealerPoints) {
     // this is where we need to add the appropriate conditional logic to determine
        if(playerPoints > 21 && dealerPoints < 22) {
            System.out.println("Bust! You lost :()");
        }
        else if(playerPoints == 21 && dealerPoints != 21) {
            System.out.println("Congratulations! You win :)");
        }
        else if(dealerPoints < 21 && dealerPoints > playerPoints) {
            System.out.println("Sorry! You lost :( Dealer was closer to 21");
        }
        else if(dealerPoints > 21 && playerPoints <= 21) {
            System.out.println("Congratulations! Dealer busts, you win");
        }
        else if(dealerPoints == 21 && playerPoints < 21) {
            System.out.println("Sorry! Dealer got blackjack");
        }
    }
}
