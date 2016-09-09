package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorRomanNumeralsTest {
	
	CalculatorRomanNumerals calc = new CalculatorRomanNumerals();
	
	@Test
    public void blank_Test() {
        assertEquals("", calc.Calculator(""));   
    }

}
