package com.rupert.learning.romannumerals;

import java.util.Dictionary;
import java.util.Hashtable;

public class RomanNumerals {
	
	public Dictionary<String, Integer> arabicToRomanDictionary = arabicToRomanDictionary();
	
	private Dictionary<String, Integer> arabicToRomanDictionary() {
		
		Dictionary<String, Integer> arabicToRomanDictionary = new Hashtable<String, Integer>();
	   
		arabicToRomanDictionary.put("I", 1);
		arabicToRomanDictionary.put("V", 5);
		arabicToRomanDictionary.put("X", 10);
		arabicToRomanDictionary.put("L", 50);
		arabicToRomanDictionary.put("C", 100);
		arabicToRomanDictionary.put("D", 500);
		arabicToRomanDictionary.put("M", 1000);
		
	    return arabicToRomanDictionary;
	  
	}
	
	public int fromRomanNumeralsTransformer( String RomanNumerals ) {
		
		int Answer = 0;
		int firstNumber = 0;
		int secondNumber = 0;
				
    	for (int i = 0; i < RomanNumerals.length(); i++) {
    		
    		if (i != RomanNumerals.length()-1) {	    		
	    		firstNumber = arabicToRomanDictionary.get(RomanNumerals.substring(i, i+1));
	    		secondNumber = arabicToRomanDictionary.get(RomanNumerals.substring(i+1, i+2));    	
    		} else { 			
    			firstNumber = arabicToRomanDictionary.get(RomanNumerals.substring(i));   			
    		}
	    	
	    	if (firstNumber < secondNumber) {			  		
	    		Answer += secondNumber - firstNumber;	
	    		i++;
	    	} else {
	    		Answer += firstNumber;
	    	}
   			
    	}
 
    	return Answer;
    	
    }
    
}
