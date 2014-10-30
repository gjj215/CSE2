//////////////////////////////////////////
//Greg Jacobs
//Homework 8 - CSE 002
//October 29, 2014
//Driver Program
//
// Using an overloaded method to get the program to work
//

import java.util.Scanner; //Import Scanner class before writing anything in the program

public class HW8{
    public static void main(String[] args){
        char input;//Declare user input as a character
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");//Prompt user to enter an input
        input=getInput(myScanner, "Cc");//Call method 1
        System.out.println("You entered "+input);//Output of method 1
        System.out.print("Enter 'y', 'Y', 'n', 'N'-");//Prompt user to enter another input
        input=getInput(myScanner, "yYnN",5);//Call method 2
        if(input!=' '){//If user failed after 5 tries
            System.out.println("You entered "+input);
        }
        System.out.println("Choose a digit");//Prompt user to enter another input
        System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
        input=getInput(myScanner, "Choose a digit. ","0123456789");//Call method 3
        System.out.println("You entered "+input);//Output of method 3
    }//End of main method
    
    //Method 1
    public static char getInput(Scanner n, String str){//n is the scanner variable, str is the string "Cc" to compare the input to
        char c;//Declare a character variable
        while(n.hasNext()) {//If there is an input from scanner, continue
            String s = n.next();//Set a string variable to the scanner input
            if (s.length() == 1) {//If the string is only one character long
                c = s.charAt(0);//Then set our character variable 'c' to the string variable
                for (int i = 0; i < str.length(); i++) {//Loop for the length of "Cc"
                    if (c == str.charAt(i)) {//If the user input, now stored in char c is equal to any part of String str (which is "Cc")
                        return c;//Then return the char c.
                    }//End of if
                }//End of for loop
                System.out.print("You did not enter a character from the list '"+str+"'; try again");//If input is not on the list, error message
            }//End of if length
            else {//If input length is not 1 character long
                System.out.print("You should enter exactly one character-");//Print error message
            }//End of else
        }//End of while
        return ' ';//If there is no input from scanner, send back a random character, in this case a space
    }//End of method
    
    //Method 2
    public static char getInput(Scanner n, String str, int a){
        char c;
        int b = a;//Set defined number of tries to int b
            while(n.hasNext()) {//If there is an input from scanner, continue
                String s = n.next();//Set a string variable to the scanner input
                if(b>0){
                    if (s.length() == 1) {//If the string is only one character long
                        c = s.charAt(0);//Then set our character variable 'c' to the string variable
                        for (int i = 0; i < str.length(); i++) {//Loop for the length of "Cc"
                            if (c == str.charAt(i)) {//If the user input, now stored in char c is equal to any part of String str (which is "Cc")
                            return c;//Then return the char c.
                            }//End of if
                        }//End of for loop
                        System.out.print("You did not enter a character from the list '"+str+"'; try again ");//If input is not on the list, error message
                    }//End of if length
                    else {//If input length is not 1 character long
                        System.out.print("You should enter exactly one character- ");//Print error message
                    }//End of else
                    b--;//Decrement a
                }//End of if a
                else{//All the tries have been used up
                    System.out.println("You failed after "+a+" tries");//Error message
                    return ' ';//If there is no input from scanner, send back a random character, in this case a space
                }//End of else
            }//End of while
            return ' ';//If there is no input from scanner, send back a random character, in this case a space
    }//End of method
    
    //Method 3
    public static char getInput(Scanner n, String a, String b){
        char c;//Declare a character variable
        while(n.hasNext()) {//If there is an input from scanner, continue
            String s = n.next();//Set a string variable to the scanner input
            if (s.length() == 1) {//If the string is only one character long
                c = s.charAt(0);//Then set our character variable 'c' to the string variable
                for (int i = 0; i < b.length(); i++) {//Loop for the length of "Cc"
                    if (c == b.charAt(i)) {//If the user input, now stored in char c is equal to any part of String str (which is "Cc")
                        return c;//Then return the char c.
                    }//End of if
                }//End of for loop
                System.out.println("You did not enter an acceptable character");//If input is not on the list, error message
            }//End of if length
            else {//If input length is not 1 character long
                System.out.println("You should enter exactly one character-");//Print error message
            }//End of else
            System.out.println(a);//Print a demand
            System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
        }//End of while
        return ' ';//If there is no input from scanner, send back a random character, in this case a space
    }//End of method
    
}//End of class