/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//Hello World Java Program 
//
//  first compile the program 
//      javac HelloWorld.java
//  run the program
//      java HelloWorld//
import java.util.*;
//  define a class
public class HelloWorld{
    
//  add main method

public static int B(int y){
    y += 3;
	return y;
}

public static int A(int x){
	x -= 2 * B(x);
	return x;
}

public static void main( String args[] ){
	int i = 1;
	for( i = 0; i < 4; i++ ){
		System.out.println( "val: " + A(i) ); 
	}
}


    

}

