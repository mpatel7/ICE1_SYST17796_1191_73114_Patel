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
 * @coauthor Victor
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i]= new Card();
            int x = rand.nextInt(7) + 1;
            magicHand[i].setValue(x);
            
            int y = rand.nextInt(3) + 1;
            magicHand[i].setSuit(Card.SUITS[y]);
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }
        Card[] magicHand1 = new Card[1];
        magicHand1[0] = new Card();
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a  number between 0 and 3: 0 = hearts; 1 = diamonds; 2 = spades; 3 = clubs ------ ");
        int suit = input.nextInt();
        
        if(suit==0){
            magicHand1[0].setSuit("hearts");
        }
        else if(suit==1){
            magicHand1[0].setSuit("diamonds");
        }
        else if(suit==2){
            magicHand1[0].setSuit("spades");
        }
        else if(suit==3){
            magicHand1[0].setSuit("clubs");
        }
        else{
            System.out.println("wrong number entered");
        }
        
        
        System.out.print("please enter a number between 1 and 13 for its value ------");
        int value = input.nextInt();
        magicHand1[0].setValue(value);
        
        System.out.println(magicHand1[0].getSuit() + " " + magicHand1[0].getValue());
        
        
        
        
    }
    
}
