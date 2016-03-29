/*Rachel McCoog
Lab 09 Games
CSE 02

This program will first as the user to enter the name of the game
they would like to play and will only accept the names of the three
games it offers.
*/

import java.util.Scanner; // Scanner is in the java.util package
import java.util.Random; //import Random class into program

public class Games{
    
    //method for first game
    public static void guessTheBox (){
        // create the random object
        Random randomGenerator = new Random();
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        //this statement generates 3 random ints
        int randomInt = 1 + randomGenerator.nextInt(3); 
        System.out.println("One of three boxes has a prize in it choose a box 1-3 to see if you win: ");
        int userNumber = input.nextInt();
        if(userNumber == randomInt){
            System.out.println("Congratulations! You chose the box with the prize. You win a puppy!!!");
         }
        else{
            System.out.println("Sorry, you lost.");
        }
    }
    
    //method for second game 
    public static void spinTheWheel (){
         // create the random object
        Random randomGenerator = new Random();
       int randomInt = 1 + randomGenerator.nextInt(10);
       String prize = "";
       switch(randomInt){
           case 1:
               prize = "Red 1";
           case 2:
               prize = "Red 2";
           case 3:
               prize = "Red 3" ;
           case 4:
               prize = "Red 4";
           case 5:
               prize = "Red 5";
           case 6:
               prize = "Black 1";
           case 7:
               prize = "Black 2";
           case 8:
               prize = "Black 3"; 
           case 9:
               prize = "Black 4";
           case 10:
               prize = "Black 5";
       }
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        int userNum = 0;
        // check to make sure the entered value is the wanted integer
      
        int a = 0;
        boolean goodInput1= false;
      
        System.out.println("Number must be an integer 1-5 , enter a valid number: ");
        while (!goodInput1){
            if (input.hasNextInt()){
                a = input.nextInt();
                if(a>0 && a<6){
                    userNum = a;
                    goodInput1  = true;
                }
                else{
                    System.out.println("Please enter a integer 1-5: ");
                }
            }
                else {
                    System.out.println("Please enter integer: ");
                    input.next();
            }
        }
        String userColor = "";
           // check to make sure the entered value is an integer
      
        String b = "";
        boolean goodInput2= false;
      
        System.out.println("Color must be black or red, enter color ");
        while (!goodInput2){
            b = input.next();
            if (b.equals("Black")||b.equals("black")||b.equals("Red")||b.equals("red")){
                userColor= b;
                goodInput2= true;
                }
            else{
                    System.out.println("Please enter a valid color");
                    input.next();
                }
            }
        String user =  userColor + " "+ userNum;
        if (user.equals(prize)){
            System.out.println("Congratulations you spun"+prize);
        }
        else{
            System.out.println("You lost, the correct spin was " +prize);
        }
    
    }
    
    //method for third game
    public static void scrambler (){
        System.out.println("Enter a word to be scrambled");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int length = word.length();
        int counter = 0;
        String a = "";
        String b = "";
         // create the random object
        Random randomGenerator = new Random();
        while (length*4 > counter){
            int randomInt = randomGenerator.nextInt(length);
            a = word.substring(0,randomInt);
            b = word.substring(randomInt,length);
            word = b+a;
            counter++;
            
        }
        System.out.println(word);
    }
    
    //main method
    public static void main(String[] args){
        System.out.println("Welcome to McCoog game center!");
        
        Scanner input = new Scanner(System.in);
        
        String game = "";
        
        String a = "";
        boolean goodInput = false;
        
        System.out.println("Please choose one of the three game options (guessTheBox, spinTheWheel, or scrambler) by typing the game name: ");
        while(!goodInput){
            if(input.hasNext("guessTheBox")){
                game = a;
                goodInput = true;
                guessTheBox();
            }
            else if(input.hasNext("spinTheWheel")){
                game = a;
                goodInput = true;
                spinTheWheel();
            }
            else if(input.hasNext("scrambler")){
                game = a;
                goodInput = true;
                scrambler();
            }
            else{
                System.out.println("Sorry -- McCoog game center does not carry that game");
                break;
            }
            
        }
        
        
    }
}