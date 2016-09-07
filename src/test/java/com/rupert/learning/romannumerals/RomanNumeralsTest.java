package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsTest {
	
	RomanNumerals trn = new RomanNumerals();
   
	@Test
    public void I_Returns_One() {
        assertEquals(1, trn.ToRomanNumeralsTransformer("I"));   
    }
	
	@Test
    public void II_Returns_Two() {
        assertEquals(2, trn.ToRomanNumeralsTransformer("II"));   
    }
	
	@Test
    public void III_Returns_Three() {
        assertEquals(3, trn.ToRomanNumeralsTransformer("III"));   
    }

	@Test
    public void V_Returns_Five() {
        assertEquals(5, trn.ToRomanNumeralsTransformer("V"));   
    }
	
}
