package com.rupert.learning.romannumerals;

public class toRomanNumerals {
	
	public String toRomanNumeralsTransformer( int arabicNumbers ) {
		
		switch(arabicNumbers) {
			case 5:
				return "V";
			case 4:
				return "IV";
			default:
				String Answer = "";
				
				for (int i = 1; i <= arabicNumbers; i++) {
					Answer += "I";
				}
				
				return Answer;		
		}
	   	
    }

}
