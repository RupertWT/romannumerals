package com.rupert.learning.romannumerals;

public class toRomanNumerals {
	
	public String toRomanNumeralsTransformer( int arabicNumbers ) {
		
		String Answer = "";
		
		for (int i = 1; i <= arabicNumbers; i++) {
			Answer += "I";
		}
		
		return Answer;
    	
    }

}
