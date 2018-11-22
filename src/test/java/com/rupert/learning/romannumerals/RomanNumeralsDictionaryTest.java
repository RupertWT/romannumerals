package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RomanNumeralsDictionaryTest {
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	RomanNumeralsDictionary RNDict = new RomanNumeralsDictionary();
	
//	decimalToRoman
	
	@Test
    public void one_equals_I() {
        assertEquals("I", RomanNumeralsDictionary.decimalToRoman(1));
    }
}