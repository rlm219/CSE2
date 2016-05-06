//Rachel McCoog
//Lab 11

import java.util.*;

public class lab12{
    
    public static void sorter(int[] arr) {
        int i, j, minIndex, tmp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            if (minIndex != i) {
                  tmp = arr[i];
                  arr[i] = arr[minIndex];
                  arr[minIndex] = tmp;
            }
        }
    }
    
    public static void floater(int[][] arr){
        int i, j, minIndex;
        int[] tmp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (arr[j].length < arr[minIndex].length)
                    minIndex = j;
            if (minIndex != i) {
                  tmp = arr[i];
                  arr[i] = arr[minIndex];
                  arr[minIndex] = tmp;
            }
        }    
    }
    
    
    public static void main(String[] args){
        int [][] multi; 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the main array: ");
        int n = 0;
        n = input.nextInt();
        multi = new int [n][];
        Random randomGenerator = new Random();
        
        for(int i = 0; i<n; i++){
            multi[i] = new int [1+randomGenerator.nextInt(n)];
        }
        for(int i = 0; i<multi.length; i++){
            if(multi[i].length!=1){
                for(int j = 0; j<multi[i].length; j++){
                    multi[i][j] = 1+randomGenerator.nextInt(20);
                }
            }
        }
        //print unsorted
        System.out.println("Here is your unsorted array: ");
        for(int i = 0; i<multi.length; i++){
            for(int j = 0; j<multi[i].length; j++){
                System.out.print(multi[i][j]+" ");
            }
            System.out.println("");
        }
        
        //sort multi
        //int[] sortedArray = sorter(multi);
        
        //print sorted array 
        for(int i = 0; i<multi.length; i++){
            sorter(multi[i]);  
        }
        System.out.println("Here is your sorted array: ");
        for(int i = 0; i<multi.length; i++){
            for(int j = 0; j<multi[i].length; j++){
                System.out.print(multi[i][j]+" ");
            }
            System.out.println("");
        }
        
        floater(multi);
        System.out.println("Here is your floated array: ");
        for(int i = 0; i<multi.length; i++){
            for(int j = 0; j<multi[i].length; j++){
                System.out.print(multi[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("What number would you like to search for?");
        int userInput = 0;
        userInput = input.nextInt();
        for(int i = 0; i<multi.length; i++){
            for(int j = 0; j<multi[i].length; j++){
                if(multi[i][j] == userInput){
                System.out.print("Column "+i+" Row "+j);
                }
            }
            System.out.println("");
        }
    }
    
}