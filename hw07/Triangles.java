/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//HW 07 Triangles
//
/* this program will ask the user for an integer between 5 and 30 
and print three stacks using for, while, and do loops
*/
import java.util.Scanner; // Scanner is in the java.util package


//  define a class
public class Triangles{
    
//  add main method
    public static void main(String[] args) {
    
     //create scanner item
   	  Scanner input = new Scanner( System.in );
      //accept next integer input as length 
      
      
      
      /* check to make sure the entered value is
      a positive integer between 5 and 30.
      */
      int stack = 0;
      boolean goodInputLength = false;
      int a = 0;
      System.out.println("Length must be an integer, enter a valid length: ");
      while (!goodInputLength) {
          if (input.hasNextInt()){
            a = input.nextInt();
            if(a>=5 && a<=30){
              stack = a;
              goodInputLength = true;
            }
            else{
              System.out.println("Please enter a positive integer between 5 and 30: ");
            }
          }
          else {
              System.out.println("Please enter integer: ");
              input.next();
          }
        }
    
     //print stack using for statements    
     for(int row=1; row <= (2*stack)-1; row ++){
         if (stack >= row){
            for(int i=0; i<row; i++){
                System.out.print(+row);
            }
                System.out.println();
         }
         if (stack < row){
            for(int i=0; i<(2*stack)-row ; i++){
                System.out.print(+(2*stack)-row);
            }
                System.out.println();
         }
     }
     
     //print stack using while statements   
     int row = 1;
     int i = 0;
     
     while(row <= (2*stack)-1){
        if (stack >= row){
            while(i<row){
                System.out.print(+row);
                i++;
            }
                System.out.println();
        }
        i = 0; //reset i 
        if (stack < row){
            while(i<(2*stack)-row){
                System.out.print(+(2*stack)-row);
                i++;
            }
                System.out.println();
        }
        i = 0; //reset i
        row++;
     }
     
    row = 1;
    i = 0;
    
    //print stack using do while statements  
     do {
        if (stack >= row){
            do {
                System.out.print(+row);
                i++;
            }while(i<row);
                System.out.println();
        }
        i = 0; //reset i 
        if (stack < row){
            do {
                System.out.print(+(2*stack)-row);
                i++;
            }while(i<(2*stack)-row);
                System.out.println();
        }
        i = 0; //reset i
        row++;
     } while(row <= (2*stack)-1);
     
    }
}