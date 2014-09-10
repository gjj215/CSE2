/////////////////////////////////
//Greg Jacobs
//Homework 2 - CSE 002
//September 7, 2014
//
//A program to compute the cost and sales tax of items purchased

public class Arithmetic{
    public static void main(String[] args){
        //Variables (assumptions)
        int nSocks=3; //Number of pair of socks
        double sockCost$=2.58; //Cost per pair of socks, '$' is part of the variable name
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        int nEnvelopes=1; //Number of boxes of envelopes
        double envelopeCost$=3.25; //Cost per envelope
        double taxPercent=0.06; //Terrible PA sales tax
        //More variables
        double totalSockCost$, //Total cost of socks (without tax)
        taxSocks, //Tax from the total sock cost
        totalGlassCost$, //Total cost of glasses (without tax)
        taxGlass, //Tax from the total glasses cost
        totalEnvelopeCost$, //Total cost of envelopes (without tax)
        taxEnvelope; //Tax from the total envelope cost
        
        //Calculations for totals and tax
        totalSockCost$=nSocks*sockCost$;
        taxSocks=(totalSockCost$*taxPercent);
        totalGlassCost$=nGlasses*glassCost$;
        taxGlass=(totalGlassCost$*taxPercent);
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        taxEnvelope=(totalEnvelopeCost$*taxPercent);
        
        //Print out items, number of items, cost per item, and tax.
        System.out.println ("Socks ");
        System.out.println ("Number bought "+nSocks);
        System.out.println ("Cost per item "+sockCost$);
        System.out.println ("Glasses ");
        System.out.println ("Number bought "+nGlasses);
        System.out.println ("Cost per item "+glassCost$);
        System.out.println ("Envelopes ");
        System.out.println ("Number bought "+nEnvelopes);
        System.out.println ("Cost per item "+envelopeCost$);
        System.out.println (" "); //Empty line to separate output values
        //Print out total cost and tax for each item
        System.out.println ("Total sock cost: "+totalSockCost$);
        System.out.println ("6% tax: "+taxSocks);
        System.out.println ("Total glasses cost: "+totalGlassCost$);
        System.out.println ("6% tax: "+taxGlass);
        System.out.println ("Total envelope cost: "+totalEnvelopeCost$);
        System.out.println ("6% tax: "+taxEnvelope);
        System.out.println (" "); //Empty line to separate output values
        //Print out total cost and tax
        System.out.println ("Total purchase cost: "+(totalSockCost$+totalGlassCost$+totalEnvelopeCost$));
        System.out.println ("Total tax: "+(taxSocks+taxGlass+taxEnvelope));
        System.out.println ("Total cost including tax: "+(totalSockCost$+totalGlassCost$+totalEnvelopeCost$+taxSocks+taxGlass+taxEnvelope));
        
    }
}
