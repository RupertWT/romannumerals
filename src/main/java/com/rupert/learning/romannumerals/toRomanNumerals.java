package com.rupert.learning.romannumerals;

public class toRomanNumerals {
	
	public String toRomanNumeralsTransformer( int arabicNumbers ) {
		
		String Answer = "";
		
		if (arabicNumbers > 3) {
			Answer += "V";
			if (arabicNumbers - 5 > 0) {
				return Answer + "I"; 
			}
			if (arabicNumbers - 5 < 0) {
				return "I" + Answer; 
			}
			return Answer;
			
		}
				
		for (int i = 1; i <= arabicNumbers; i++) {
			Answer += "I";
		}
				
		return Answer;		
	   	
    }

}
