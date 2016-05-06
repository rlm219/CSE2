public class practice{ 
 
   
    public static int[] makeZero(int size){
        int[]array1 = new int[size];
        for(int i=0; i<array1.length; i++){
            array1[i]=0;
        }
        return array1;
    }
   
   public static int findLongest(int[][]A){
       int longest = 0;
       for(int i=0; i<A.length; i++){
           if(A[i].length>longest){
               A[i].length = longest;
           }
       }
       return longest;
   }
   
    public static void main(String[] args){
        int x = 12;
        int [][] A = new []
    }
}