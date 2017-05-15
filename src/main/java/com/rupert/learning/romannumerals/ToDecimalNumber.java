package com.rupert.learning.romannumerals;

public class ToDecimalNumber {
	
	public int toDecimalNumberTransformer( String romanNumerals ) {
		
		if (romanNumerals == null) {
			throw new IllegalArgumentException("NULL String not allowed;");
		}
		
		if (romanNumerals.equals("")) {
			throw new IllegalArgumentException("EMPTY String not allowed;");
		}
		
		int resultInDecimals = 0;
				
    	for (int i = 0; i < romanNumerals.length(); i++) {
    		
    		int firstNumber = 0;
    		int secondNumber = 0;
    		
    		if (isLastCharacterInRomanNumeralsString(romanNumerals, i)) {	    		
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

	private boolean isLastCharacterInRomanNumeralsString(String romanNumerals, int i) {
		return i == romanNumerals.length()-1;
	}
	
}
