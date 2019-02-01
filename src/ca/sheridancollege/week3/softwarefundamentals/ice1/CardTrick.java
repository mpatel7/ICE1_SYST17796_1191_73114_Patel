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
 * @author Megha
 * modifier: Andreea Popa
 * Student ID: 991519111
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit("Hearts");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.print("Plese enter a number from 1-13: ");
        int value = input.nextInt();
        System.out.print("Please enter suit number(0 = heart, 1 = diamond, 2 = club or 3 = clover): ");
        int suit = input.nextInt();
        // and search magicHand here
        for(int i = 0; i <= magicHand.length; i++){
            if(i == value && i == suit){
                System.out.println("Your card is in the hand.");
            }else{
                System.out.println("Your card is not in the hand.");
            }
        }
        //Then report the result here
    }
    
}
