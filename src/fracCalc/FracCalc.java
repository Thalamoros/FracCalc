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
    
    static String numerator = "";
    static String denom = "";
    static String whole = "";
   
   static String[] frac1 = new String [3];
   static String[] frac2 = new String [3];
   static String[] values = new String[3];
   
    public static String[] splitFraction (String input)
   { 	
	  
	   if(input.contains("_")){
	 numerator = input.substring(input.indexOf("_")+ 1, input.indexOf("/"));
	 whole = input.substring(0,input.indexOf("_"));
	 denom = input.substring(input.indexOf("/")+ 1);
	   } else {
		   if(input.contains("/")){
			   whole = "0";
			   numerator = input.substring(input.indexOf("_")+ 1, input.indexOf("/"));
			   denom = input.substring(input.indexOf("/")+ 1);   
		   } else {
		   whole = input;
		   numerator = "0";
		   denom = "1";
		   
		   } 
		   
	 }
		   
	String[] values = new String[3];
	values[0] = whole;
	values[1] = numerator;
	values[2] = denom;
	
	return values;
   
   
   }
   
    
    public static String produceAnswer(String input)
    { 
    	
    	

    	String[] fractions = input.split(" ");
    	
        values = splitFraction(fractions[0]);
    	frac1[0] = values[0];
    	frac1[1] = values[1];
    	frac1[2] = values[2];
    	
    	 values = splitFraction(fractions[1]);
     	String Operator = values[0];
     	
    	
    	 values = splitFraction(fractions[2]);
     	frac2[0] = values[0];
     	frac2[1] = values[1];
     	frac2[2] = values[2];
 	
     /*  String secfrac = scanned.substring(scanned.lastIndexOf(" ")+1);
    	String first= scanned.substring(0,secfrac.indexOf("_"));
    	String deno minator = scanned.substring(1,secfrac.lastIndexOf() );*/

    	String[] values = new String[3];
    	values[0] = whole;
    	values[1] = denom;
    	values[2] = numerator;
    	String[] answers = {whole,numerator ,denom};
        // TODO: Implement this function to produce the solution to the input
        System.out.println("whole1: " + frac1[0] + " " + "Numerator1: " + frac1[1] + " " + "Denominator1: " + frac1[2] + "\n" + "whole2: " + frac2[0] + " " + "Numerator2: " + frac2[1] + " " + "Denominator2: " + frac2[2]);
        return "whole:" + frac2[0] + " " + "numerator:" + frac2[1] + " " + "denominator:" + frac2[2];
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    }  
