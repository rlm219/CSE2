//////////////////////////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//
/* This program will create an array of random size (5-10) named students
it will then ask the user to fill the array with strings using scanner, then 
a second array named midterm with the same size as students array will collect
random integers from 0 to 100 using math.random. Lastly the program will print
out the names and grades.
*/

import java.util.*;

public class lab10{
    public static void main(String[] args){
        //create random object
        Random randomGenerator = new Random();
        //generate random ints from 5-10
        int random = 5+randomGenerator.nextInt(5);
        //declare array 
        String[] students;
        //allocate space for array
        students = new String[random];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter " +random+ " student names:"); 
        for(int counter = 0; counter < students.length; counter++){
            students[counter] = input.next();
        }
        
        //declare second array
        int[] midterm;
        //allocate space for array
        midterm = new int[random];
        for(int counter = 0; counter <midterm.length; counter ++){
            int exam = 1+randomGenerator.nextInt(100);
            midterm[counter] = exam;
        }
        System.out.println("Here are the midterm grades of the " +random+ " students above:");
        
        for(int counter = 0; counter < midterm.length; counter ++){
            System.out.println(students[counter]+" : "+midterm[counter]);  
        }
        
        
        
    }
}