//////////////////////////////////////////
//Greg Jacobs
//Homework 11 - part 1
//CSE 002
//December 1, 2014
// Poker Hands
//
// In this homework, we use arrays and methods to generate random poker hands and determine the pairs.
//

import java.util.Scanner;
public class PokerHands{
    public static void main(String [] arg){
        Scanner myScanner = new Scanner (System.in);
        String answer;//Declare a variable for user input
        String rankInput;
        int a = 0;//Variable for looping if suit input was not valid
        //52 cards in a deck
        int deck [] = {0, 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 ,22 ,23 ,24 ,25 ,26 ,27, 28, 29, 30, 31,
        32, 33, 34, 35, 36 ,37, 38, 39, 40, 41, 42 ,43 ,44 ,45 ,46, 47, 48, 49, 50, 51};//0 = Ace of clubs, ...., 51 = 2 of spades
        //0-12 = clubs, 13-25 = diamonds, 26-38 = hearts, 39-51 = spades
        int hand [] = {-1, -1, -1, -1, -1};//An array that holds the 5 cards in the poker hand
        int ranksFreq [] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};//An array of size 13 to count the frequency for ranks
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand: ");
        answer = myScanner.next();//Set user answer to input variable
        while(answer.equals("Y") || answer.equals("y")){//Repeate code if user enters a Y or y
            int flushCountc = 0,flushCountd = 0,flushCounth = 0, flushCounts = 0;//Ints for seeing if the hand is a flush
            for(int i=0; i<hand.length; i++){//Loop this 5 times for the 5 cards in the hand
                int value = 0;//Change the user inputs into numerical values
                a = 0;//Set (reset) a to 0
                do{System.out.print("Enter the suit: 'c', 'd', 'h', or 's': ");//Ask user to enter the suit
                    answer = myScanner.next();
                    switch(answer){
                        case "c": a = 1; break;//If c,d,h, or s not entered, then set a = 1 so do-while loop runs again
                        case "d": a = 1; break;
                        case "h": a = 1; break;
                        case "s": a = 1; break;
                        default: System.out.println("You did not enter a valid response"); break;
                    }
                }while(a == 0);//Loop again if user did not enter correct input
                System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2': ");//Ask user to enter the rank
                rankInput = myScanner.next();
                switch(rankInput){//Assign the appropriate card value for the given ranks and fill in ranksFreq array
                    case "a": value = 0; ranksFreq[value] +=1; break;
                    case "k": value = 1; ranksFreq[value] +=1; break;
                    case "q": value = 2; ranksFreq[value] +=1; break;
                    case "j": value = 3; ranksFreq[value] +=1; break;
                    case "10": value = 4; ranksFreq[value] +=1; break;
                    case "9": value = 5; ranksFreq[value] +=1; break;
                    case "8": value = 6; ranksFreq[value] +=1; break;
                    case "7": value = 7; ranksFreq[value] +=1; break;
                    case "6": value = 8; ranksFreq[value] +=1; break;
                    case "5": value = 9; ranksFreq[value] +=1; break;
                    case "4": value = 10; ranksFreq[value] +=1; break;
                    case "3": value = 11; ranksFreq[value] +=1; break;
                    case "2": value = 12; ranksFreq[value] +=1; break;
                }
                int n = 0;
                switch(answer){//Determine the numerical value of the card by the inputed suit
                    case "c": n = 0; flushCountc += 1; break;//Clubs are from 0-12
                    case "d": n = 1; flushCountd += 1; break;//Diamonds are from 13-25
                    case "h": n = 2; flushCounth += 1; break;//Hearts are from 26-38
                    case "s": n = 3; flushCounts += 1; break;//Spades are from 39-51
                }
                value = value + (n*13);//Suits are a multiple of 13
                
                //Check if card was already entered by seeing if its already in the hand
                if(value == hand[0] || value == hand[1] || value == hand[2] || value == hand[3] || value == hand[4]){
                    System.out.println("You already entered that card");
                    hand[i] = -1;//Reset that card
                    i -=1;//Go back to the same i value to redo the card
                }
                else{
                    hand[i] = value;
                }
                for(int j=0; j<52; j++){//Take out the cards dealt to the hand from the deck
                    if(hand[i] == deck[j]){
                        for(int w = deck[j]; w < deck.length - 1; w++) {
                            deck[w] = deck[w + 1];
                        }
                        deck[deck.length - 1] = -1;
                    }
                }//End of remove dealt cards for loop
            }//End of the 5 times for loop
            showOneHand(hand);//Call the method to show the hand
            //System.out.println("Ranks freq: "+ranksFreq[0]+" "+ranksFreq[1]+" "+ranksFreq[2]+" "+ranksFreq[3]+" "+ranksFreq[4]+" "+ranksFreq[5]+" "+ranksFreq[6]+" "+ranksFreq[7]+" "+ranksFreq[8]+" "+ranksFreq[9]+" "+ranksFreq[10]+" "+ranksFreq[11]+" "+ranksFreq[12]);
            if(flushCountc==5 || flushCountd==5 ||flushCounth==5 ||flushCounts==5){//See of the hand is a flush before calling the method
                System.out.println("This is a Flush");
            }
            else{
                typeHand(ranksFreq);
            }
            //ranksFreq [] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};//Reset ranks freq
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand: ");//Ask user if they want to go again
            answer = myScanner.next();//Set user answer to input variable
        }//End of Y, y while loop
        System.out.println("--------------------");
        
    }
    ///Method to print out final hand
    public static void showOneHand(int hand[]){
    	String suit[]={"Clubs:	","Diamonds: ","Hearts:   ","Spades:   "};
    	String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
    	String out="";
    	for(int s=0; s<4; s++){
          	out+=suit[s];
          	for(int rank=0; rank<13; rank++){
            	for(int card=0; card<5; card++){
                 	if(hand[card]/13==s && hand[card]%13==rank){
                  	    out+=face[rank];
                 	}
            	}
          	}
          	out+='\n';
    	}
    	System.out.println(out);
    }

    public static void typeHand(int freq []){
        int [] count = {0, 0, 0, 0, 0};//Create an array of size 5 that counts the frequency of 0s, 1s, 2s, 3s, and 4s from freq[]
        for(int i=0; i<freq.length; i++){
            switch(freq[i]){
                case 0: count[0] +=1; break;//Count the 0s in freq[]
                case 1: count[1] +=1; break;//Count the 1s in freq[]
                case 2: count[2] +=1; break;//Count the 2s in freq[]
                case 3: count[3] +=1; break;//Count the 3s in freq[]
                case 4: count[4] +=1; break;//Count the 4s in freq[]
            }
        }
        //System.out.println("Count: "+count[0]+" "+count[1]+" "+count[2]+" "+count[3]+" "+count[4]);
        
        int hand0 [] = {8,5,0,0,0};
        int hand1 [] = {9,3,1,0,0};
        int hand2 [] = {10,1,2,0,0};
        int hand3 [] = {12,0,0,1,0};
        int hand4 [] = {11,0,1,1,0};
        int hand5 [] = {12,0,0,0,1};
        
        if(count == hand0)
            System.out.println("This is a High Card");
        if(count == hand1)
            System.out.println("This is a One Pair");
        if(count == hand2)
            System.out.println("This is a Two Pair");
        if(count == hand3)
            System.out.println("This is a 3 Of A Kind");
        if(count == hand4)
            System.out.println("This is a Full House");
        if(count == hand5)
            System.out.println("This is a 4 Of A Kind");
        
        /*if(count[4] == 1){
            System.out.println("This is a 4 Of A Kind");
        }
        else if(count[3]== 1){
            if(count[2] == 1){
                System.out.println("This is a Full House");}
            else{ System.out.println("This is a 3 Of A Kind"); }
        }
        else if(count[2] == 2){
            System.out.println("This is a Two Pair");
        }
        else if(count[2] == 1){
            System.out.println("This is a One Pair");
        }
        else{
            System.out.println("This is a High Card");
        }*/
    }
}