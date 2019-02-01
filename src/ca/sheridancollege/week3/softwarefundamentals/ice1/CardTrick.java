/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import static java.lang.Math.random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner scan = new Scanner(System.in);
        
        String yourSuit;
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int number = (int) Math.random();
            if(number == 0){
                yourSuit = "hearts";
            }
            if(number == 1){
                yourSuit = "diamonds";
            }
            if(number == 2){
                yourSuit = "spades";
            }
            if(number == 3){
                yourSuit = "clubs";
            }
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        String yourNumber;
        for (int i=0; i<magicHand.length; i++)
        {
            int yourNumber = (int) Math.random();
        }
        for (int i=0; i<magicHand.length; i++)
        {
            System.out.println(yourSuit + yourNumber);
        }
        
        System.out.println("whats is your card value: ");
        int cardValue = scan.nextInt();
        
        System.out.println("whats is your card suit: ");
        String suits = scan.nextLine();
        //insert code to ask the user for Card value and suit, create their card
        //and search magicHand here
        Card card = new Card();
        card.setValue(cardValue);
        card.setSuit(suits);
        card.toString();
        
        
    }
    
}
