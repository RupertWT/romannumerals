package com.rupert.learning.romannumerals;

import java.util.Dictionary;
import java.util.Hashtable;

public class fromRomanNumerals {

	public Dictionary<String, Integer> fromRomanDictionary = fromRomanDictionary();
	
	private Dictionary<String, Integer> fromRomanDictionary() {
		
		Dictionary<String, Integer> fromRomanDictionary = new Hashtable<String, Integer>();
	   
		fromRomanDictionary.put("I", 1);
		fromRomanDictionary.put("V", 5);
		fromRomanDictionary.put("X", 10);
		fromRomanDictionary.put("L", 50);
		fromRomanDictionary.put("C", 100);
		fromRomanDictionary.put("D", 500);
		fromRomanDictionary.put("M", 1000);
		
	    return fromRomanDictionary;
	  
	}
	
	public int fromRomanNumeralsTransformer( String RomanNumerals ) {
		
		int Answer = 0;
				
    	for (int i = 0; i < RomanNumerals.length(); i++) {
    		
    		int firstNumber = 0;
    		int secondNumber = 0;
    		
    		if (lastCharacterInRomanNumeralsString(RomanNumerals, i)) {	    		
    			firstNumber = fromRomanDictionary.get(RomanNumerals.substring(i));   
    		} else { 			
    			firstNumber = fromRomanDictionary.get(RomanNumerals.substring(i, i+1));
	    		secondNumber = fromRomanDictionary.get(RomanNumerals.substring(i+1, i+2));    	
	    	}
	    	
	    	if (firstNumber < secondNumber) {			  		
	    		Answer += (secondNumber - firstNumber);	
	    		i++;
	    	} else {
	    		Answer += firstNumber;
	    	}
   			
    	}
 
    	return Answer;
    	
    }

	private boolean lastCharacterInRomanNumeralsString(String RomanNumerals, int i) {
		return i >= RomanNumerals.length()-1;
	}
	
}
