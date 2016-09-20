package com.rupert.learning.romannumerals;

import java.util.Dictionary;
import java.util.Hashtable;

public class RomanNumeralsDictionary {
	
	public static String decimalToRoman (int i) {
		return toRomanNumeralsDictionary.get(i);
	}
	
	public static int romanToDecimal (String s) {
		return toDecimalNumberDictionary.get(s);
	}
	
	
	private static Dictionary<Integer, String> toRomanNumeralsDictionary = toRomanDictionary();
	
	private static Dictionary<Integer, String> toRomanDictionary() {
			
			Dictionary<Integer, String> toRomanDictionary = new Hashtable<Integer, String>();
		   
			toRomanDictionary.put(1, "I");
			toRomanDictionary.put(4, "IV");
			toRomanDictionary.put(5, "V");
			toRomanDictionary.put(9, "IX");
			toRomanDictionary.put(10, "X");
			toRomanDictionary.put(40, "XL");
			toRomanDictionary.put(50, "L");
			toRomanDictionary.put(90, "XC");
			toRomanDictionary.put(100, "C");
			toRomanDictionary.put(400, "CD");
			toRomanDictionary.put(500, "D");
			toRomanDictionary.put(900, "CM");
			toRomanDictionary.put(1000, "M");
			
			return toRomanDictionary;
		  
	}	
    
	
	private static Dictionary<String, Integer> toDecimalNumberDictionary = toDecimalDictionary();
	
	private static Dictionary<String, Integer> toDecimalDictionary() {
		
		Dictionary<String, Integer> toDecimalDictionary = new Hashtable<String, Integer>();
	   
		toDecimalDictionary.put("I", 1);
		toDecimalDictionary.put("V", 5);
		toDecimalDictionary.put("X", 10);
		toDecimalDictionary.put("L", 50);
		toDecimalDictionary.put("C", 100);
		toDecimalDictionary.put("D", 500);
		toDecimalDictionary.put("M", 1000);
		
	    return toDecimalDictionary;
	  
	}
	
	
}
