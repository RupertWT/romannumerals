package com.rupert.learning.romannumerals;

public class CalculatorRomanNumerals {
		
	public String calculator(String romanNumeralInputOne, String romanNumeralInputTwo, String operator) {
		
		int decimalInputOne = FromRomanNumerals.fromRomanNumeralsTransformer(romanNumeralInputOne);
		int decimalInputTwo = FromRomanNumerals.fromRomanNumeralsTransformer(romanNumeralInputTwo);
		
		checkForExceptions(decimalInputOne, "first input");
		checkForExceptions(decimalInputTwo, "second input");
		
		int answer = operator.equals("-") ? (decimalInputOne - decimalInputTwo) : (decimalInputOne + decimalInputTwo);		
		checkForExceptions(answer, "answer");
		
	
		return ToRomanNumerals.toRomanNumeralsTransformer(answer);
	
	}

	private void checkForExceptions(int valueToBeChecked, String description) {
		
		if (valueToBeChecked <= 0) {
			throw new IllegalArgumentException("The " + description + " cannot be <= 0 or empty;");
		}
		
		if (valueToBeChecked > 3000) {
			throw new IllegalArgumentException("The " + description + " cannot be > 3000;");
		}
	}
	
}