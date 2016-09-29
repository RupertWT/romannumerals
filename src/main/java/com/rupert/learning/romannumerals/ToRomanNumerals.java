package com.rupert.learning.romannumerals;

public class ToRomanNumerals {
	
	public static String toRomanNumeralsTransformer( int decimalNumbers ) {
		
		int[] nextRomanNumeralDictionaryValue = nextRomanNumeralDictionaryValue();
		
		String resultInRomanNumerals = "";
		
		for (int i = 0; i < 13; i++) {
			for (int j = decimalNumbers; j >= nextRomanNumeralDictionaryValue[i]; j -= nextRomanNumeralDictionaryValue[i]) {
				resultInRomanNumerals += RomanNumeralsDictionary.decimalToRoman(nextRomanNumeralDictionaryValue[i]);
				decimalNumbers -= nextRomanNumeralDictionaryValue[i];
			}
		}

	   	return resultInRomanNumerals;
    }

	private static int[] nextRomanNumeralDictionaryValue() {
		int[] equivalentValue = new int[13];
			
			equivalentValue[0] = 1000;
			equivalentValue[1] = 900;
			equivalentValue[2] = 500;
			equivalentValue[3] = 400;
			equivalentValue[4] = 100;
			equivalentValue[5] = 90;
			equivalentValue[6] = 50;
			equivalentValue[7] = 40;
			equivalentValue[8] = 10;
			equivalentValue[9] = 9;
			equivalentValue[10] = 5;
			equivalentValue[11] = 4;
			equivalentValue[12] = 1;
			
		return equivalentValue;
	}

}

















