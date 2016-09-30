package com.rupert.learning.romannumerals;

public class CalculatorRomanNumerals {
	
	public String calculator(String romanNumeralInputOne, String romanNumeralInputTwo, String operator) {
		
		int decimalInputOne = convertToDecimalNumber(romanNumeralInputOne);
		int decimalInputTwo = convertToDecimalNumber(romanNumeralInputTwo);
		
		checkForExceptions(decimalInputOne, "first input");
		checkForExceptions(decimalInputTwo, "second input");
			
		int answer = calculate(operator, decimalInputOne, decimalInputTwo);		
		
		checkForExceptions(answer, "answer");
		return convertToRomanNumerals(answer);
	
	}

	private int calculate(String operator, int decimalInputOne, int decimalInputTwo) {
		int answer = 0;	
				
		switch(operator) {
			case "-":
				answer = decimalInputOne - decimalInputTwo;
				break;
			case "*":
				answer = decimalInputOne * decimalInputTwo;
				break;
			case "/":
				checkForNonWholeNumbesException(operator, decimalInputOne, decimalInputTwo);
				answer = decimalInputOne / decimalInputTwo;
				break;
			default:
				answer = decimalInputOne + decimalInputTwo;
		}
		return answer;
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

	}
	
	private void checkForNonWholeNumbesException(String operator, int decimalInputOne, int decimalInputTwo) {
		if (operator.equals("/") && (( ( (float)decimalInputOne / (float)decimalInputTwo) % 1) != 0)) {
			throw new IllegalArgumentException("The answer must be a whole number;");
		}
	}
}