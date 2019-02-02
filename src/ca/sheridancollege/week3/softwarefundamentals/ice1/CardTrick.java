/*
 Fernando Fedele
 991529962
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Fernando Fedele
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) ((Math.random() * 13) + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        //
        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a card value: ");
//        int value = input.nextInt();
//        input.nextLine();
//        System.out.print("Enter a suit: ");
//        String suit = input.nextLine();
//        
//        Card fernsCard = new Card();
//        fernsCard.setValue(value);
//        fernsCard.setSuit(suit);
        
        // lucky card king of hearts
        Card luckyCard = new Card();
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(13);
        
        
        boolean cardInHand = false;
        
        for (int i = 0; i < magicHand.length; i++) {
            if (luckyCard.getValue() == magicHand[i].getValue() && 
                    luckyCard.getSuit().equals(magicHand[i].getSuit()))
                cardInHand = true;
        }
        
        if (cardInHand)
            System.out.println("Card is in hand!");
        else
            System.out.println("Card is not in hand!");
    }
    
    
}
