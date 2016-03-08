/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//HW 06 Run Factorial 
//
//  this program will use a while-loop statement to solve factorial programs

import java.util.Scanner; // Scanner is in the java.util package


//  define a class
public class RunFactorial{
    
//  add main method
    public static void main(String[] args) {
    
    //create a scanner item
    Scanner input = new Scanner(System.in);
    //prompt user to enter an integer 
    System.out.print("Please enter an integer that is between 9 and 16: ");
    int value1;
    
      // check to make sure the entered value is an integer
      while ( ! Scanner.hasNextInt()) {
      System.out.print("Invalid input, enter again!: ");
        Scanner.next(); //clears bad input
      }
      
      //check to make sure entered value is between 9 and 16
      while (value1 > 16 || value1 < 9) {
      System.out.println("Value must be between 9 and 16: ");
       value1 = Scanner.nextInt();
      }
      
      
        
    }
}