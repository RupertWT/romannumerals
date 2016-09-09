package com.rupert.learning.romannumerals;

public class toRomanNumerals {
	
	public String toRomanNumeralsTransformer( int decimalNumbers ) {

		if (directRomanNumeralEquivalent(decimalNumbers)) {
			return lookup.decimalToRoman(decimalNumbers);
		}
		
		String Answer = "";

		if (decimalNumbers >= 10 && decimalNumbers % 10 != 0) {
			Answer += "X";
			decimalNumbers -= 10;
		}
		
		if (decimalNumbers >= 5 && decimalNumbers % 5 != 0) {
			Answer += "V";
			decimalNumbers -= 5;
		}
		
		for (int i = 0; i < decimalNumbers; i++) {
			Answer += "I";			
		}
	   	return Answer;
    }

	private boolean directRomanNumeralEquivalent(int decimalNumbers) {
		return lookup.decimalToRoman(decimalNumbers) != null;
	}

}

















