//////////////////////////////////////////////////////////////////////
//Rachel McCoog
//HW 11 
/*the program creates two integer arrays of size 50, array 1 is
filled with random numbers, the program will find the max and min
values of the array and print them; then add increasing random numbers
to array2, have the user enter an int >=0, and exit the program if they
enter an invalid int, use binary search to find the inputed value, 
print wether the value was found or not
*/

import java.util.*;

public class lab11{
    public static void main(String[] args){
        Random randomGenerator = new Random(); 
        
        int[] array1;
        array1 = new int[50];
        for (int counter = 0; counter < array1.length; counter++){
            array1[counter] =  1+randomGenerator.nextInt(100); 
        }
        int max1 = 0;
        int min1 = 0;
        max1 = maxLinear(array1);
        min1 = minLinear(array1);
        System.out.println("The maximum of array 1 is: "+max1);
        System.out.println("The minimum of array 1 is: "+min1);
        
        int [] array2;
        array2 = new int[50];
        for (int counter = 0; counter < array2.length; counter ++){
            array2[counter] = increasingRandom();
        }
        int max2 = 0;
        int min2 = 0;
        max2 = maxLinear(array2);
        min2 = minLinear(array2);
        System.out.println("The maximum of array 2 is: "+max2);
        System.out.println("The minimum of array 2 is: "+min2);
        Scanner input = new Scanner(System.in);
        int userAnswer=0;
        int a = 0;
        boolean goodInput = false;
        System.out.print("Enter an int: ");
        while(!goodInput){
            if(input.hasNextInt()){
                a = input.nextInt();
                if(a>=0){
                   userAnswer=a;
                   goodInput = true;
                }
                else{
                    System.out.println("Please enter an int>=0");
                }
            }
            else{
                System.out.println("Please enter an integer: ");
                input.next();
            }
        int found = 0;
        found = binarySearch(array2);
        }
    }
    
    public static int binarySearch(int array2[], int userAnswer) {
        int low = 0;
        int high = array2.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (userAnswer < array2[mid])
                high = mid - 1;
            else if (userAnswer == array2[mid])
                return userAnswer;
            else
                low = mid + 1;
        }
    return -1; // Not found
    }
    
    public static int increasingRandom(){
        Random randomGenerator = new Random();
        int increasing = 0;
        int random = 1 +randomGenerator.nextInt(100);
        increasing = increasing + random;
        return random;
    }
    //find the max value of array 1
    public static int maxLinear(int array1[]) {
        int key = 0;
        for (int i = 0; i < array1.length; i++) {
            
            if (key < array1[i])
                key = array1[i];
        }
        return key;
    }
    //find the min value of array 1 
    public static int minLinear(int array1[]) {
        int key = 100;
        for (int i = 0; i < array1.length; i++) {
            
            if (key > array1[i])
                key = array1[i];
        }
        return key;
    }

}
    


