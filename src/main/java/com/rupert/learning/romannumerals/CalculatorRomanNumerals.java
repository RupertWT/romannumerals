package com.rupert.learning.romannumerals;

public class CalculatorRomanNumerals {
	
	public int decimal_input_one = 0;
	public int decimal_input_two = 0;
	public String operator = "";
	
	public String calculator(String romanNumeralInputOne, String romanNumeralInputTwo, String operator) {
		
		decimal_input_one = convertToDecimalNumber(romanNumeralInputOne);
		decimal_input_two = convertToDecimalNumber(romanNumeralInputTwo);
		this.operator = operator;
		
		checkForExceptions(decimal_input_one, "first input");
		checkForExceptions(decimal_input_two, "second input");
			
		int answer = 0;	
				
		switch(operator) {
			case "-":
				answer = decimal_input_one - decimal_input_two;
				break;
			case "*":
				answer = decimal_input_one * decimal_input_two;
				break;
			case "/":
				answer = decimal_input_one / decimal_input_two;
				break;
			default:
				answer = decimal_input_one + decimal_input_two;
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
		
		if (operator.equals("/") && (( ( (float)decimal_input_one / (float)decimal_input_two) % 1) != 0)) {
			throw new IllegalArgumentException("The answer must be a whole number;");
		}

	}
	
}