//Rachel McCoog
//Convert Java Program 
// Feb. 10, 2016
// CSE 02 
// The purpose of this program is to aquire a value in meters from the user
// and then convert it to inches
import java.util.Scanner; // Scanner is in the java.util package

public class Convert {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	
   	// Create a Scanner object
    Scanner input = new Scanner(System.in);
    
    //Prompt the user to enter the distance
   	System.out.print("Enter the distance in meters:");
   	double meters1 = input.nextDouble();
   	
   	//Convert to inches
   	double inches1 = meters1 * 39.3701;
   	
   	//print the conversion
   	System.out.println("The distance " +meters1+ " meters is " +inches1+ " inches.");
   	
   	//Prompt the user to enter the disnce
   	System.out.print("Enter the distance in meters:");
   	double meters2 = input.nextDouble();
   	
   	//Convert to inches 
   	double inches2 = meters2 * 39.3701;
   	
   	//print the conversion
   	System.out.println("The distance " +meters2+ " meters is " +inches2+ " inches.");
   	    
   	    

	}  //end of main method   
} //end of class