package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	
    	
    
    	Scanner scan = new Scanner(System.in); 
    	System.out.println("Fractions"); 
    	String input = scan.nextLine(); 
    	System.out.println(produceAnswer(input)); 

    }
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
   public static String  splitFraction (String input)
   { 	  	
	String numerator = input.substring(input.lastIndexOf("/")+1);
	String whole = input.substring(input.lastIndexOf("_"));
	String denom= input.substring(input.lastIndexOf("/")-1);
   }
    public static String produceAnswer(String input)
    { 
    	
    	
    	
    	String denom = input.substring(input.lastIndexOf("/")+1);
    	String whole = input.substring(input.lastIndexOf("_"));
    	String numerator = input.substring(input.lastIndexOf("/")-1);
    	
       /* String secfrac = scanned.substring(scanned.lastIndexOf(" ")+1);
    	String first= scanned.substring(0,secfrac.indexOf("_"));
    	String denominator = scanned.substring(1,secfrac.lastIndexOf() );*/

    	
    	String[] answers = {"whole","numerator" ,"denominator"};
        // TODO: Implement this function to produce the solution to the input
        
        return ;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    }  
