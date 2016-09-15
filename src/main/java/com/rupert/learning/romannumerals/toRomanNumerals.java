package com.rupert.learning.romannumerals;

public class toRomanNumerals {
	
	public String toRomanNumeralsTransformer( int decimalNumbers ) {

		String Answer = "";
		
		int[] equivalentValue = new int[7];
		equivalentValue[0] = 1000;
		equivalentValue[1] = 500;
		equivalentValue[2] = 100;
		equivalentValue[3] = 50;
		equivalentValue[4] = 10;
		equivalentValue[5] = 5;
		equivalentValue[6] = 1;
		
		
		for (int i = 0; i <= 6; i++) {
			for (int j = decimalNumbers; j >= equivalentValue[i]; j -= equivalentValue[i]) {
				Answer += lookup.decimalToRoman(equivalentValue[i]);
				decimalNumbers -= equivalentValue[i];
			}
		}

	   	return Answer;
    }

}

















