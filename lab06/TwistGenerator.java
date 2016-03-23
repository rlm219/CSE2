/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//Lab 06 Twist Generator 
//
//  this program will use a loop statement to output a twist design 

import java.util.Scanner; // Scanner is in the java.util package


//  define a class
public class TwistGenerator{
    
//  add main method
    public static void main(String[] args) {
        
      //create scanner item
   	  Scanner input = new Scanner( System.in );
      //accept next integer input as length 
      int length = 0;
      int counter = 0;
      
      // check to make sure the entered value is an integer
      
      int a = 0;
      boolean goodInput = false;
      
      System.out.println("Length must be an integer, enter a valid length: ");
      while (!goodInput) {
          if (input.hasNextInt()){
            a = input.nextInt();
            if(a>0){
              length = a;
              goodInput = true;
            }
            else{
              System.out.println("Please enter a positive integer: ");
            }
          }
          else {
              System.out.println("Please enter integer: ");
              input.next();
          }
        }
      //create a twist  
      int counter = 0;  
      int twist = length/3;
      int leftOver = length%3;
     
      while(counter < twist) {
      
        System.out.print("\\ /"); //forward slash is an escape key so need two
        counter++;
        }
        if (leftOver ==1) {
          System.out.println("\\");
        }
        else if (leftOver ==2){
          System.out.println("\\ ");
        }
      counter = 0;
      
      while(counter < twist) {
      
        System.out.print(" X "); 
        counter++;
        }
        if (leftOver ==1) {
          System.out.println(" ");
        }
        else if (leftOver ==2){
          System.out.println(" X");
        }
      counter = 0;
      
      while(counter < twist) {
      
        System.out.print("/ \\"); 
        counter++;
        }
        if (leftOver ==1) {
          System.out.println("/");
        }
        else if (leftOver ==2){
          System.out.println("/ ");
        }

  
       
    }
}