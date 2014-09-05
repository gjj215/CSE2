////////////////////////////////
//Greg Jacobs
//CSE 002
//
//Lab 2 - Cyclometer
//A basic program that can store numerical values in variables and perform basic computations with those variables.
//
public class Cyclometer{
    //main method required for every Java program
    public static void main(String[] args){
        //Variables
        int secsTrip1=480; //seconds in trip 1
        int secsTrip2=3220; //seconds in trip 2
        int countsTrip1=1561; //rotation counts for trip 1
        int countsTrip2=9037; //rotation counts for trip 2
        //Constants
        double wheelDiameter=27.0, //wheel diameter
        PI=3.14159, //Pi
        feetPerMile=5280, //number of feet in a mile
        inchesPerFoot=12, //inches in a foot
        secondsPerMinute=60; //60 seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //Distance variables
        //print out variables
        System.out.println ("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println ("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        
        //Compute the values for the distances.
        //Distance = # of rotations * 2piR (wheel diameter times pi)
        distanceTrip1=countsTrip1*wheelDiameter*PI; //Distance is in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; //Convert into miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //same for trip 2
        totalDistance=distanceTrip1+distanceTrip2; //Total distance
        //Print out the distances
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    } //end of main method
} //end of class