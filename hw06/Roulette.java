//////////////////////////////////////////
//Greg Jacobs
//Homework 6 part 1 - CSE 002
//Roulette
//October 13, 2014
//
// Place $1 on a randomly selected number in roulette for 100 spins. Everytime your number comes up,
// you get $36. So in order to make a profit, your number needs to come up 3 times in every
// 100 spins. Runs this 100 spin sample 1000 times and record:
// 1. # of times I lose everything
// 2. Total winnings of the 1000 times
// 3. # of time I made a profit

//Steps:
// 1. Generate a random number out of 38
// 2. Match that given number to a random number generator and see how many times they match
//    out of 100 spins.
// 3. For every match, flag, add up flags in 100 samples, multiply by $36, subtract from $100,
//    gives profit (or losses)
// 4. If not flags happen, record that as a total loss.
// 5. Flag if matches more than 3, increment flag, after 1000 times add the flags up together,
//    This gives the answer to #3.

import java.util.Random; //Import random int generator class

public class Roulette{
    public static void main(String[] args){
        Random rand = new Random(); //Declare the method for the random class
        int playerNumber = (int)(Math.random()*38)+1; //Math.random()*max)+min generates a random "int", 38 possible values
            System.out.println("Your number is: "+playerNumber);
        int matchCount = 0;//Records the number of matches in 100 turns
        int lostEverything = 0;//Records the number of times the player did not get any matches
        int samples = 1000;//Run 1000 samples of the 100 turns.
        int goodGame = 0;//Number of profitable 100 turn games
        int totalMatch = 0;//Number of total matches in the 1000 samples
        while(samples>0){
            int gameCount = 100;//100 turns per sitting
            while(gameCount>0){//Loop for a 100 games
                int wheelNumber = (int)(Math.random()*38)+1; //Number that shows up on the wheel
                if(playerNumber==wheelNumber)//If play number matches wheel number (winning game)
                    matchCount++;//Increment matchCount everytime there is a match
                gameCount--;//Decremet value of gameCount until less than 1 (while loop stops)
            }//End of gameCount while
            totalMatch = totalMatch+matchCount;//Adds up all the matches (because matchCount has to be reset every run)
            if(matchCount==0)//Check how many times the player lost everything
                lostEverything++;
            if(matchCount>=3)//Check how many times player walked away with profit
                goodGame++;
                matchCount=0;//Reset matchCount for every 100 turns
            samples--;//Decrement smaples until 1000 have been taken
        }//End of while samples
        int change$ = (totalMatch*36)-100000;//The total profit or loss of all the 100 turn games
        System.out.println("You had "+goodGame+" profitable 100 turn games");//Print out how many profitable games there were
        System.out.println("You lost everything "+lostEverything+" times");//Print out how many times the player didnt get a match
        System.out.println("Your total profit (or loss) is "+change$);
    }//End of method
}//End of class