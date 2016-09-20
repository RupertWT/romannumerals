package com.rupert.learning.romannumerals;

import java.util.Dictionary;
import java.util.Hashtable;

public class RomanNumeralsDictionary {
	
	public static String decimalToRoman (int i) {
		return fromDecimalDictionary.get(i);
	}
	
	public static int romanToDecimal (String s) {
		return fromRomanDictionary.get(s);
	}
	
	
	private static Dictionary<Integer, String> fromDecimalDictionary = fromDecimalDictionary();
	
	private static Dictionary<Integer, String> fromDecimalDictionary() {
			
			Dictionary<Integer, String> fromDecimalDictionary = new Hashtable<Integer, String>();
		   
			fromDecimalDictionary.put(1, "I");
			fromDecimalDictionary.put(4, "IV");
			fromDecimalDictionary.put(5, "V");
			fromDecimalDictionary.put(9, "IX");
			fromDecimalDictionary.put(10, "X");
			fromDecimalDictionary.put(40, "XL");
			fromDecimalDictionary.put(50, "L");
			fromDecimalDictionary.put(90, "XC");
			fromDecimalDictionary.put(100, "C");
			fromDecimalDictionary.put(400, "CD");
			fromDecimalDictionary.put(500, "D");
			fromDecimalDictionary.put(900, "CM");
			fromDecimalDictionary.put(1000, "M");
			
			return fromDecimalDictionary;
		  
	}	
    
	
	private static Dictionary<String, Integer> fromRomanDictionary = fromRomanDictionary();
	
	private static Dictionary<String, Integer> fromRomanDictionary() {
		
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
	
	
}
