/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 * @co author Roman Dorosh
 * @student number 991456480
 */
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.random()*(1-13) +1);
            c.setSuit(Card.SUITS[(int)Math.random()*(0-3)+1]);
        }
        System.out.println("Please enter Card value: ");
        int value = in.nextInt();
        System.out.println("Please enter Suit: ");
        String suit = in.next();
        Card userCard = new Card();
        userCard.setValue(Integer.parseInt(value));
        userCard.setSuit(Card.SUITS[Integer.setSuit(suit)]);
        System.out.println("Card value: " + value + " Suit: " + suit);
         for (int i=0; i<magicHand.length; i++)    {
             if (value == magicHand[i].getValue() && 
                     suit == magicHand[i].getSuit())
                 System.out.println("Success!");
         else{
                 System.out.println("Too bad!");
                 }
         }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
    }
    
}
