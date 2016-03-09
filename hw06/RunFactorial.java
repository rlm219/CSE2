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
    
     //create scanner item
   	  Scanner input = new Scanner( System.in );
     
      int number = 0; //initialize number
      
   
      
      int a = 0;
      boolean goodInput = false;
      
      //make sure value entered is an integer between 9 and 16
      System.out.println("Enter an integer between 9 and 16: ");
      while (!goodInput) {
          if (input.hasNextInt()){
            a = input.nextInt();
            if(a>9 && a<16){
              number = a;
              goodInput = true;
            }
            else{
              System.out.println("Please enter an integer between 9 and 16: ");
            }
          }
          else {
              System.out.println("Please enter integer: ");
              input.next();
          }
        }
        
        //calculate factorial 
        int factorial = 1;
        int counter = 1;
        
        while (counter <= number ){
          factorial *= counter;
          counter++;
        }
      System.out.println(+number+"! = "+factorial);
        
    }
}