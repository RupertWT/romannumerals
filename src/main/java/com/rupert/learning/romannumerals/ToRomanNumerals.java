package com.rupert.learning.romannumerals;

public class ToRomanNumerals 
{
    public int ToRomanNumeralsTransformer( String RomanNumerals )
    {
    	    	
    	if (RomanNumerals.equals("V")) {
    		return 5;
    	}
    	
    	int Answer = 0;
    	
    	for (int i = 0; i < RomanNumerals.length(); i++) {
    		if (RomanNumerals.substring(i, i+1).equals("I")) {
    			Answer += 1;
    		}
    	}
 
    	return Answer;
    	
    }
}
