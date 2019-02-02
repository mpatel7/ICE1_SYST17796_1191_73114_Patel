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
        Card luckyCard = new Card();
        
       for (int i=0; i<magicHand.length; i++)
       {
        //c.setValue(insert call to random number generator here)
        Random rand = new Random();
        magicHand[i] = new Card();
        magicHand[i].setValue(rand.nextInt(13)+1);
        //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        magicHand[i].setSuit(Card.SUITS[rand.nextInt(3)+0]);    
        System.out.println(magicHand[i]);
        }    

        //insert code to ask the user for Card value and suit, create their card
        boolean check;
        do{
            System.out.println("Enter the card value between 1 - 13");
            int value = scan.nextInt();
            if(value < 1 || value > 13){
                System.out.println("Value invalid");
                check = false;
            }else{
                userCard.setValue(value);
                check = true;
            }
        }while(!check);       

        do{
            System.out.println("Enter the suit (Clubs, Spades, Diamond, Hearts)");
            String suit = scan.next();
            if(suit.equals(Card.SUITS[0]) || suit.equals(Card.SUITS[1]) || 
                    suit.equals(Card.SUITS[2]) || suit.equals(Card.SUITS[3])){
                userCard.setSuit(suit);
                check = true;
            }else{
                System.out.println("Suit invalid");
                check = false;
            }
        }while(!check); 
        System.out.println("Value: " +userCard.getValue() +" Suit: "
                +userCard.getSuit());
        
        luckyCard.setValue(7);
        luckyCard.setSuit("Spades");
        System.out.println("Value: " +luckyCard.getValue(); +" Suit: "
                +luckyCard.getSuit());
        
        // and search magicHand here 
        //Then report the result here
    }
    
}
