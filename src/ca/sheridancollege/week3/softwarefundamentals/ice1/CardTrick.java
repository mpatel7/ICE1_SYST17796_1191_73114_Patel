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
 * @contributor Sam Whelan Student ID: 991541458
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(3) + 0]);
        }
        
        System.out.print("Enter a card value");
        int cardValue = sc.nextInt();
        System.out.println("Enter a card suit");
        String cardSuit = sc.next();
        
        Card userCard = new Card();
        userCard.setSuit(cardSuit);
        userCard.setValue(cardValue);
        
        for (int i = 0; i < magicHand.length; i++) {
            if(magicHand[i] == userCard){
                System.out.println("Your card was here");
            }else{
                System.out.println("Your card is not here");
            }
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
