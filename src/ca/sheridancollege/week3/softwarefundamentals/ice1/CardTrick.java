/*
 * Modifier: Yan Hui Ma.
 * Student ID: 991157348
 *
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(3);
            c.setSuit(Card.SUITS[i]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Card value");
        double value= in.nextDouble();
        System.out.println("Please enter suit");
        String suit = in.next();
        
        
        System.out.println(suit.equals(suit));
        
    }
    
}
