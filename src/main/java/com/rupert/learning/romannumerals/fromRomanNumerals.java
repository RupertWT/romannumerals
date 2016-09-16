package com.rupert.learning.romannumerals;

public class fromRomanNumerals {
	
	public static int fromRomanNumeralsTransformer( String RomanNumerals ) {
		
		int Answer = 0;
				
    	for (int i = 0; i < RomanNumerals.length(); i++) {
    		
    		int firstNumber = 0;
    		int secondNumber = 0;
    		
    		if (lastCharacterInRomanNumeralsString(RomanNumerals, i)) {	    		
    			firstNumber = lookup.romanToDecimal(RomanNumerals.substring(i));   
    		} else { 			
    			firstNumber = lookup.romanToDecimal(RomanNumerals.substring(i, i+1));
	    		secondNumber = lookup.romanToDecimal(RomanNumerals.substring(i+1, i+2));    	
	    	}
	    	
	    	if (firstNumber < secondNumber) {			  		
	    		Answer += (secondNumber - firstNumber);	
	    		i++;
	    	} else {
	    		Answer += firstNumber;
	    	}
   			
    	}
 
    	return Answer;
    	
    }

	private static boolean lastCharacterInRomanNumeralsString(String RomanNumerals, int i) {
		return i >= RomanNumerals.length()-1;
	}
	
}
