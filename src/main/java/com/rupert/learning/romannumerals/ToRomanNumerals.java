package com.rupert.learning.romannumerals;

public class ToRomanNumerals {
	
	public static String toRomanNumeralsTransformer( int decimalNumbers ) {
		
		int[] knownRomanNumeralDictionaryValues = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		
		String resultInRomanNumerals = "";
		
		for (int i = 0; i < knownRomanNumeralDictionaryValues.length; i++) {
			
			int nextRomanNumeralDictionaryValue = knownRomanNumeralDictionaryValues[i];
			
			for (int j = decimalNumbers; j >= nextRomanNumeralDictionaryValue; j -= nextRomanNumeralDictionaryValue) {
				
				resultInRomanNumerals += RomanNumeralsDictionary.decimalToRoman(nextRomanNumeralDictionaryValue);
				decimalNumbers -= nextRomanNumeralDictionaryValue;
			
			}
			
		}

	   	return resultInRomanNumerals;
    }

}

















