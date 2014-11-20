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
import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] arg){
        showHands();
        simulateOdds();
    }//End of main method
    
    //Method to generate random poker hands
    public static void showHands(){
        Scanner scan = new Scanner (System.in);
        String answer = "";//Declare user input variable
        String out = "";//Declare output string
        Random rand = new Random(); //Declare the method for the random class
        //52 cards in a deck
        int deck [] = {0, 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 ,22 ,23 ,24 ,25 ,26 ,27, 28, 29, 30, 31,
        32, 33, 34, 35, 36 ,37, 38, 39, 40, 41, 42 ,43 ,44 ,45 ,46, 47, 48, 49, 50, 51};//0 = Ace of clubs, ...., 51 = 2 of spades
        //0-12 = clubs, 13-25 = diamonds, 26-38 = hearts, 39-51 = spades
        int hand [] = {-1, -1, -1, -1, -1};//An array that holds the 5 cards in the poker hand
        do{
            for (int i=0; i<5; i++){//Fill the hand array with 5 random cards
                hand [i]=(int)(Math.random()*(51 - i))+0; //Math.random()*max)+min generates a random "int" in this case, between 51 and 0
                for(int p = 0; p < 5; p++) {
                    while (hand[i] == hand[p] && i != p) {
                        hand [i]=(int)(Math.random()*(51 - i))+0; //Math.random()*max)+min generates a random "int" in this case, between 51 and 0
                    }
                }
                
                
                for(int j=0; j<52; j++){//Take out the cards dealt to the hand from the deck
                   if(hand[i] == deck[j]){
                       for(int w = deck[j]; w < deck.length - 1; w++) {
                           deck[w] = deck[w + 1];
                       }
                       deck[deck.length - 1] = -1;
                       
                   }
                }
                
                switch(hand[i]/13){//Dividing the current card value (0-51) by 13 will tell us the suit.
                    case 0: out= "Clubs: ";//If 13 goes into the value 0 times, then the suit is clubs.
                        break;
                    case 1: out= "Diamonds: "; break;
                    case 2: out= "Hearts: "; break;
                    case 3: out= "Spades: "; break;
                }//End of switch
                switch(hand[i]%13){//Putting 13 into the value and finding the remainder will tell us what the card rank is.
                    case 0: out+= "A";//If 13 goes into the value without a remainder, then the rank is and ace.
                        break;
                    case 1: out+= "K"; break;
                    case 2: out+= "Q"; break;
                    case 3: out+= "J"; break;
                    case 4: out+= "10"; break;
                    case 5: out+= "9"; break;
                    case 6: out+= "8"; break;
                    case 7: out+= "7"; break;
                    case 8: out+= "6"; break;
                    case 9: out+= "5"; break;
                    case 10: out+= "4"; break;
                    case 11: out+= "3"; break;
                    case 12: out+= "2"; break;
                }//End of switch
                System.out.println(out);//Print out statement
            }//End of for loop
            System.out.print("Go again? Enter 'y' or 'Y'; anything else to quit: ");//Ask user if they want to run the program again
            answer = scan.next();//Look for next user input
        }while(answer.equals("Y") || answer.equals("y"));//Repeate code if user enters a Y or y
    }
    
    //Method to simulate pair odds of 10000 hands
    public static void simulateOdds(){
        int countA = 0, countK = 0, countQ = 0, countJ = 0, count10 = 0, count9 = 0, count8 = 0, count7 = 0,
        count6 = 0, count5 = 0, count4 = 0, count3 = 0, count2 = 0;//Initialize all the counters for duplicates per rank
        int hand [] = {-1, -1, -1, -1, -1};//An array that holds the 5 cards in the poker hand
        int q = 13;//q holds the value of the ranks that have duplicates
        int total = 0;//Total holds the value of hands that don't have exactly one duplicate
        for(int j=0; j<=10000; j++){//Run the test 10000 times
            for (int i=0; i<5; i++){//Fill the hand array with 5 random cards
                hand [i]=(int)(Math.random()*(51 - i))+0; //Math.random()*max)+min generates a random "int" in this case, between 51 and 0
            }//End of hand for loop
            
            int count = 0;//Counts if there is exactly one duplicate in a hand
            int countDup = 0;//Counts if there are duplicates of a rank
            for(int i=0; i<hand.length; i++){
                for(int k=0; k<hand.length; k++){//Compare testValue for each value in the array
                    if(hand[i]==hand[k] && i!=k){//If han[i] = hand [j], then there is a duplicate
                        count = count + 1;//Add one to count for each duplicate
                        countDup = countDup + 1;//Add one to countDup for each duplicate
                        if (countDup == 1){//If coundDup was triggered, then the was a duplicate of that rank
                            q = hand[i];//q is hold the value of that rank
                            countDup = 0;//Reset countDup to 0
                        }
                    }
                }
            }
            if(count != 2){//If there is not exactly one duplicate,
                total += 1;//then add one to the count for hands that don't have exactly one duplicate
            }
            switch(q){//q is stored into the duplicate counters
                case 0: countA += 1; break;
                case 1: countK += 1; break;
                case 2: countQ += 1; break;
                case 3: countJ += 1; break;
                case 4: count10 += 1; break;
                case 5: count9 += 1; break;
                case 6: count8 += 1; break;
                case 7: count7 += 1; break;
                case 8: count6 += 1; break;
                case 9: count5 += 1; break;
                case 10: count4 += 1; break;
                case 11: count3 += 1; break;
                case 12: count2 += 1; break;
                case 13: break;
            }//End of switch
        }//End of 10000 for
        System.out.println("rank freq of exactly one pair");
        System.out.println(" A   "+countA);
        System.out.println(" K   "+countK);
        System.out.println(" Q   "+countQ);
        System.out.println(" J   "+countJ);
        System.out.println(" 10  "+count10);
        System.out.println(" 9   "+count9);
        System.out.println(" 8   "+count8);
        System.out.println(" 7   "+count7);
        System.out.println(" 6   "+count6);
        System.out.println(" 5   "+count5);
        System.out.println(" 4   "+count4);
        System.out.println(" 3   "+count3);
        System.out.println(" 2   "+count2);
        System.out.println("--------------------");
        System.out.println("Total not exactly one pair: "+total);
    }//End of simulateOdds method

}//End of class