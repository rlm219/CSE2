//////////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//Homework 12
/*This program prompts the user to enter 15 ints for students final 
grades in CSE2. The program makes sure that the user only enters ints
amd prints an error message if something that is not an int is entered,
if something that isn't an int ranging from 0-100 is entered, or if the
int entered is not greater than or equal to the last int entered. Once
all fifteen ints are gathered, the program prints the input array. Then,
the program prompts the user to enter a grade to be searched for. The 
program uses linear search to find the enetered grade. The program then
prints whether or not the number was found and prints the number of
iterations it used. Then is scambles the sorted array randomly and then
prints out the scrambeled array. The user is then prompted to enter an
int to be searched for and then the program uses linear search to find 
the grade. It then prints if the grade was found or not and how many
iterations it used. */

import java.util.*;

public class CSE2Linear{
    public static void main(String[] args){
        int[] grades;
        grades = new int[15];
        Scanner input = new Scanner(System.in);
        int[] a;
        a = new int[15];
        boolean goodInput = false;
        System.out.println("Enter the final grades for CSE2");
        while(!goodInput){
            for(int i = 0; i < grades.length; i ++){
                if(input.hasNextInt()){
                    a[i] = input.nextInt();
                    if(a[i]>=0 && a[i]<=100){
                        if (i==0){
                            grades[i]=a[i];
                            goodInput = true;
                        }
                        else if(i>0 && a[i]>a[i-1]){
                            grades[i] = a[i];
                            goodInput = true;
                        }
                        else{
                            System.out.println("Please enter an integer greater than the last");
                            input.next();
                        }
                    }
                    else{
                        System.out.println("Please enter an integer between 0 and 100");
                        i --;
                    }
                }
                else{
                    System.out.println("Please enter an integer: ");
                    input.next();
                }
            }
        }
        //print grades
        for(int j = 0; j<15; j++){
            System.out.print(grades[j]+" ");
        }
        
        Arrays.sort(grades);
        System.out.println("");
        //print sorted
        for(int j=0; j<15; j++){
            System.out.print(grades[j]+" ");
        }
        System.out.println("");
        System.out.println("Enter a grade to search for: ");
        
            int searchGrade1 = input.nextInt();
       
            for(int i=0; i<grades.length; i++){
                if (searchGrade1 == grades[i]){
                    System.out.println("Grade was found.");
                    System.out.println("This took " +i+ " iterations.");
                    break;
                }
                else if(i==14){
                    System.out.println("Grade was not found after 15 iterations.");
                }
                    
            }
        //print scrambled
        for(int j = 0; j<15; j++){
            int scramble =(int)(Math.random()*15);
            int temporary = grades[j];
            grades[j] = grades[scramble];
            grades[scramble] = temporary; 
        }
        System.out.println("");
        for(int j = 0; j<15; j++){
            System.out.print(grades[j]+" ");
        }
        System.out.println("");
        System.out.println("Enter a grade to search for: ");
        
            int searchGrade = input.nextInt();
       
            for(int i =0; i<grades.length; i++){
                if (searchGrade == grades[i]){
                    System.out.println("Grade was found.");
                    System.out.println("This took " +i+ " iterations.");
                    break;
                }
                else if(i==14){
                    System.out.println("Grade was not found after 15 iterations.");
                }
                    
            }
    }
}