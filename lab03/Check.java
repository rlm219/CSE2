/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//Lab 03 Check Program

   /*This program will uses the Scanner class to obtain from the user
    *the original cost of the check, the percentage tip they wish to pay, 
    *and the number of ways the check will be split. Then it will determine
    how much each person in the group needs to spend in order to pay the check.*/ 
    
    import java.util.Scanner; // Scanner is in the java.util package
    
    public class Check {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    
    	// Create a Scanner object
        Scanner myScanner = new Scanner( System.in );
        
        //prompt user for original check cost
        System.out.print("Enter the original cost of the check in the form xx.xx:");
        
        //accept user input for og check cost
        double checkCost = myScanner.nextDouble();

        //prompt user for tip 
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):");
        
        //accept user input for tip 
        double tipPercent = myScanner.nextDouble();
        
        //We want to convert the percentage into a decimal value
        tipPercent /= 100; 

        //prompt user for number of people dining (number of ways check will be split)
        System.out.print("Enter the number of people who went out to dinner:");
        
        //accept user input for number of people dining
        int numPeople = myScanner.nextInt();

        double totalCost; //iniate variable for total cost 
        double costPerPerson; //iniate variable for cost per person
        int dollars,   //whole dollar amount of cost 
        dimes, pennies; //for storing digits to the right of the decimal point for the cost$ 
       
        totalCost = checkCost * (1 + tipPercent); //define variable total cost
        costPerPerson = totalCost / numPeople; //define variable cost per person
        //get the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson;
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(costPerPerson * 10) % 10; //finding tens place
        pennies=(int)(costPerPerson * 100) % 10; //finding ones place 
        
        //output the results 
        System.out.println("Each person in the group owes $" +dollars+ "." + dimes + pennies );

   	
   		}  //end of main method   
} //end of class
