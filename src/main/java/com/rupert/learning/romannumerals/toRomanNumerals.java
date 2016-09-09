package com.rupert.learning.romannumerals;

public class toRomanNumerals {
	
	public String toRomanNumeralsTransformer( int decimalNumbers ) {

		if (lookup.decimalToRoman(decimalNumbers) != null) {
			return lookup.decimalToRoman(decimalNumbers);
		}
		
		String Answer = "";
		
		for (int i = 0; i < decimalNumbers; i++) {
			Answer += "I";			
		}
	   	return Answer;
    }

}

















