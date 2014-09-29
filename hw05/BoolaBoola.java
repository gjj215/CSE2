//////////////////////////////////////////
//Greg Jacobs
//Homework 5 part 2 - CSE 002
//BoolaBoola
//September 28, 2014
//
// Prints out a random express of cominations of trues and falses and askes the user
//if the answer is true or false

import java.util.Scanner; //Import Scanner class before writing anything in the program
import java.util.Random; //Import random int generator class

public class BoolaBoola{
    public static void main(String[] args){
        //Scanner and user inputs
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        
        Random rand = new Random(); //Declare the method for the random class
//////////////////////////////////////////////////////////
//Randomizer and print question part of the program
        //True/false randomizer 1
        int TrueFalse=(int)(Math.random()*2)+1; //Math.random()*max)+min generates a random "int" in this case, between 1 and 2
            String TrueFalseName;//Create string to change ints to names
            if (TrueFalse == 1)//1 for True
                TrueFalseName = "True";//Set 1 to read the string "True"
            else{
                TrueFalseName = "False";//Set 2 to read the string "False"
            }
        //True/false randomizer 2
        int TrueFalse2=(int)(Math.random()*2)+1; //Math.random()*max)+min generates a random "int" in this case, between 1 and 2
            String TrueFalseName2;//Create string to change ints to names
            if (TrueFalse2 == 1)//1 for True
                TrueFalseName2 = "True";//Set 1 to read the string "True"
            else
                TrueFalseName2 = "False";//Set 2 to read the string "False"
                
        //True/false randomizer 3
        int TrueFalse3=(int)(Math.random()*2)+1; //Math.random()*max)+min generates a random "int" in this case, between 1 and 2
            String TrueFalseName3;//Create string to change ints to names
            if (TrueFalse3 == 1)//1 for True
                TrueFalseName3 = "True";//Set 1 to read the string "True"
            else
                TrueFalseName3 = "False";//Set 2 to read the string "False"
        
        //OR / AND randomizer 1
        int OrAnd=(int)(Math.random()*2)+1;//Random variable between 1 and 2
            String OrAndName;//Create string to change ints to names
            if (OrAnd == 1)//1 for OR
                OrAndName = "||";//Set 1 to read the string "||"
            else//2 for AND
                OrAndName = "&&";//Set 2 to read the string "&&"
        
        //OR / AND randomizer 2
        int OrAnd2=(int)(Math.random()*2)+1;//Random variable between 1 and 2
            String OrAndName2;//Create string to change ints to names
            if (OrAnd2 == 1)//1 for OR
                OrAndName2 = "||";//Set 1 to read the string "||"
            else//2 for AND
                OrAndName2 = "&&";//Set 2 to read the string "&&"
        
        System.out.println("Does "+TrueFalseName+" "+OrAndName+" "+TrueFalseName2+" "+OrAndName2+" "+TrueFalseName3+" have the value true(T/t) or false(F/f)? ");//Print out statement for user to answer
        String correctAnswer = "i";//A string to store the character of the correct answer (initialized at i for compiler)
        String beginning = "i";//A string to hold the solution to the first part of the expression (initialized at i for compiler)
/////////////////////////////////////////////////////////
//Evaluation part of the program
        //Evaluate the first part of the expression
        
        if (OrAnd == 2){//If the first operator is AND
            if (TrueFalse == 1 && TrueFalse2 == 1)//If true and true
                beginning = "T";//THen beginning part is true
            else//Any other combination with AND is false
               beginning = "F";//If the first part is (True and false) or (false and true) or (false and false) then the
                //first part of the expression is false.
        }
        else{//The first operator is OR
            if (TrueFalse == 2 && TrueFalse2 == 2)//If False or False
                beginning = "F";//Beginning is false
            else//Any other combination with OR is true
                beginning = "T";//If the first part of the expression is (True or true) or (true or false) or (false or true)
                //Then the first part of the expression is true.
        }

        if (OrAnd2 == 2){//If the second operator is AND
            if (beginning == "F")//If the first part of the expression is false, false and anything comes out false
                correctAnswer = "F";//Correct answer is false
            else if (beginning == "T" && TrueFalse3 == 2)//If true and false
                correctAnswer = "F";//The final answer is false
            else//If true and true
                correctAnswer = "T";//The final answer is true
        }
        else{//Second operator is OR
            if (beginning == "T")//The the first part of the expression is true, true or anything is true
                correctAnswer = "T";//Correct answer is true
            else if (beginning == "F" && TrueFalse3 == 2)//If false or false
                correctAnswer = "F";//Correct answer is false
            else//If false or true
                correctAnswer = "T";//Correct answer is true
        }
        
        
        //Compare correct answer to user answer
        String answer = myScanner.next(); //Have scanner read the input string up to the first space or return key input
        int inputLength = answer.length();// item.length() measures the string length of item input
        if (inputLength == 1){//Check if input string is length 1
            switch(answer){
                case "T": case "t"://User enters true
                    if (correctAnswer == "T")//If user answer = program answer
                        System.out.println("correct");//Then the user is correct
                    else
                        System.out.println("Wrong; try again");//If user answer =/ program answer then user in incorrect
                break;//Break after you are done with your case(s)
                case "F": case "f"://User enters false
                    if (correctAnswer == "F")//If user answer = program answer
                        System.out.println("correct");//Then the user is correct
                    else
                        System.out.println("Wrong; try again");//If user answer =/ program answer then user in incorrect
                break;//Break after you are done with your case(s)
                default://Use entered unexpected character or int
                    System.out.println("You did not enter a 'T', 't', 'F', 'f'");//Error message
                break;
            }//Close switch
        }//Close if length statement
        else
            System.out.println("A single character expected");
    }//Close method
}//Close class