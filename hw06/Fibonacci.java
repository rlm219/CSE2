/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//HW06 Fibonacci 
//
//  this program will ask user for numbers and how many fibonacci numbers should be printed and the calculate and print them numbers 

import java.util.Scanner; // Scanner is in the java.util package


//  define a class
public class Fibonacci{
    
//  add main method
    public static void main(String[] args) {
        
      //create scanner item
   	  Scanner input = new Scanner( System.in );
      //prompt user to enter three inputs 


      //accept next integer input as length 
      int secondLastNumber = 0;
      int lastNumber = 0;
      int customCount = 0;
      int newLastNumber = 0;
      
       // check to make sure the entered value is a positive integer
      
      int a = 0;
      boolean goodInput = false;
      
      System.out.print("Enter the first number in the sequence: ");
 
      while (!goodInput) {
          if (input.hasNextInt()){
            a = input.nextInt();
            if(a>0){
              secondLastNumber = a;
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
      
      int b = 0;
      boolean goodInput2 = false;
      
      System.out.print("Enter the second number in the sequence: ");
     
      while (!goodInput2) {
          if (input.hasNextInt()){
            b = input.nextInt();
            if(b>0){
              lastNumber = b;
              goodInput2 = true;
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
      
      int c = 0;
      boolean goodInput3 = false;
      
      System.out.print("How many custom Fibonacci numbers should be printed: ");
     
      while (!goodInput3) {
          if (input.hasNextInt()){
            c = input.nextInt();
            if(c>0){
              customCount = c;
              goodInput3 = true;
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
      
      int counter = 0;
      
      while(counter < customCount) {
        System.out.print(+secondLastNumber+","+lastNumber+"");
        
        newLastNumber = secondLastNumber + lastNumber;
        
        counter++;
        
        }
        
    
       
    }
}