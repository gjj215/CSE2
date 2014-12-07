//////////////////////////////////////////
//Greg Jacobs
//Homework 11 - part 2
//CSE 002
//December 7, 2014
// Matrix Sorter
//
// In this homework, we use arrays and methods to generate ran
//

import java.util.Random;
public class MatrixSorter{
    public static void main (String arg []){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }
    
    //Method to build 3D array
    public static int [][][] buildMat3d(){
        int[][][] x = new int [3][][];
        String out="";//Variable for printing out the arrays
        Random rand = new Random(); //Declare the method for the random class
        for(int s=0; s<x.length; s++){//3 slabs in the 3D array
            x[s]= new int [(s*2)+3][];//Make each slab array have certain lengths
            for(int c=0; c<x[s].length; c++){//For each column of each slab
                x[s][c] = new int [c + s + 1];
                for(int n=0; n<x[s][c].length; n++){//Fill each array with random numbers
                    x[s][c][n]=(int)(Math.random()*(99 - n))+1; //Math.random()*max)+min
                }
            }
        }
        return x;
    }
    
    //Method to print out the 3D array
    public static void show(int[][][] x){
        for(int s=0; s<x.length; s++){//3 slabs in the 3D array
            System.out.println("---------------------- Slab"+(s+1));
            for(int c=0; c<x[s].length; c++){//For each column of each slab
                for(int n=0; n<x[s][c].length; n++){//Fill each array with random numbers
                    System.out.print(x[s][c][n]+" ");//Print out the sorted array
                }
                System.out.println();
            }
            System.out.println();
        }
        //System.out.println();
    }
    
    //Method to find the smallest entry in the array
    public static int findMin(int [][][] x){
        int min = 100;
        for(int s=0; s<x.length; s++){//3 slabs in the 3D array
            for(int c=0; c<x[s].length; c++){//For each column of each slab
                for(int n=0; n<x[s][c].length; n++){//Fill each array with random numbers
                    if(x[s][c][n] < min){
                        min = x[s][c][n];
                    }
                }
            }
        }
        return(min);
    }
    
    //Method to sort array
    public static int [][] sort(int [][] x){//Sort only the 3rd matrix
        for(int k=0; k<x.length; k++){
            for(int i=0; i<x[k].length; i++){//For each element i
                for(int j= i + 1; j<x[k].length; j++){// Compare i to element j
                    if(x[k][j]<x[k][i]){//If j > i, swap them
                        int temp = x[k][j];
                        x[k][j]=x[k][i];
                        x[k][i]=temp;
                    }
                }
            }
        }
        //sortRows(x);
        return(x);
    }
   /* 
    public static int [] sortRows(int [] x){//Sort only the 3rd matrix
        for(int i=0; i<x.length; i++){//For each element i
            for(int j= i + 1; j<x.length; j++){// Compare i to element j
                if(x[j]<x[i]){//If j > i, swap them
                    int temp = x[j];
                    x[j]=x[i];
                    x[i]=temp;
                }
            }
        }
        return(x);
    }*/
    
}