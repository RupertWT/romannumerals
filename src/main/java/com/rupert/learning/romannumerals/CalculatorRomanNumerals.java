package com.rupert.learning.romannumerals;

public class CalculatorRomanNumerals {
		
	public String Calculator(String RomanNumeralInputOne, String RomanNumeralInputTwo, String Operator) {
		
		int DecimalInputOne = fromRomanNumerals.fromRomanNumeralsTransformer(RomanNumeralInputOne);
		checkForExceptions(DecimalInputOne, "first input");
		
		int DecimalInputTwo = fromRomanNumerals.fromRomanNumeralsTransformer(RomanNumeralInputTwo);
		checkForExceptions(DecimalInputTwo, "second input");
		
		int Answer = Operator.equals("-") ? (DecimalInputOne - DecimalInputTwo) : (DecimalInputOne + DecimalInputTwo);		
		checkForExceptions(Answer, "answer");
		
	
		return toRomanNumerals.toRomanNumeralsTransformer(Answer);
	
	}

	private void checkForExceptions(int ValueToBeChecked, String Variable) {
		
		if (ValueToBeChecked <= 0) {
			throw new IllegalArgumentException("The " + Variable + " cannot be <= 0 or empty;");
		}
		
		if (ValueToBeChecked > 3000) {
			throw new IllegalArgumentException("The " + Variable + " cannot be > 3000;");
		}
	}
	
}