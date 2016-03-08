/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//HW06 Test Spinner.java
//
//  this program will run an infinite loop of a "spinner"



//  define a class
public class TextSpinner{
    
//  add main method
    public static void main(String[] args) {
        
        int value = 1; 
        
        while(value > 0) {
          System.out.print("/\b");
          System.out.print("-\b");
          System.out.print("\\\b");
          System.out.print("|\b");
          System.out.print("/\b");

          value++;
        }
     

      
      
    
       
    }
}