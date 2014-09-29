//////////////////////////////////////////
//Greg Jacobs
//Homework 5 part 1 - CSE 002
//Burger King
//September 28, 2014
//
// An order of burgers, sodas, and fries, then with extras on those items.
//Prints out receipt.

import java.util.Scanner; //Import Scanner class before writing anything in the program
import java.util.Random; //Import random int generator class

public class BurgerKing{
    public static void main(String[] args){
        //Scanner and user inputs
        Scanner myScanner; //Declare an instance of the Scanner object in order to accept input
        myScanner = new Scanner( System.in ); //Call the Scanner constructor, which tells Scanner that I am creating an instance that will take input from STDIN
        System.out.println("Enter a letter to indicate a choice of: ");//Use println here so the cursor goes to the next line.
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.print("Fries (F or f)");//Use print to keep cursor on the line
        String item = myScanner.next(); //Have scanner read the input string up to the first space or return key input
        
        int inputLength = item.length();// item.length() measures the string length of item input
        if (inputLength == 1){//Check if input string is length 1
        switch(item){ //Switch is a statement with have multiple execution paths,
                        //use this over if/else statments if there a a number of paths to take.
            //Cases are listed, if "letter" is the char after a case,
            //switch will send the program to that particular case
            case "B"://Can link cases together, in this cae, both R and r will trigger the same program area
            case "b"://Burger case
                System.out.println("Enter A or a for 'all the fixins'");//Options to add to your burger
                System.out.println("C or c for cheese");//Options to add to your burger
                System.out.print("N or n for none of the above ");//Options to add to your burger
                Scanner myScanner2;//Create a new instance of Scanner called Scanner 2
                myScanner2 = new Scanner(System.in);//This is needed so the program reads a new input from the user instead of their previous input
                String burgerItems = myScanner2.next();//Hold input as a new string
                switch(burgerItems){//New switch case to determine what they want on their burger
                    case "A": case "a"://Can link cases together
                        System.out.println("You ordered a burger with all the fixins");//Print out burger with extras on it
                    break;//Breaks for both case A and case a
                    case "C": case "c":
                        System.out.println("You ordered a burger with cheese");//Print out burger with extras on it
                    break;
                    case "N": case "n": 
                        System.out.println("You ordered a burger with nothing on it");//Print out burger with extras on it
                    break;
                    default://Case if not expected entered
                        System.out.println("You did not enter an 'A', 'a', 'C', 'c', 'N', or 'n'");//Print out error statement
                    break;
                }//Close inner switch statement
            break;//Break case B and case b
            case "S": case "s"://Soda case
                System.out.println("Do you want Pepsi (P or p), Coke (C or c)");//Ask what type of soda they want
                System.out.print("Sprite (S or s), or Mountain Dew (M or m) ");
                Scanner myScanner3;//Create a new instance of the scanner
                myScanner3 = new Scanner(System.in);//So the program reads the newest user input
                String sodaType = myScanner3.next();//Store the input as a String
                switch(sodaType){//A new swtich to determine what type of soda they want
                    case "P": case "p":
                        System.out.println("You ordered a Pepsi");//Print out type of soda
                    break;
                    case "C": case "c":
                        System.out.println("You ordered a Coke");//Print out type of soda
                    break;
                    case "S": case "s": 
                        System.out.println("You ordered a Sprite");//Print out type of soda
                    break;
                    case "M": case "m":
                        System.out.println("You ordered a Mountain Dew");//Print out type of soda
                    break;
                    default://Case if not expected entered
                        System.out.println("You did not enter a 'P', 'p', 'C', 'c', 'S', 's', 'M', or 'm'");//Print out error statement
                    break;
                }//Close inner switch statement
            break;//Break case S and case s
            case "F": case "f"://Fries case
                System.out.println("Do you want a large or small order of fries (L, l, S, s)");//Aske what size of fries they want
                Scanner myScanner4;//Creat another instance of the scanner
                myScanner4 = new Scanner(System.in);//This reads the newest user input
                String fryType = myScanner4.next();//Store the user input as a string
                switch(fryType){//A new switch to determine fry size
                    case "L": case "l":
                        System.out.println("You ordered a large fries");//Print out fry size
                    break;
                    case "S": case "s":
                        System.out.println("You ordered a small fries");//Print out fry size
                    break;
                    default://Case if not expected entered
                        System.out.println("You did not enter a 'L', 'l', 'S', or 's'");//Print out error statement
                    break;
                }//Close inner switch statement
            break;//Break case F and case f
            default://Case if not expected input
                System.out.println("You did not enter a 'B', 'b', 'S', 's', 'F', or 'f'");//Print out error statement
            break;//Break default case
        }//Close switch
        }//Close if single statement
        else//Go here if more than one character was in input string
            System.out.println("A single character expected");//Print out error message
    }//Close method
}//Close class