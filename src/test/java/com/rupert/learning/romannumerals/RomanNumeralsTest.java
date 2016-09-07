package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsTest {
	
	RomanNumerals rn = new RomanNumerals();
   
	@Test
    public void I_Returns_One() {
        assertEquals(1, rn.fromRomanNumeralsTransformer("I"));   
    }
	
	@Test
    public void II_Returns_Two() {
        assertEquals(2, rn.fromRomanNumeralsTransformer("II"));   
    }
	
	@Test
    public void III_Returns_Three() {
        assertEquals(3, rn.fromRomanNumeralsTransformer("III"));   
    }

	@Test
    public void V_Returns_Five() {
        assertEquals(5, rn.fromRomanNumeralsTransformer("V"));   
    }
	
}
