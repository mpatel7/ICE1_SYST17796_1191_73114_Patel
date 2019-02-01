/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        //create object and scanner
        Card[] magicHand = new Card[7];
        Scanner scan = new Scanner(System.in);
        Card userCard = new Card();
        
        //create variables
        int value = 0;
        String suit = "";
        
       for (int i=0; i<magicHand.length; i++)
       {
        //c.setValue(insert call to random number generator here)
        Random rand = new Random();
        magicHand[i].setValue(rand.nextInt());
        //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        magicHand[i].setSuit(Card.SUITS[rand.nextInt(3)+0]);    
        System.out.println(magicHand[i]);
    }    

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter the card value");
        value = scan.nextInt();
        System.out.println("Enter the suit");
        suit = scan.nextLine();
        scan.next();
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        // and search magicHand here 
        //Then report the result here
    }
    
}
