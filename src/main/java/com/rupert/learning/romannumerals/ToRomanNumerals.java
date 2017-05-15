package com.rupert.learning.romannumerals;

public class ToRomanNumerals {
	
	public String toRomanNumeralsTransformer( int decimalNumbers ) {
		
		String resultInRomanNumerals = "";

		int[] knownRomanNumeralValues = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		
		for (int i = 0; i < knownRomanNumeralValues.length; i++) {
			
			int nextKnownRomanNumeralValue = knownRomanNumeralValues[i];
			
			for (int j = decimalNumbers; j >= nextKnownRomanNumeralValue; j -= nextKnownRomanNumeralValue) {
				
				resultInRomanNumerals += RomanNumeralsDictionary.decimalToRoman(nextKnownRomanNumeralValue);
				decimalNumbers -= nextKnownRomanNumeralValue;
			
			}
			
		}

	   	return resultInRomanNumerals;
    }

}