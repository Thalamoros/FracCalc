package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner scan = new Scanner(System.in); 
    	System.out.println("Fractions"); 
    	String scanned = scan.nextLine(); 
    	System.out.println(produceAnswer(scanned)); 

    }
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String scanned)
    { 
    	/*String part1= "";   joel suggested this method but i did'nt completly understand it
        String part2= "";
        int funtion;
        String num1 = ""; 
        int num1i;  */
    	/*String operator = ""; // found this on line but i don't really know where to go from here
    	    	
    	for (int k=0; k<input.length() ; k++) 
    	{
    		String check1 = input.substring(k,k +1); 
    	if (check1 == "+" || check1 == "-" || check1 == "*" || check1 == "/") 
    	
 					I saw this method online but i just didn't understand how it worked so i didn't
 					bother continueing with this method
    	
    	*/
    	String first = scanned.substring(scanned.lastIndexOf(" ")+1);
    		//after i really read through the read me i realized that it was a lot easier then i was making it

        // TODO: Implement this function to produce the solution to the input
        
        return first;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    }  
