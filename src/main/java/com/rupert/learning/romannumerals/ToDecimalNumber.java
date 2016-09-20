package com.rupert.learning.romannumerals;

public class ToDecimalNumber {
	
	public static int toDecimalNumberTransformer( String romanNumerals ) {
		
		int resultInDecimals = 0;
				
    	for (int i = 0; i < romanNumerals.length(); i++) {
    		
    		int firstNumber = 0;
    		int secondNumber = 0;
    		
    		if (lastCharacterInRomanNumeralsString(romanNumerals, i)) {	    		
    			firstNumber = RomanNumeralsDictionary.romanToDecimal(romanNumerals.substring(i));   
    		} else { 			
    			firstNumber = RomanNumeralsDictionary.romanToDecimal(romanNumerals.substring(i, i+1));
	    		secondNumber = RomanNumeralsDictionary.romanToDecimal(romanNumerals.substring(i+1, i+2));    	
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
