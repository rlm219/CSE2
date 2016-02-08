//////////////////////////////////////////////////////////////////////////
//Rachel McCoog
//Cyclometer Java Program 
// Feb. 5, 2016
// CSE 02 
// The purpose of this program is to, when given the time and rotation 
// count for two trips, output the number of minute of each trip,
// then number of counts for each trip, the distance of the trip in miles,
// and the distance of the trips combined.
//
public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
        int secsTrip1=480;  // trip 1 is 480 seconds
       	int secsTrip2=3220;  // trip 2 is 32200 seconds
		int countsTrip1=1561;  //the rotation count for trip 1 is 1561
		int countsTrip2=9037; //the rotation count for trip 2 is 9037
		
		double wheelDiameter=27.0,  //the diameter of the bicycle wheel
  	    PI=3.14159, // the value of pi
  	    feetPerMile=5280,  //the number of feet in a mile
  	    inchesPerFoot=12,   //the number of inches in a foot
  	    secondsPerMinute=60;  //the number of seconds in a minute
	    double distanceTrip1, distanceTrip2,totalDistance;  
	    //above gives the distance of the first trip, second trip, 
	    //and both trips combined
        System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	       System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	    distanceTrip1/=inchesPerFoot*feetPerMile; 
	    // above gives distance of trip 1  in miles
    	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	    totalDistance=distanceTrip1+distanceTrip2;
	    //Print out the output data.
           System.out.println("Trip 1 was "+distanceTrip1+" miles");
	       System.out.println("Trip 2 was "+distanceTrip2+" miles");
	       System.out.println("The total distance was "+totalDistance+" miles");


	}  //end of main method   
} //end of class
