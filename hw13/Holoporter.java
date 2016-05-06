//Rachel McCoog
//HW 13
/*
Let us assume that all objects being tested have random shapes and 
each object is represented by a 3 dimensional ragged array. In this case, each 
element in this ragged array represents a molecule. Just picture the object as
a rubic’s cube except for it is ragged, and each block on the cube as a molecule
in this case. 
*/
import java.util.*;
 /* use the soRandom and the coder functions to fill your 3D array 
 with molecule codes. 
 */
public class Holoporter{
    public static void main(String[] args){
        String [][][]original = soRandom();
        String [][][]container = soRandom();
        //String [][][]frankenstein = frankenstein(container);
        print(original); 
        holoport(original,container);
        sampling(container);
        percentage(original,container);
        //print(frankenstein);
    }
    /*First, create a 3D array with random length.
    For each element in this array, assign a 2D array 
    with random length. For each 2D array, assign a single 
    dimensional array with random length. The array types 
    should all be String. This method does not need any input
    variables and the returned types should be a 3D array 
    (String[][][]). All randomly generated arrays should have 
    random lengths from 1 to 10.
*/
    public static String[][][] soRandom(){
        Random randomGenerator = new Random();
        
        int n1 = 1+randomGenerator.nextInt(10);
        int n2 = 1+randomGenerator.nextInt(10);
        int n3 = 1+randomGenerator.nextInt(10);
        
        String [][][] randomLength;
        randomLength = new String [n1][n2][n3];
        for(int i = 0; i <n1; i++){
            for(int j = 0; j<n2; j++){
                for(int k = 0; k<n3; k++){
                    randomLength[i][j][k] = coder();
                }
            }
        }
        return randomLength; 
    } //end soRandom 
    
