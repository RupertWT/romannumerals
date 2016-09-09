package com.rupert.learning.romannumerals;

import java.util.Dictionary;
import java.util.Hashtable;

public class toRomanNumerals {
	
	public Dictionary<Integer, String> fromDecimalDictionary = fromDecimalDictionary();
	
	private Dictionary<Integer, String> fromDecimalDictionary() {
		
		Dictionary<Integer, String> fromDecimalDictionary = new Hashtable<Integer, String>();
	   
		fromDecimalDictionary.put(1, "I");
		fromDecimalDictionary.put(5, "V");
		fromDecimalDictionary.put(10, "X");
		fromDecimalDictionary.put(50, "L");
		fromDecimalDictionary.put(100, "C");
		fromDecimalDictionary.put(500, "D");
		fromDecimalDictionary.put(1000, "M");
		
	    return fromDecimalDictionary;
	  
	}	
	
	public String toRomanNumeralsTransformer( int arabicNumbers ) {

		if (fromDecimalDictionary.get(arabicNumbers) != null) {
			return fromDecimalDictionary.get(arabicNumbers);
		}
		
		String Answer = "";
		
		for (int i = 0; i < arabicNumbers; i++) {
			Answer += "I";			
		}
	   	return Answer;
    }

}

















