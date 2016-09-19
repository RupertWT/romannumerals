package com.rupert.learning.romannumerals;

public class FromRomanNumerals {
	
	public static int fromRomanNumeralsTransformer( String romanNumerals ) {
		
		int resultInDecimals = 0;
				
    	for (int i = 0; i < romanNumerals.length(); i++) {
    		
    		int firstNumber = 0;
    		int secondNumber = 0;
    		
    		if (lastCharacterInRomanNumeralsString(romanNumerals, i)) {	    		
    			firstNumber = lookup.romanToDecimal(romanNumerals.substring(i));   
    		} else { 			
    			firstNumber = lookup.romanToDecimal(romanNumerals.substring(i, i+1));
	    		secondNumber = lookup.romanToDecimal(romanNumerals.substring(i+1, i+2));    	
	    	}
	    	
	    	if (firstNumber < secondNumber) {			  		
	    		resultInDecimals += (secondNumber - firstNumber);	
	    		i++;
	    	} else {
	    		resultInDecimals += firstNumber;
	    	}
   			
    	}
 
    	return resultInDecimals;
    	
    }

	private static boolean lastCharacterInRomanNumeralsString(String romanNumerals, int i) {
		return i >= romanNumerals.length()-1;
	}
	
}
