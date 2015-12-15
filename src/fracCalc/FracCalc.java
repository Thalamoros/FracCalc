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
   static int operation;
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
   public static String[] Calculations()
   {
   
    int[]frac1int = new int[3];
    int[]frac2int = new int[3];
    String[]fracFinalstr = new String[3];
    int[]fracFinal = new int[2];
    int fracWhole = 0;
    int fracNumerator = 0;
    int fracDenom = 0;
    int mixedNumerator1 = 0;
    int mixedNumerator2 = 0;
    int mixedDenom = 0;
    frac1int[0] = Integer.parseInt(frac1[0]);
    frac1int[1] = Integer.parseInt(frac1[1]);
    frac1int[2] = Integer.parseInt(frac1[2]);
    frac2int[0] = Integer.parseInt(frac2[0]);
    frac2int[1] = Integer.parseInt(frac2[1]);
    frac2int[2] = Integer.parseInt(frac2[2]);
    
    
    
    if(operation == 1){  //add
    fracWhole = 0;
    	if(frac1int[2] == frac2int[2]){
    		fracNumerator = frac1int[1] + frac2int[1];
    		fracDenom = frac2int[2];
    		fracWhole = frac1int[0] + frac2int[0];
    		while(Math.abs(fracNumerator) > Math.abs(fracDenom)){
        		fracNumerator = fracNumerator - Math.abs(fracDenom);
        		fracWhole = fracWhole + 1; 
        	     }
    	} else {
    		mixedNumerator1 = (frac1int[1] + (frac1int[0] * frac1int[2]))* frac2int[2];
    		mixedNumerator2 = (frac2int[1] + (frac2int[0] * frac2int[2]))* frac1int[2];
    		mixedDenom = frac1int[2] * frac2int[2];
    		fracNumerator = mixedNumerator1 + mixedNumerator2;
    		fracDenom = mixedDenom;
    		System.out.println(fracDenom);
    		System.out.println(mixedNumerator1);
    		System.out.println(mixedNumerator2);
    	if(fracNumerator < 0 && fracDenom > 0){
    		while(Math.abs(fracNumerator) > Math.abs(fracDenom)){
    			fracNumerator = fracNumerator + Math.abs(fracDenom);
    			fracWhole = fracWhole - 1;
    		}
    	}else{    		
    	while(Math.abs(fracNumerator) > Math.abs(fracDenom)){
    		fracNumerator = fracNumerator - Math.abs(fracDenom);
    		fracWhole = fracWhole + 1; 
    	     }
    	}
    	  
    	}
    		
    		
    		
    		
    		
    }
    
    if(operation == 2){  // subtract
    	fracWhole = 0;
    	if(frac1int[2] == frac2int[2]){
    		fracNumerator = frac1int[1] - frac2int[1];
    		fracDenom = frac2int[2];
    		fracWhole = frac1int[0] - frac2int[0];
    		while(Math.abs(fracNumerator) > Math.abs(fracDenom)){
        		fracNumerator = fracNumerator - Math.abs(fracDenom);
        		fracWhole = fracWhole + 1; 
        	     }
    	} else {
    		mixedNumerator1 = (frac1int[1] + (frac1int[0] * frac1int[2]))* frac2int[2];
    		mixedNumerator2 = (frac2int[1] + (frac2int[0] * frac2int[2]))* frac1int[2];
    		mixedDenom = frac1int[2] * frac2int[2];
    		fracNumerator = mixedNumerator1 -  mixedNumerator2;
    		fracDenom = mixedDenom;
    		System.out.println(fracDenom);
    		System.out.println(mixedNumerator1);
    		System.out.println(mixedNumerator2);
    	if(fracNumerator < 0 && fracDenom > 0){
    		while(Math.abs(fracNumerator) > Math.abs(fracDenom)){
    			fracNumerator = fracNumerator + Math.abs(fracDenom);
    			fracWhole = fracWhole - 1;
    		}
    	} else {    		
    	while(Math.abs(fracNumerator) > Math.abs(fracDenom)){
    		fracNumerator = fracNumerator - Math.abs(fracDenom);
    		fracWhole = fracWhole + 1; 
    	     }
    	   }
    	}	
    }
    
    if(operation == 3){  // multiply
    	fracWhole = 0;
    	if(frac1int[2] == frac2int[2]){
    		fracNumerator = frac1int[1] * frac2int[1];
    		fracDenom = frac1int[2] * frac2int[2];
    		fracWhole = frac1int[0] * frac2int[0];
    		while(Math.abs(fracNumerator) > Math.abs(fracDenom)){
        		fracNumerator = fracNumerator - Math.abs(fracDenom);
        		fracWhole = fracWhole + 1; 
        	     }
    	} else {
    		mixedNumerator1 = (frac1int[1] + (frac1int[0] * frac1int[2]))* frac2int[2];
    		mixedNumerator2 = (frac2int[1] + (frac2int[0] * frac2int[2]))* frac1int[2];
    		mixedDenom = frac1int[2] * frac2int[2];
    		fracNumerator = mixedNumerator1 *  mixedNumerator2;
    		fracDenom = mixedDenom * mixedDenom;
    		System.out.println(fracDenom);
    		System.out.println(mixedNumerator1);
    		System.out.println(mixedNumerator2);
    	if(fracNumerator < 0 && fracDenom > 0){
    		while(Math.abs(fracNumerator) > Math.abs(fracDenom)){
    			fracNumerator = fracNumerator + Math.abs(fracDenom);
    			fracWhole = fracWhole - 1;
    		}
    	} else {    		
    	while(Math.abs(fracNumerator) > Math.abs(fracDenom)){
    		fracNumerator = fracNumerator - Math.abs(fracDenom);
    		fracWhole = fracWhole + 1; 
    	     }
    	   }
    	}
    }
    
    if(operation == 4){  // divide
    	fracWhole = 0; 
    	System.out.println(frac2int[2]); 
    	if(frac1int[2] ==  frac2int[1]){
    		fracNumerator = frac1int[1] * frac2int[2];
    		fracDenom = frac1int[2] * frac2int[1];
    		fracWhole = frac1int[0] * frac2int[0];
    		while(Math.abs(fracNumerator) > Math.abs(fracDenom)){
        		fracNumerator = fracNumerator - Math.abs(fracDenom);
        		fracWhole = fracWhole + 1; 
        	     }
    	} else {
    		mixedNumerator1 = frac1int[1] + (frac1int[0] * frac1int[2]);
    		mixedNumerator2 = frac2int[1] + (frac2int[0] * frac2int[2]);
    		mixedDenom = frac1int[1] * frac2int[2];
    		fracNumerator = mixedNumerator1 *  mixedDenom;
    		fracDenom = mixedDenom * mixedNumerator2;
    		System.out.println(fracDenom);
    		System.out.println(mixedNumerator1);
    		System.out.println(mixedNumerator2);
    	if(fracNumerator < 0 && fracDenom > 0){
    		while(Math.abs(fracNumerator) > Math.abs(fracDenom)) {       
    			fracNumerator = fracNumerator + Math.abs(fracDenom);
    			fracWhole = fracWhole - 1;
    		}
    	} else {    		
    	while(Math.abs(fracNumerator) > Math.abs(fracDenom)){
    		fracNumerator = fracNumerator - Math.abs(fracDenom);
    		fracWhole = fracWhole + 1; 
    	     }
    	   }
    	}
    }
    if(fracDenom != 0){
    fracFinal = Reduce(fracNumerator, fracDenom);
    } else {
    	fracDenom = fracDenom + 1;
    	fracFinal = Reduce(fracNumerator, fracDenom);
    }
    		if (fracFinal[0] == fracFinal[1]){
    			fracWhole = fracWhole + 1;
    			fracFinalstr[0] = "" + fracWhole;
    		}else if(fracWhole == 0 ){
    			fracFinalstr[0] = "0";
    		} else {
    			fracFinalstr[0] = fracWhole + "";
    		}
    if(fracFinal[0] == 0 && fracFinal[1] == 1){
    	fracFinal[1] = 0;
    	
    }
    fracFinalstr[1] = "" + fracFinal[0];
    fracFinalstr[2] = "" + fracFinal[1];
    
    
    return fracFinalstr;
   }
   public static int GCF(int fracNumerator, int fracDenom){
	 System.out.println(fracNumerator);
	 System.out.println(fracDenom);
	   while(fracDenom > 0){
		   int temp = fracDenom;
		   fracDenom = Math.abs(fracNumerator) % fracDenom;
		   fracNumerator = temp;	   
	   }
	   return fracNumerator;
   }
   public static int[] Reduce (int fracNumerator, int fracDenom){
	   
	   int gcf = GCF(fracNumerator, fracDenom);
	   int[] reducedFrac ={fracNumerator/gcf,fracDenom/gcf};	   
	   return reducedFrac;
   }
   
   
    public static String produceAnswer(String input)
    { 
    	String operationType = "";

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
     	if(Operator.contains("+")){
     		operationType = "add";
     		operation = 1;
     	}
     	if(Operator.contains("-")){
     		operationType = "subtract";
     		operation = 2;
     	}
     	if(Operator.contains("*")){
     		operationType = "multiply";
     		operation = 3;
     	}
     	if(Operator.contains("0")){
     		operationType = "divide";
     		operation = 4;
     	}
        System.out.println(operationType); 
        String[] answers = new String[3];
        answers = Calculations();
    	System.out.println(answers[0]);
    	if(answers[1].equals(answers[2])){
    		System.out.print("operationType: " + operationType + "\n" +  "whole1: " + frac1[0] + " " + "Numerator1: " + frac1[1] + " " + "Denominator1: " + frac1[2] + "\n" + "whole2: " + frac2[0] + " " + "Numerator2: " + frac2[1] + " " + "Denominator2: " + frac2[2] + "\n");
    	return answers[0];
    	} else {if (answers[0].equals("0")) {
    		System.out.print("operationType: " + operationType + "\n" +  "whole1: " + frac1[0] + " " + "Numerator1: " + frac1[1] + " " + "Denominator1: " + frac1[2] + "\n" + "whole2: " + frac2[0] + " " + "Numerator2: " + frac2[1] + " " + "Denominator2: " + frac2[2] + "\n");
    	return answers[1] + "/" + answers[2];
    	}else{
    		System.out.print("operationType: " + operationType + "\n" +  "whole1: " + frac1[0] + " " + "Numerator1: " + frac1[1] + " " + "Denominator1: " + frac1[2] + "\n" + "whole2: " + frac2[0] + " " + "Numerator2: " + frac2[1] + " " + "Denominator2: " + frac2[2] + "\n");
    	return answers[0] + "_" + answers[1] + "/" + answers[2];
    	}
    	
    	
        // TODO: Implement this function to produce the solution to the input
    	}
      }
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
      
