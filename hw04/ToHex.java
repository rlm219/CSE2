//////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//Decimal to Hexidecimal Converter  
//HW 04
// Feb. 22, 2016
// CSE 02 
//The purpose of this program is to take three values for RGB in decimal and convert them to hexidecimal values


import java.util.Scanner; // Scanner is in the java.util package
    
public class ToHex {
// main method required for every Java program
   
   	public static void main(String[] args) 
   	{
   	  //create scanner item
   	  Scanner input = new Scanner( System.in );
      //prompt user to enter three inputs 
      System.out.print("Enter three decimal RGB numbers: ");
      
      //accept next three inputs at ints 
      int num1 =input.nextInt();   
      int num2 =input.nextInt();
      int num3 =input.nextInt();
      
      
      //create variables 
      int rem1;
      int rem2;
      int rem3;
      
      int newnum1;
      int newnum2;
      int newnum3;
      
      String hex1 = "";
      String hex2 = "";
      String hex3 = "";
      
      // make sure values inputed are within range 
      if (num1 >= 0 && num1 <= 255)
      {
        //divide by 16 to 
        newnum1 = num1/16;
        //find remainder 
        rem1 = num1%16;
        //convert values to strings 
        String hexrem1 = Integer.toString(rem1);
        String hexnum1 = Integer.toString(newnum1);
        
        //convert new values found by dividing by 16 to hex characters 
        if (hexrem1.equals("10")) 
        {
            hexrem1 = "A";
        }
        if (hexrem1.equals ("11")) 
        {
            hexrem1 = "B";
        }
        if (hexrem1.equals("12")) 
        {
            hexrem1 ="C";
        }
        if (hexrem1.equals("13")) 
        {
            hexrem1 ="D";
        }
        if (hexrem1.equals("14")) 
        {
            hexrem1 ="E";
        }
        if (hexrem1.equals("15")) 
        {
            hexrem1 ="F";
        }
        //store the hex value (combo of product and rem)
        hex1 = hexnum1 + hexrem1;
      }
      
      //repeat for other two values 
        if (num1 >= 0 && num1 <= 255)
      {
        rem2 = num2%16;
        newnum2 = num2/16;
        String hexrem2 = "" + rem2;
        String hexnum2 = "" + newnum2;
        
        if (hexrem2.equals("10")) 
        {
            hexrem2 = "A";
        }
        if (hexrem2.equals ("11")) 
        {
            hexrem2 = "B";
        }
        if (hexrem2.equals("12")) 
        {
            hexrem2 ="C";
        }
        if (hexrem2.equals("13")) 
        {
            hexrem2 ="D";
        }
        if (hexrem2.equals("14")) 
        {
            hexrem2 ="E";
        }
        if (hexrem2.equals("15")) 
        {
            hexrem2 ="F";
        }
        
        hex2 = hexnum2 + hexrem2;
      }
      
      if (num1 >= 0 && num1 <= 255)
      {
        rem3 = num3%16;
        newnum3 = num3/16;
        String hexrem3 = "" + rem3;
        String hexnum3 = "" + newnum3;
        
        if (hexrem3.equals("10")) 
        {
            hexrem3 = "A";
        }
        if (hexrem3.equals ("11")) 
        {
            hexrem3 = "B";
        }
        if (hexrem3.equals("12")) 
        {
            hexrem3 ="C";
        }
        if (hexrem3.equals("13")) 
        {
            hexrem3 ="D";
        }
        if (hexrem3.equals("14")) 
        {
            hexrem3 ="E";
        }
        if (hexrem3.equals("15")) 
        {
            hexrem3 ="F";
        }
        
        hex3 = hexnum3 + hexrem3;
      }
      
      //print converted value
       System.out.println("The decimal numbers R: " + num1 + " G: " + num2 + " B: " +num3+ ", is represented in hexidecimal as " + hex1 + hex2 + hex3 + "." );
        
            
            
        
   	
   	}
 }