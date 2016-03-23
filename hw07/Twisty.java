/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//HW 07 Twistie
//
/* this program will ask the user for two integers
Length and Width.  Length is to specify how many characters
the following pattern should spread, horizontally, across the screen.
Width should specify how many characters the following pattern should 
spread, vertically, across the screen. The values for length and width
must be positive integers, width must be smaller than length, and length
must be less than 80.

*/
import java.util.Scanner; // Scanner is in the java.util package


//  define a class
public class Twisty{
    
//  add main method
    public static void main(String[] args) {
        
     //create scanner item
   	  Scanner input = new Scanner( System.in );
      //accept next integer input as length 
      int length = 0;
      
      
      /* check to make sure the entered value for length is
      a positive integer less than 80.
      */
      int a = 0;
      boolean goodInputLength = false;
      
      System.out.println("Length must be an integer, enter a valid length: ");
      while (!goodInputLength) {
          if (input.hasNextInt()){
            a = input.nextInt();
            if(a>0 && a<80){
              length = a;
              goodInputLength = true;
            }
            else{
              System.out.println("Please enter a positive integer less than 80: ");
            }
          }
          else {
              System.out.println("Please enter integer: ");
              input.next();
          }
        }
     //accept the next integer as width
     int width = 0;
     
     
     /*check to make sure the entered value for width is a positive 
     integer less than length*/
     int b = 0;
     boolean goodInputWidth = false;
     
     System.out.println("Width must be an integer, enter a valid width: ");
      while (!goodInputWidth) {
          if (input.hasNextInt()){
            b = input.nextInt();
            if(b<a){
              width = b;
              goodInputWidth = true;
            }
            else{
              System.out.println("Please enter a positive integer less than length: ");
            }
          }
          else {
              System.out.println("Please enter integer: ");
              input.next();
          }
        }

      
      //create the twist
      int counter = 0;
      int twist = length/width;
      int leftOver = length%width;
      int rowCounter = 0;
      
      //create first half of twist
      while(rowCounter<width/2){
        int rowSpace = 0;
        while(rowSpace < rowCounter){
          System.out.print(" ");
          rowSpace++;
        }
        rowSpace = 0;
        System.out.print("#");
        while(rowSpace < width-(rowCounter+1)*2){
          System.out.print(" ");
          rowSpace++;
        }
        rowSpace = 0;
        System.out.print("/");
        while(rowSpace <rowCounter*2){
          System.out.print(" ");
          rowSpace++;
        }
          rowSpace=0;
        System.out.print("\\");
        while(rowSpace < width-(rowCounter+1)*2){
          System.out.print(" ");
          rowSpace++;
        }
        System.out.println("#");
        rowCounter++;
      }
     
     //create line for if width is odd 
    
     int oddRowSpace = 0; 
     if(width%2 != 0){
        while(oddRowSpace<rowCounter){
            System.out.print(" ");
            oddRowSpace++;
         }
         oddRowSpace = 0;
         System.out.print("#");
        while(oddRowSpace<(rowCounter*2)){
            System.out.print(" ");
            oddRowSpace++;
        }
        System.out.println("\\");
       rowCounter = (width-1)/2;
     }
    else{
      rowCounter = width/2;
    }
    
    rowCounter--;
     //create second half of twist
        while(rowCounter+1>0){
          int rowSpace = 0;
          while(rowSpace < rowCounter){
            System.out.print(" ");
            rowSpace++;
        }
          rowSpace = 0;
          System.out.print("/");
          while(rowSpace < width-(rowCounter+1)*2){
            System.out.print(" ");
            rowSpace++;
        }
          rowSpace = 0;
          System.out.print("#");
          while(rowSpace <rowCounter*2){
            System.out.print(" ");
            rowSpace++;
        }
          rowSpace= 0;
          System.out.print("#");
          while(rowSpace < width-(rowCounter+1)*2){
            System.out.print(" ");
            rowSpace++;
        }
        System.out.println("\\");
        rowCounter--;
      }
    
    }
}
        