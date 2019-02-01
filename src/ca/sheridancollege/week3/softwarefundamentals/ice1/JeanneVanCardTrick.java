/*
    JeanneVanCardTrick

    Author:      Jeanne Van
    Student#:    991397430
    Date:        February 2nd, 2019
*/

package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha, Jeanne Van
 */
public class JeanneVanCardTrick {
    
    public static void main(String[] args)
    {
        // Scanner, randomized hand, user's input, success.
        Scanner keysIn = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Card userCard = new Card();
        int userValue;
        String userSuit;
        String userCardOutput;
        boolean found = false;
        
        // Initialize the hand to call from with fresh random numbers
        // each time for the card value and card suit.
        for (int i = 0; i < magicHand.length; i++)
        {
            magicHand[i] = new Card();
            int randomValue = (int)(Math.random() * (13 - 1) + 1);
            int randomSuit = (int)(Math.random() * (3 - 0) + 0);

            magicHand[i].setValue(randomValue);
            magicHand[i].setSuit(magicHand[i].SUITS[randomSuit]);
        }

        // Hardcode a card to look for.
        Card luckyCard = new Card();
        luckyCard.setValue(12);
        luckyCard.setSuit("Hearts");
        
        /*
        // Prompt the user for their card's value and suit, then receive.
        System.out.println("Pick a card, any card!");
        System.out.println("(Insert your card's value, first.)");
        userValue = keysIn.nextInt();
        keysIn.nextLine();
        userCard.setValue(userValue);
        
        System.out.println("(Now then, insert your card's suit.");
        userSuit = keysIn.nextLine();
        userCard.setSuit(userSuit);
        */
        
        // Check if the randomly generated hand has this card,
        for (int j = 0; j < magicHand.length; j++) {
            if (luckyCard.getValue() == magicHand[j].getValue() &&
                luckyCard.getSuit().equals(magicHand[j].getSuit())) {
                found = true;
            }
        }
        
        // Tell the user the results and their card.
        System.out.println((found) ? "We found the card!" :
                                     "We couldn't find the card.");

        System.out.println("It was the " + cardString(luckyCard) + ", right?");
    }
    
    /**
     * Since the Card class lacks a toString function, this will cover for it,
     * returning the card's values as a string.
     * @param inputCard
     * @return A string describing the card.
     */
    public static String cardString(Card inputCard) {
        String output;
        
        // Switch-case for non-numeric cards.
        switch (inputCard.getValue()) {
            case 13:
                output = "King of";
                break;
            case 12:
                output = "Queen of";
                break;
            case 11:
                output = "Jack of";
                break;
            default:
                output = inputCard.getValue() + " of ";
                break;
        }
        
        return output + inputCard.getSuit();        
    }
    
}
