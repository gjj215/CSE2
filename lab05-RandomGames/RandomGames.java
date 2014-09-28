//////////////////////////////////////////
//Greg Jacobs
//Lab 05 - CSE 002
//RandomGames
//September 27, 2014
//
// A program that displays the number of days for a inputed month.

import java.util.Scanner; //Import Scanner class before writing anything in the program
import java.util.Random; //Import random int generator class

public class RandomGames{
    public static void main(String[] args){
        //Scanner and user inputs
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        String letter = myScanner.next(); //Have scanner read the input string up to the first space or return key input
        String gametype; //A place to store the name of each game.
        
        Random rand = new Random(); //Declare the method for the random class
        switch(letter){ //Switch is a statement with have multiple execution paths,
                        //use this over if/else statments if there a a number of paths to take.
            //Cases are listed, if "letter" is the char after a case,
            //switch will send the program to that particular case
            case "R"://Can link cases together, in this cae, both R and r will trigger the same program area
            case "r":
                gametype = "Roulette";//Set String gametype to "Roulette"
                int Roulette=(int)(Math.random()*38)+0; //Math.random()*max)+min generates a random "int" in this case, between 38 and 0
                    if (Roulette == 38){ //Use the 38th digit as 00
                        Roulette = (int)00;//Convert to 00
                    }
                System.out.println(gametype+": "+Roulette); //Print out "Roulette: " and the random int
                break;//Break stops reading case(s) and goes to the next one
            case "C":
            case "c":
                gametype = "Craps";//Set String gametype to "Craps"
                int die1=(int)(Math.random()*6)+1;//A random die roll between 6 and 1
                int die2=(int)(Math.random()*6)+1;//Another random die roll between 6 and 1
                int sum = die1 + die2;//The sum of the 2 die rolls
                System.out.println(gametype+": "+die1+" + "+die2+" = "+sum);
                break;
            case "P":
            case "p":
                int card=(int)(Math.random()*14)+2;//13 cards in a suit
                String cardName;
                    if (card == 14)
                        cardName = "Ace";
                    else if (card == 13)
                        cardName = "King";
                    else if (card == 12)
                        cardName = "Queen";
                    else if (card == 11)
                        cardName = "Jack";
                    else
                        cardName = Integer.toString(card);//Don't rename numbers 2-10,
                        //use Integer.toString() to save "card" to "carName" as a String
                int suit=(int)(Math.random()*4)+1;//Random pick of 1 of the 4 suits in a deck
                String suitName;//Convert the random int to a name of a suit
                    if (suit == 1)
                        suitName = "clubs";
                    else if (suit == 2)
                        suitName = "spades";
                    else if (suit == 3)
                        suitName = "diamonds";
                    else
                        suitName = "hearts";
                System.out.println(cardName+" of "+suitName); //Print out card name and suit name
                break;
            default:
                    System.out.println("'"+letter+"' is not one of 'R', 'r', 'C', 'c', 'P', 'p'");//Print out nop
                break;
        }
    }
}