    /* In order for researchers to easily track if an object is holoported 
    successfully (all molecules of the object are holoported over), they 
    uniquely identify a molecule with a code in the form of XXYYYY where X is a
    random character from A to Z and Y is a random number from 0 to 9. A sample
    code of a molecule would be AB1234. Make sure no two molecules have the same
    code, since it must operate as a unique identifier.
    */
    public static String coder(){
        Random randomGenerator = new Random();
        char [] randomCharacter = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};  
        char X1 = randomCharacter[randomGenerator.nextInt(26)];
        char X2 = randomCharacter[randomGenerator.nextInt(26)];
        int Y1 = randomGenerator.nextInt(10);
        int Y2 = randomGenerator.nextInt(10);
        int Y3 = randomGenerator.nextInt(10);
        int Y4 = randomGenerator.nextInt(10);
        String code = "" + X1 + X2 + Y1 + Y2 + Y3 + Y4;
        return code; 
    } //end coder
    
    /* The outermost dimension is to be separated by “---”,
    the 2nd dimensions are separated by “ | ”, and elements 
    (codes) are separated by “ , ”. */

    public static void print (String[][][] code){
        for(int i = 0; i<code.length; i++){
            String [][] a = code[i];
            for(int j = 0; j<a.length; j++){
                String [] b = a[j];
                System.out.print("[");
                for(int k = 0; k<b.length; k++){
                    if(k==b.length-1){
                        System.out.print(b[k]);
                    }
                    else{
                        System.out.print(b[k]+",");
                    }
                }
                System.out.print("]");
                if(j!=code[code.length-1].length-1){
                    System.out.print("|");
                }
            }
            if(i!=code.length-1){
            System.out.print("---");
            }
        }
        System.out.println();
    } //end print 
    
    
    public static String[][][] holoport(String[][][] original, String[][][] container){
        for(int i=0; i<container.length; i++){
            if(i<original.length){
                for(int j=0; j<container[i].length; j++){
                   if(j<original[i].length){
                      for(int k =0; k<container[i][j].length; k++){
                          if(k<original[i][j].length){
                              container[i][j][k]=original[i][j][k];
                          }
                          else{
                              container[i][j][k]="$$$$$$";
                          }
                      }
                   }
                    else{
                        for(int k=0; k<container[i][j].length; k++){
                            container[i][j][k] = "$$$$$$";
                        }
                    }
                }
            }
            else{
                for(int j=0; j<container[i].length; j++){
                    for(int k=0; k<container[i][j].length; k++){
                        container[i][j][k] = "$$$$$$";
                    }    
                }
            }
        }
        return container;
    }//end holoport 
    
    /*This function takes in a 3D array and a specified code. If the code is 
    found in the array, print out the location in the format of (x,y,z) where
    x, y, z are the indices on each dimension. If not found, print out “Code not found”.
    The specified code comes from user and make sure the input format is XXYYYY. 
    Ask the user for one valid input. If the format is wrong, keep asking. */

    public static void sampling(String[][][]test){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a code in the form XXYYYY to search for:");
        String key = input.next();
        char x1 = key.charAt(0);
        while(x1<65 || x1>90){
            System.out.println("Invalid code, please reenter: ");
            key = input.next();
            x1 = key.charAt(0);
        }
        char x2 = key.charAt(1);
        while(x2<65 || x2>90){
            System.out.println("Invalid code, please reenter: ");
            while(x1<65 || x1>90){
                System.out.println("Invalid code, please reenter: ");
                key = input.next();
                x2 = key.charAt(1);
            }
        }
        char y1 = key.charAt(2);
        while(y1<48||y1>57){
            System.out.println("Invalid code, please reenter: ");
            key = input.next();
            y1 = key.charAt(2);
        }
        char y2 = key.charAt(3);
        while(y2<48||y2>57){
            System.out.println("Invalid code, please reenter: ");
            key = input.next();
            y2 = key.charAt(3);
        }
        char y3 = key.charAt(4);
        while(y3<48||y3>57){
            System.out.println("Invalid code, please reenter: ");
            key = input.next();
            y3 = key.charAt(4);
        }
        char y4 = key.charAt(5);
        while(y4<48||y4>57){
            System.out.println("Invalid code, please reenter: ");
            key = input.next();
            y4 = key.charAt(5);
        }
        
        boolean wrongInput = false;
        for(int i=0; i<test.length; i++){
            for(int j=0; j<test[i].length; j++){
                for(int k=0; k<test[i][j].length; k++){
                    if(test[i][j][k]==key){
                        System.out.println("Code found at ("+i+","+j+","+","+k+")");
                        wrongInput = false;
                    }
                    else{
                        wrongInput = true;
                    }
                }
            }
        }
        if(wrongInput = true){
            System.out.println("Code not found");    
        }
        
    }//end sampling
    
    /*percentage: This function takes in the original object and the holoported 
    object and prints out a percentage that indicates how completely the 
    holoportation is. If the holoported object has less molecules than the 
    original, print out a negative percentage.  If the holoported object has more
    molecules (including the $$$$$$ ones) than the original, print out a positive
    percentage. See the formula for the percentage calculation below.  This is 
    performed by counting the number of molecules in each array, and then computing
    the value below:
    Number of Molecule Difference / Number of Molecules in Original Object
    Print out the percentage. */

    public static void percentage(String[][][] original, String[][][] container){
    int ogMol = 0;
    for(int i=0; i<original.length; i++){
        for(int j=0; j<original[i].length; j++){
            for(int k=0; k<original[i][j].length; k++){
                ogMol = k;    
            }
        }
    }
    int newMol = 0;
    for(int i=0; i<container.length; i++){
        for(int j=0; j<container[i].length; j++){
            for(int k=0; k<container[i][j].length; k++){
                newMol = k;    
            }
        }
    }
    double percent= (ogMol-newMol/ogMol);
    
    System.out.println("Percentage holoported is:" +percent);
    }//end percentage 
    

    /*public static String[][][] frankenstein(String[][][]container){
        String i, j, k, minIndex, tmp;
        int n = container.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++){
                for(k = j +1; k<n; k++){
                    if (container[j] < container[minIndex]){
                        minIndex = j;
                    }
                if (minIndex != i) {
                    tmp = arr[i];
                    container[i] = container[minIndex];
                    container[minIndex] = tmp;
                }
                }
            }
        }
        String[] tmp2;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++){
                for(k = j+1; k<n; k++){
                    if (container[j].length < container[minIndex].length){
                        minIndex = j;
                    }
                if (minIndex != i) {
                    tmp2 = container[i];
                    container[i] = container[minIndex];
                    container[minIndex] = tmp2;
                }
                }
            }
        } 
    
    return container;
    }//end frankenstein
    */

} //end class 