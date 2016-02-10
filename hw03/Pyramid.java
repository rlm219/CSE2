//Rachel McCoog
//Pyramid Java Program 
// Feb. 10, 2016
// CSE 02 
// The purpose of this program is to aquire the dimensions of a pyramid from the user
// and then the program outputs the volume inside the pyramid.
import java.util.Scanner; // Scanner is in the java.util package

public class Pyramid {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	
   	// Create a Scanner object
    Scanner input = new Scanner(System.in);
    
    //Prompt the user to enter the square side of the pyramid
   	System.out.println("Enter the length of the square side of the pyramid(25)");
   	double squareside = input.nextDouble();
   	
   
   //Prompt the use to enter the height of the pyramid 	
   	Scanner input2 = new Scanner(System.in);
   	System.out.println("Enter the height of the pyramid (15)");
   	double height = input.nextDouble();
   	
   	//Find the volume inside the pyramid
   	double volumePyramid = (squareside*squareside*height)/3;
   	
   	System.out.println("The volume inside the pyramid is" +volumePyramid+".");
   	    
   	    

	}  //end of main method   
} //end of class