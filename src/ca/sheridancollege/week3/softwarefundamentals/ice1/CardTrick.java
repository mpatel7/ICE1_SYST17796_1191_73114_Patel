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
            magicHand[i] = new Card();
            magicHand[i].setValue((int)(Math.random() * ((13 - 1) + 1)) + 1);
            magicHand[i].setSuit(Card.SUITS[(int)(Math.random() * ((3 - 0) + 1)) + 0]);
        }
        Scanner input = new Scanner(System.in);
        Card luckyCard = new Card();
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(12);
        String suit = luckyCard.getSuit();
        int value = luckyCard.getValue();
        String output = "";
        for(int i = 0; i < magicHand.length; i++){
            int v = magicHand[i].getValue();
            String s = magicHand[i].getSuit();
            if(value == v && suit.equalsIgnoreCase(s)){
                output = "The card is in the magic hand!";
                break;
            }
            else{
                output = "The card is not in the magic hand...";
            }
        }
        System.out.println(output);
    }
    
}
