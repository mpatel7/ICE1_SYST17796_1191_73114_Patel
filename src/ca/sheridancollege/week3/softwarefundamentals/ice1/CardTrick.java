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
 * @co-author Colton Dietrich Student Number 991515876
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
         
        for (int i=0; i<magicHand.length; i++){
            int number = (int)(Math.random()*((13-1)+1))+1;
            magicHand[i] = new Card();
            magicHand[i].setValue(number);
            number = (int)(Math.random()*((3-0)+1))+0;
            magicHand[i].setSuit(Card.SUITS[number]);
        }
  
//        Scanner in = new Scanner(System.in);
//        System.out.println("Pick a card, any card!");
//        System.out.println("Enter a numeric card value. (note that Ace = 1, Jack =11, Queen =12, King = 13)");
//        String value = in.nextLine();
//        System.out.println("Enter a numeric suit value. (hearts = 0, diamonds = 1, spades = 2, clubs = 3)");
//        String suit = in.nextLine();
//        in.close();
        
        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit(Card.SUITS[2]); 
        
//        Card userCard = new Card();
//        userCard.setValue(Integer.parseInt(value));
//        userCard.setSuit(Card.SUITS[Integer.parseInt(suit)]);       
        boolean inHand = false; 
        System.out.println("Your card is the " + luckyCard.getValue() +" of " + luckyCard.getSuit());
        for (int i=0; i<magicHand.length; i++){
            if ((magicHand[i].getSuit()==(luckyCard.getSuit())) && (magicHand[i].getValue() == luckyCard.getValue())){
                inHand = true;
                break;
            }
        } 
        
        if (inHand){
            System.out.println("Your card is in the magic hand of random cards");
        }
        else {
            System.out.println("Your card is not in the magic hand of random cards");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
