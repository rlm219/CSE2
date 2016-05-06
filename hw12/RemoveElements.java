//Rachel McCoog
//HW 12
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  /*The randomInput() method generates an array of 10 random integers
  between 0 to 9.  Implement randomInput so that it fills the array 
  with random integers and returns the filled array. */ 
  public static int randomInput(){
  	int[] random;
  	random = new int[10];
  	for(int i=0; i<random.length; i++){
  		int randomNum=(int)(Math.random()*10);
  		random[counter] = randomNum;
  	}
  	return random;
  }
  
  /*The method delete(list,pos) takes, as input, an integer array
  called list and an integer called pos.  It should create a new 
  array that has one member fewer than list, and be composed of all
  of the same members except the member in the position pos. */
  
  //check the pos index to make sure it is not out of bounds on the array
  public static int delete(int[] list, int pos){
  	int[] oneLess;
  	oneLess = new int[list.length-1];
  	for(int i = 0; i <oneLess.length; i++){
  		if(!list[pos]){
  			list[i]=oneLess[i];
  		}
  	}
  	return oneLess;
  }
  	
  
  /*Method remove(list,target) deletes all the elements that are equal
  to target, returning a new list without all those new elements. */
  public static int remove(int [] list,int target){
  	int counter = 0;
  	int remove[];
  	for(int i=0; i<list.length; i++){
  		if(list[i]=target){
  			counter++;
  		}
  	}
  	
  	remove = new int[list.length-counter];
  	
  	for(int i=0; i<list.length; i++){
  		if(!list[i]=target){
  			list[i] = remove[i];
  		}
  	}
  	return remove;
  }


  
}
