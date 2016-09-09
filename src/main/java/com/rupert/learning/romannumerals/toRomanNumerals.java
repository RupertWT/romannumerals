package com.rupert.learning.romannumerals;

public class toRomanNumerals {
	
	public String toRomanNumeralsTransformer( int arabicNumbers ) {
		
		String Answer = "";
		
		if (arabicNumbers > 3 && arabicNumbers % 5 <= 1) {
			if (arabicNumbers == 5) {
				Answer += "V";
			}
			if (arabicNumbers - 5 < 0) {
				return Answer + "I"; 
			}
			return "I" + Answer;
			
		}
				
		for (int i = 1; i <= arabicNumbers; i++) {
			Answer += "I";
		}
				
		return Answer;		
	   	
    }

}
