////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//Lab 09
//
/* this program will use 4 different methods that correspond to four 
sentence component categories, each method will generate a random
integer from 0 to 9, select a random sentence component and return the
word as a string */

import java.util.*; //import Random class into program

//define a class 
public class lab09{
    
    public static String adjectives (){
         // create the random object
         Random randomGenerator = new Random(); 
         //this statement generates random ints less than 10
         int randomInt = 1+randomGenerator.nextInt(9);   
         
         String adj = "";
         // use switch statement to decide which word to return
         switch(randomInt){
             case 1:
                 adj = "angry";
                 break;
            case 2:
                adj = "pretty";
                break;
            case 3:
                adj = "funny";
                break;
            case 4:
                adj = "fast";
                break;
            case 5:
                adj = "calm";
                break;
            case 6:
                adj = "powerful";
                break;
            case 7:
                adj = "silly";
                break;
            case 8:
                adj = "big";
                break;
            case 9:
                adj = "grumpy";
                break;
         }
         return adj; //return the adj to the main method
    }
   
    public static String subjectNoun ( ){
         // create the random object
         Random randomGenerator = new Random(); 
         //this statement generates random ints less than 10
         int randomInt = 1 + randomGenerator.nextInt(9);   
         
         String sub = "";
         // use switch statement to decide which word to return
         switch(randomInt){
             case 1:
                 sub = "house";
                 break;
            case 2:
                sub = "cat";
                break;
            case 3:
                sub = "dog";
                break;
            case 4:
                sub = "fish";
                break;
            case 5:
                sub = "school";
                break;
            case 6:
                sub = "elephant";
                break;
            case 7:
                sub = "monkey";
                break;
            case 8:
                sub = "girl";
                break;
            case 9:
                sub = "boy";
                break;
         }
         return sub; //return the adj to the main method
    }
    
    public static String pastVerb (){
         // create the random object
         Random randomGenerator = new Random(); 
         //this statement generates random ints less that 10
         int randomInt = 1 + randomGenerator.nextInt(9);   
         
         String verb = "";
         // use switch statement to decide which word to return
         switch(randomInt){
            case 1:
                 verb = "jumped";
                 break;
            case 2:
                verb = "ran";
                break;
            case 3:
                verb = "walked";
                break;
            case 4:
                verb = "jogged";
                break;
            case 5:
                verb = "hugged";
                break;
            case 6:
                verb = "loved";
                break;
            case 7:
                verb = "hated";
                break;
            case 8:
                verb = "helped";
                break;
            case 9:
                verb = "smacked";
                break;
         }
         return verb; //return the adj to the main method
    }
     
     public static String objectNoun (){
         // create the random object
         Random randomGenerator = new Random(); 
         //this statement generates random ints less that 10
         int randomInt = 1 + randomGenerator.nextInt(9);   
         
         String ob = "";
         // use switch statement to decide which word to return
         switch(randomInt){
             case 1:
                 ob = "rat";
                 break;
            case 2:
                ob = "infant";
                break;
            case 3:
                ob = "pickle";
                break;
            case 4:
                ob = "pencil";
                break;
            case 5:
                ob = "panda";
                break;
            case 6:
                ob = "banana";
                break;
            case 7:
                ob = "avocado";
                break;
            case 8:
                ob = "cake";
                break;
            case 9:
                ob = "horse";
                break;
         }
         return ob; //return the adj to the main method
    }
    public static void main(String[] args){ //add main method
        //declare an instance of the word in this method
        String adj = "";
        //call the value of this method generated in other method
        adj = adjectives();
        String sub = "";
        sub = subjectNoun();
        String verb = "";
        verb = pastVerb();
        String ob = "";
        ob = objectNoun();
        //print the statement
        System.out.println("The "+ adj +" "+ sub + " " + verb + " the " + ob + ".");
        
        //ask if user wants another sentence, if yes -- run again, if not exit
        System.out.println("Would you like another sentence? (Yes or No)");
        Scanner input = new Scanner(System.in);
        String userAnswer = input.next();
        while(userAnswer.equals("Yes"){
           //print the statement
            System.out.println("The "+ adj +" "+ sub + " " + verb + " the " + ob + ".");  
        }
    }
}