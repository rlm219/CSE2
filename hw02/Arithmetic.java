//////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//Cyclometer Java Program 
// Feb. 7, 2016
// CSE 02 
// The purpose of this program is to compute the cost of items bought
// plus sales tax.
public class Arithmetic {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    //Number of pairs of pants
        int numPants = 3;
        //Cost per pair of pants
        double pantsPrice = 34.98;

        //Number of sweatshirts
        int numShirts = 2;
        //Cost per shirt
        double shirtPrice = 24.99;

        //Number of belts
        int numBelts = 1;
        //cost per box of envelopes
        double beltPrice = 33.99;

        //the tax rate
        double paSalesTax = 0.06;
        
        double totalCostOfPants; //price of pants times number of pants bought 
        double totalCostOfShirts; //price of shirts times number of shirts bought
        double totalCostOfBelts; //price of belts times number of belts bought
        double salesTaxChargedOnPants; //cost of pants times sales tax
        double salesTaxChargedOnShirts; //cost of shirts times sales tax
        double salesTaxChargedOnBelts; //cost of belts times sales tax
        double totalCostBeforeTax; //cost of all items combined without tax
        double totalSalesTax; //cost of all the sales tax on items combined
        double totalCostWithTax; //cost of all items and all sales tax combined
        double twoDecSalesTaxChargedOnPants;
        double twoDecSalesTaxChargedOnShirts;
        double twoDecSalesTaxChargedOnBelts;
        double twoDecTotalSalesTax;
        double twoDecTotalCostWithTax;
        double finalSalesTaxChargedOnPants;
        double finalSalesTaxChargedOnShirts;
        double finalSalesTaxChargedOnBelts;
        double finalTotalSalesTax;
        double finalTotalCostWithTax;
        
        
        //defining the values 
        totalCostOfPants=numPants*pantsPrice;
        totalCostOfShirts=numShirts*shirtPrice;
        totalCostOfBelts=numBelts*beltPrice;
        salesTaxChargedOnPants=totalCostOfPants*paSalesTax;
        salesTaxChargedOnShirts=totalCostOfShirts*paSalesTax;
        salesTaxChargedOnBelts=totalCostOfBelts*paSalesTax;
        totalCostBeforeTax=totalCostOfPants+totalCostOfShirts+totalCostOfBelts;
        totalSalesTax=salesTaxChargedOnBelts+salesTaxChargedOnPants+salesTaxChargedOnShirts;
        totalCostWithTax=totalCostBeforeTax+totalSalesTax;
        
        //multiplying answers by 100 (first step to get 2 digits to the right of dec. point)
        twoDecSalesTaxChargedOnPants = salesTaxChargedOnPants*100;
        twoDecSalesTaxChargedOnShirts = salesTaxChargedOnShirts*100;
        twoDecSalesTaxChargedOnBelts = salesTaxChargedOnBelts*100;
        twoDecTotalSalesTax = totalSalesTax*100;
        twoDecTotalCostWithTax = totalCostWithTax*100;
        
        //convert values from doubles to intgers (second step)
        int CleanTwoDecSalesTaxChargedOnPants = (int)twoDecSalesTaxChargedOnPants;
        int CleanTwoDecSalesTaxChargedOnShirts = (int)twoDecSalesTaxChargedOnShirts;
        int CleanTwoDecSalesTaxChargedOnBelts = (int)twoDecSalesTaxChargedOnBelts;
        int CleanTwoDecTotalSalesTax = (int)twoDecTotalSalesTax;
        int CleanTwoDecTotalCostWithTax = (int)twoDecTotalCostWithTax;
        
        //multiply new integers by 100 (last step)
        finalSalesTaxChargedOnPants = CleanTwoDecSalesTaxChargedOnPants/100;
        finalSalesTaxChargedOnShirts = CleanTwoDecSalesTaxChargedOnShirts/100;
        finalSalesTaxChargedOnBelts = CleanTwoDecSalesTaxChargedOnBelts/100;
        finalTotalSalesTax = CleanTwoDecTotalSalesTax/100;
        finalTotalCostWithTax = CleanTwoDecTotalCostWithTax/100;
        
        System.out.println("A pair of pants costs $" +pantsPrice+ " and three pairs are taxed $" +finalSalesTaxChargedOnPants+".");
        System.out.println("A shirt costs $" +shirtPrice+ " and two shirts are taxed $" +finalSalesTaxChargedOnShirts+".");
        System.out.println("A belt costs $" +beltPrice+ " and a belt is taxed $" +finalSalesTaxChargedOnBelts+".");
        System.out.println("The total cost of these items before tax is $" +totalCostBeforeTax+".");
        System.out.println("The total sales tax on these items is $" +finalTotalSalesTax+".");
        System.out.println("The total cost of these items with tax is $" +finalTotalCostWithTax+".");
        
        




	}  //end of main method   
} //end of class
