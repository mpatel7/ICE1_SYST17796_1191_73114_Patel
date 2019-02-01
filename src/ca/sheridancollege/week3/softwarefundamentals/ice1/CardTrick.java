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
 * @co-author Justin
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * ((13 - 1) + 1)) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * ((3 - 0) + 1)) + 0]);
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value.");
        int value = input.nextInt();
        System.out.println("Please enter the suit.");
        String suit = input.next();
        for(int i = 0; i < magicHand.length; i++){
            int v = magicHand[i].getValue();
            String s = magicHand[i].getSuit();
            if(value == v && suit.equalsIgnoreCase(s)){
                System.out.println("The card is in the magic hand!");
                break;
            }
            else{
                System.out.println("The card is not in the magic hand...");
                break;
            }
        }
    }
    
}
