package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorRomanNumeralsTest {
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	CalculatorRomanNumerals calc = new CalculatorRomanNumerals();
	
//	Additions
	
	@Test
    public void I_plus_III_equals_IV() {
        assertEquals("IV", calc.calculator("I","III","+"));   
    }
	
//	Subtractions
	
	@Test
    public void I_minus_V_equals_IV() {
        assertEquals("IV", calc.calculator("V","I","-"));   
    }
	
	@Test
    public void MMII_minus_CDV_equals_MDXCVII() {
        assertEquals("MDXCVII", calc.calculator("MMII","CDV","-"));   
    }
	
//	Multiplications
	
	@Test
	public void II_times_V_equals_X() {
        assertEquals("X", calc.calculator("II","V","*"));   
    }
	
//	Divisions
	
	@Test
	public void X_divided_V_equals_II() {
        assertEquals("II", calc.calculator("X","V","/"));   
    }
	
//	Exceptions
	
	@Test
	public void Input_One_Less_Than_0_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The first input cannot be <= 0 or empty;");
		calc.calculator("","III","+");
	}
	
	@Test
	public void Input_One_More_Than_3000_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The first input cannot be > 3000;");
		calc.calculator("MMMI","III","+");
	}
	
	@Test
	public void Input_Two_Less_Than_0_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The second input cannot be <= 0 or empty;");
		calc.calculator("I","","+");
	}
	
	@Test
	public void Input_Two_More_Than_3000_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The second input cannot be > 3000;");
		calc.calculator("I","MMMI","+");
	}
	
	@Test
	public void Answer_Less_Than_0_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The answer cannot be <= 0 or empty;");
		calc.calculator("I","III","-");
	}
	
	@Test
	public void Answer_More_Than_3000_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The answer cannot be > 3000;");
		calc.calculator("MI","MM","+");
	}
	
	@Test
	public void Answer_Not_An_Integer_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The answer must be a whole number;");
		calc.calculator("XIII","III","/");
	}

	
}
