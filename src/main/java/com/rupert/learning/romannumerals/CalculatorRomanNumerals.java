package com.rupert.learning.romannumerals;

public class CalculatorRomanNumerals {
	
	public int DECIMAL_INPUT_ONE = 0;
	public int DECIMAL_INPUT_TWO = 0;
	public String OPERATOR = "";
	
	public String calculator(String romanNumeralInputOne, String romanNumeralInputTwo, String operator) {
		
		DECIMAL_INPUT_ONE = convertToDecimalNumber(romanNumeralInputOne);
		DECIMAL_INPUT_TWO = convertToDecimalNumber(romanNumeralInputTwo);
		OPERATOR = operator;
		
		checkForExceptions(DECIMAL_INPUT_ONE, "first input");
		checkForExceptions(DECIMAL_INPUT_TWO, "second input");
			
		int answer = 0;	
				
		switch(OPERATOR) {
			case "-":
				answer = DECIMAL_INPUT_ONE - DECIMAL_INPUT_TWO;
				break;
			case "*":
				answer = DECIMAL_INPUT_ONE * DECIMAL_INPUT_TWO;
				break;
			case "/":
				answer = DECIMAL_INPUT_ONE / DECIMAL_INPUT_TWO;
				break;
			default:
				answer = DECIMAL_INPUT_ONE + DECIMAL_INPUT_TWO;
		}		
		
		checkForExceptions(answer, "answer");
		return convertToRomanNumerals(answer);
	
	}
	
	private String convertToRomanNumerals(int decimalNumber) {
		return ToRomanNumerals.toRomanNumeralsTransformer(decimalNumber);
	}

	
	private int convertToDecimalNumber(String romanNumeral) {
		return ToDecimalNumber.toDecimalNumberTransformer(romanNumeral);
	}

	
	private void checkForExceptions(int valueToBeChecked, String description) {
		
		if (valueToBeChecked <= 0) {
			throw new IllegalArgumentException("The " + description + " cannot be <= 0 or empty;");
		}
		
		if (valueToBeChecked > 3000) {
			throw new IllegalArgumentException("The " + description + " cannot be > 3000;");
		}
		
		if (OPERATOR.equals("/") && (( ( (float)DECIMAL_INPUT_ONE / (float)DECIMAL_INPUT_TWO) % 1) != 0)) {
			throw new IllegalArgumentException("The answer must be a whole number;");
		}

	}
	
}