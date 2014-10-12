///////////////////////////////////////////
//Greg Jacobs
//Oct 1, 2014
//
// Drank
//
// Calculates the # of standard drinks in a drank container
//

import java.util.Scanner;

public class Drank{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("# of handles in drank (can be a double): ");
        double handles;
        
        //Constants
        double SDOunces = .54; //Ounces of alc in a standard drink
        double HandleOunces = 59.175; //Ounces in 1.75 L
        double OuncesPerGallon = 127.878;
        
        
        if(myScanner.hasNextDouble()){ //Check if user inputed an int
            handles = myScanner.nextDouble();
            
            Scanner myScanner2;
            myScanner2 = new Scanner( System.in);
            System.out.print("Proof of alcohol: ");
            int proof;
            if(myScanner2.hasNextInt()){
                proof = myScanner2.nextInt();
        
                Scanner myScanner3;
                myScanner3 = new Scanner( System.in);
                System.out.print("Size of drank bucket (in gals): ");
                int gals;
                if(myScanner3.hasNextInt()){
                    gals = myScanner3.nextInt();
                    
                    Scanner myScanner4;
                    myScanner4 = new Scanner( System.in);
                    System.out.print("Size of cups (in ounces): ");
                    int cupSize;
                    if(myScanner4.hasNextInt()){
                        cupSize = myScanner4.nextInt();
                        
                        double SDsInHandle = ((((proof/20)*HandleOunces)/10)/SDOunces);
                        double SDsInCup = (cupSize*handles*SDsInHandle/(gals*OuncesPerGallon));
                        System.out.println("Standard drinks per cup of size "+cupSize+" ounces is "+SDsInCup);
                    }//4th if
                    else{
                        System.out.println("You did not enter a number asshole");
                        return;
                    }//3rd else
                }//3rd if
                else{
                    System.out.println("You did not enter a number asshole");
                    return;
                }//3rd else
            }//2nd if
            else{
                System.out.println("You did not enter a number asshole");
                return;
            }//2nd else
        }//First if
        else{
            System.out.println("You did not enter a number asshole");
            return;
        }//First else
        
        
        
        
    }//Method
}//Class
        
        
        