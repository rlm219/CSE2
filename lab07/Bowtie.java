/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//Lab 07 Bowtie
//
//  this program will use a loop statements to output a bowtie design 

import java.util.Scanner; // Scanner is in the java.util package


//  define a class
public class Bowtie{
    
//  add main method
    public static void main(String[] args) {
        
        int nStars = 9;
        int counter = 0;

        for (int nStar = 9; counter < nStar; counter++){
                System.out.print("*");
        }
    }
}
        