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
        int nStar = 9;
        int lineCounter = 0;
        int counter = 0;
        Scanner input = new Scanner( System.in );
        boolean goodInput= false;
        int a = 0;
      System.out.println("Length must be an odd integer, enter a valid length: ");
      while (!goodInput) {
          if (input.hasNextInt()){
            a = input.nextInt();
            if(a%2 != 0 && a<=33 && a>=3){
              nStar = a;
              goodInput = true;
            }
            else{
              System.out.println("Please enter an odd integer between 3 and 33: ");
            }
          }
          else {
              System.out.println("Please enter integer: ");
              input.next();
          }
        }
        
        
       while(lineCounter<nStar){     
            if(lineCounter > nStar/2){
                break;
            }
            while(counter<nStar){
                if(lineCounter>counter || nStar-lineCounter<=counter){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                counter ++;
            }
            lineCounter++;
            System.out.println("");
            counter = 0;
       } 
       
       while(lineCounter<nStar){
            while(counter<nStar){
                if(counter>lineCounter || counter < nStar-lineCounter-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                counter ++;
            }
            lineCounter++;
            System.out.println("");
            counter = 0;
       }
       
       
       
    }
}
        