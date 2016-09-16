package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorRomanNumeralsTest {
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	CalculatorRomanNumerals calc = new CalculatorRomanNumerals();
	
	@Test
    public void I_plus_III_equals_IV() {
        assertEquals("IV", calc.Calculator("I","III","+"));   
    }
	
	@Test
    public void I_minus_V_equals_IV() {
        assertEquals("IV", calc.Calculator("V","I","-"));   
    }
	
	@Test
    public void MMII_minus_CDV_equals_MDXCVII() {
        assertEquals("MDXCVII", calc.Calculator("MMII","CDV","-"));   
    }
	
	@Test
	public void Input_One_Less_Than_0_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The first input cannot be <= 0 or empty;");
		calc.Calculator("","III","+");
	}
	
	@Test
	public void Input_One_More_Than_3000_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The first input cannot be > 3000;");
		calc.Calculator("MMMI","III","+");
	}
	
	@Test
	public void Input_Two_Less_Than_0_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The second input cannot be <= 0 or empty;");
		calc.Calculator("I","","+");
	}
	
	@Test
	public void Input_Two_More_Than_3000_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The second input cannot be > 3000;");
		calc.Calculator("I","MMMI","+");
	}
	
	@Test
	public void Answer_Less_Than_0_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The answer cannot be <= 0 or empty;");
		calc.Calculator("I","III","-");
	}
	
	@Test
	public void Answer_More_Than_3000_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The answer cannot be > 3000;");
		calc.Calculator("MI","MM","+");
	}
	
}
