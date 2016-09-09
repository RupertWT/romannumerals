package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class toRomanNumeralsTest {
	
	toRomanNumerals rn = new toRomanNumerals();
	
	@Test
    public void One_Returns_I() {
        assertEquals("I", rn.toRomanNumeralsTransformer(1));   
    }
	
	@Test
    public void Two_Returns_II() {
        assertEquals("II", rn.toRomanNumeralsTransformer(2));   
    }
	
	@Test
    public void Three_Returns_III() {
        assertEquals("III", rn.toRomanNumeralsTransformer(3));   
    }
	
	@Test
    public void Four_Returns_IV() {
        assertEquals("IV", rn.toRomanNumeralsTransformer(4));   
    }
	
	@Test
    public void Five_Returns_V() {
        assertEquals("V", rn.toRomanNumeralsTransformer(5));   
    }
	
}
