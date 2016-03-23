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
        
        int nLine = 9;
        int nSpace = 0;
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;

        for (int nStar = nLine; counter < nLine; nLine--){
            while (counter1 < nSpace){
                System.out.println(" ");
                nSpace ++;
            }
            while (counter2 < nStar){
                System.out.print("*");
                counter2++;
            }
            nStar = nStar - 2;

        }
    }
}
        