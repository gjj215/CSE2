//////////////////////////////////////////
//Greg Jacobs
//Homework 10 - part 2
//CSE 002
//November 18, 2014
// Poker Odds
//
// In this homework, we use arrays and methods to generate random poker hands and determine the pairs.
//

import java.util.Random;
import jva.util.Scanner;
public class PokerOdds{
    public static void main(String [] arg){
        showHands();
        simulateOdds();
    }
    
    //Method to generate random poker hands
    public static String showHands(){
        Random rand = new Random(); //Declare the method for the random class
        //52 cards in a deck
        int deck [] = {0, 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 ,22 ,23 ,24 ,25 ,26 ,27, 28, 29, 30, 31,
        32, 33, 34, 35, 36 ,37, 38, 39, 40, 41, 42 ,43 ,44 ,45 ,46, 47, 48, 49, 50, 51}//0 = Ace of clubs, ...., 51 = 2 of spades
        //0-12 = clus, 13-25 = diamonds, 26-38 = hearts, 39-51 = spades
        
        int hand [] = new int[5];//An array that holds the 5 cards in the poker hand
    }
    
    
    
    int Roulette=(int)(Math.random()*38)+0; //Math.random()*max)+min generates a random "int" in this case, between 38 and 0
}