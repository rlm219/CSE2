//Rachel McCoog
//Lab 04 Card Generator
// Feb. 19, 2016
// CSE 02
/*The purpose of this program is to generate a random number and then
create two string variables: one that corresponds to the name of the suit
and another that corresponds to the card identity (Ace, Jack, 6, 4), the
program will use an if statement to assign the suit name and a switch statement
to assignt the card identity. It will then print out the randomly selected card.
*/
import java.util.*;

public class CardGenerator {
    //main method required for every Java program
    public static void main(String[] args) {
        //generate a random number 1 through 52
        int randomNumber = (int) (Math.random() * 52)+1;
        //use modulus function to decide which identity the card is in
        int numSuit = randomNumber%13;
        String suit = new String("");
        
     //use switch statements to decide which identity the card
     switch (numSuit){
         case 1:
         System.out.println ("You picked a Ace");
         break;
         case 2:
         System.out.println ("You picked a two");
         break;
         case 3:
         System.out.println ("You picked a three");
         break;
         case 4:
         System.out.println("You picked a four");
         break;
         case 5:
         System.out.println ("You picked a five");
         break;
         case 6:
         System.out.println ("You picked a six");
         break;
         case 7:
         System.out.println ("You picked a seven");
         break;
         case 8:
         System.out.println ("You picked a eight");
         break;
         case 9:
         System.out.println ("You picked a nine");
         break;
         case 10:
         System.out.println ("You picked a ten");
         break;
         case 11:
         System.out.println ("You picked a Jack");
         break;
         case 12:
         System.out.println ("You picked a Queen");
         break;
         case 13:
         System.out.println ("You picked a King");
         break;
         
     }
     
     
     //use if statements to decide which suit the random number is 
      if (1<=randomNumber && randomNumber<=13){
          System.out.println ("of Diamonds");
      }
      if (14<=randomNumber && randomNumber<=26){
          System.out.println ("of clubs");
      }
      if (27<=randomNumber && randomNumber<=39){
          System.out.println ("of hearts");
      }
      if (40<=randomNumber && randomNumber<=52){
          System.out.println ("of spades");
      }
     
     
     
     
    
     
    }
}