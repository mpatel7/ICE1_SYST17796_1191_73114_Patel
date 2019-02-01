/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha, Ryan Henry 991478642
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(randomCardNumber());
            c.setSuit(Card.SUITS[randomCardSuit()]);
            magicHand[i] = c;
        }
        /*
        //insert code to ask the user for Card value and suit, create their card
        Scanner in = new Scanner(System.in);
        System.out.println("Guess a card in the hand of seven cards.");
        System.out.print("Enter a Card value (an integer 1-13): ");
        int cardValue = Integer.parseInt(in.next()) - 1;
        // and search magicHand here
        System.out.print("Enter a card suit (Hearts, Diamonds, Spades or "
                + "Clubs): ");
        String cardSuit = in.next();
        //Then report the result here
        */
        Card luckyCard = new Card();
        luckyCard.setValue(13);
        luckyCard.setSuit("Hearts");
        boolean guess = false;
        Card userCard = luckyCard;//new Card();
        //userCard.setValue(cardValue);
        //userCard.setSuit(cardSuit);
        for (int i = 0; i<magicHand.length; i++) {
            
            if (userCard.getSuit().equals(magicHand[i].getSuit())
                    && userCard.getValue() == magicHand[i].getValue()) {
                guess = true;
                break;
            
            }
        }
        if (guess){
            System.out.println("You guessed a card in the hand! "
                + "Good Job!");
        } else {
            System.out.println("Sorry your guess was not in the hand!");
        }
        
        System.out.println("This was the hand:");
        for (int i = 0; i<magicHand.length; i++) {
            System.out.println("Card " + i +". Suit: " + magicHand[i].getSuit()
                    + "; Value: "+ magicHand[i].getValue() + ";");
        }
        
    }
    
    //
    /**Generates a random card number between 0 and 12 inclusive.
     * There are 13 different kinds of cards per suit.
     * There is no validation on whether you have more than four of a kind.
     * @return returns a random integer.
     */
    public static int randomCardNumber(){
        return ((int) Math.floor(100 * Math.random()))%13;
    }
    
    /**Generates a random suit defined by an integer between 0 and 3.
     * There four suits in a standard deck of playing cards.
     * @return returns a random integer between 0 and 3 inclusive.
     */
    public static int randomCardSuit(){
        return ((int) Math.floor(10 * Math.random()))%4;
    }
    
}
