package com.rupert.learning.romannumerals;

public class CalculatorRomanNumerals {
	
	public String calculator(String romanNumeralInputOne, String romanNumeralInputTwo, String operator) {
		
		checkForInputStringExceptions(romanNumeralInputOne, "first input");
		checkForInputStringExceptions(romanNumeralInputTwo, "second input");
		
		int decimalInputOne = convertToDecimalNumber(romanNumeralInputOne);
		int decimalInputTwo = convertToDecimalNumber(romanNumeralInputTwo);
		
		checkForDecimalExceptions(decimalInputOne, "first input");
		checkForDecimalExceptions(decimalInputTwo, "second input");
			
		int answer = calculate(operator, decimalInputOne, decimalInputTwo);		
		
		checkForDecimalExceptions(answer, "answer");
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
			case "+":
				answer = decimalInputOne + decimalInputTwo;	
				break;
			default:
				throw new IllegalArgumentException("Invalid operator;");
		}
		return answer;
	}

	private String convertToRomanNumerals(int decimalNumber) {
		return ToRomanNumerals.toRomanNumeralsTransformer(decimalNumber);
	}

	
	private int convertToDecimalNumber(String romanNumeral) {
		ToDecimalNumber toDec = new ToDecimalNumber();
		return toDec.toDecimalNumberTransformer(romanNumeral);
	}

	
	private void checkForInputStringExceptions(String stringRomanInput, String description) {
		
		if (stringRomanInput == null) {
			throw new IllegalArgumentException("The " + description + " cannot be NULL;");
		}
		
		if (stringRomanInput.equals("")) {
			throw new IllegalArgumentException("The " + description + " cannot be EMPTY;");
		}
		
	}
	
	private void checkForDecimalExceptions(int valueToBeChecked, String description) {
		
		if (valueToBeChecked <= 0) {
			throw new IllegalArgumentException("The " + description + " cannot be <= 0;");
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