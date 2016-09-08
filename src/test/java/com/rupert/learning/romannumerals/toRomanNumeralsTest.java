package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class toRomanNumeralsTest {
	
	toRomanNumerals rn = new toRomanNumerals();
	
	@Test
    public void I_Returns_One() {
        assertEquals("I", rn.toRomanNumeralsTransformer(1));   
    }
	
}
