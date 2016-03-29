/*Rachel McCoog
Hw09 Rectangle

This program uses overloading methods to create rectangles based on the 
number of characters in a string -- using for loops to create the rectangles
*/

import java.util.Scanner; // Scanner is in the java.util package

public class Rectangularize{
    public static void Rectangle (int forMain){
        for (int a=0; a < forMain; a++){
            for(int b=0; b<forMain; b++){
                System.out.print("%");
            }
            System.out.println("");
        }
    }

    public static void Rectangle(String forMain){
        for(int a=0; a < forMain.length(); a++){
            System.out.println(forMain);
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or an integer to rectangularize");
        if(input.hasNextInt()){
            int userNumber = input.nextInt();
            Rectangle(userNumber);
        }
        else{
            String userString = input.next();
            Rectangle(userString);
        }
        
    }
}