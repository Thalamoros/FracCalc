package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	
    	
    
    	Scanner scan = new Scanner(System.in); 
    	System.out.println("Fractions"); 
    	String input = scan.nextLine(); 
    	
    }
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    static String numerator = "";
    static String denom = "";
    static String whole = "";
  
    
    public static String[] splitFraction (String input)
   { 	
	  
	   if(input.contains("_")){
	 numerator = input.substring(input.lastIndexOf("/")-1);
	 whole = input.substring(input.lastIndexOf("_")-1);
	 denom = input.substring(input.lastIndexOf("/")+1);
	   } else {
		   if(input.contains("/")){
			   whole = "0";
			   numerator = input.substring(input.lastIndexOf("/")-1);
			   denom = input.substring(input.lastIndexOf("/")+1);
					   
		   } else {
		   whole = input;
		   numerator = "0";
		   denom = "1";
		   
		   } 
		   
	 }
		   
	String[] values = new String[3];
	values[0] = whole;
	values[1] = denom;
	values[2] = numerator;
	return values;
   }
    public static String produceAnswer(String input)
    { 
    	
    	System.out.println(produceAnswer(input)); 

    	
    	String denom = input.substring(input.lastIndexOf("/")+1);
    	String whole = input.substring(input.lastIndexOf("_"));
    	String numerator = input.substring(input.lastIndexOf("/")-1);
    	
     /*  String secfrac = scanned.substring(scanned.lastIndexOf(" ")+1);
    	String first= scanned.substring(0,secfrac.indexOf("_"));
    	String deno minator = scanned.substring(1,secfrac.lastIndexOf() );*/

    	String[] values = new String[3];
    	values[0] = whole;
    	values[1] = denom;
    	values[2] = numerator;
    	String[] answers = {whole,numerator ,denom};
        // TODO: Implement this function to produce the solution to the input
        
        return "whole:" + values[0] + "Numerator: " + values[1] + "Denominator: " + values[2];
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    }  
