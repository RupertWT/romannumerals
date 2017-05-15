package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ToDecimalNumeralsTest {
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	ToDecimalNumber toDec = new ToDecimalNumber();
  
//	Single character values	
	
	@Test
    public void I_Returns_One() {
        assertEquals(1, toDec.toDecimalNumberTransformer("I"));   
    }
	
	@Test
    public void V_Returns_Five() {
        assertEquals(5, toDec.toDecimalNumberTransformer("V"));   
    }
	
	@Test
    public void X_Returns_Ten() {
        assertEquals(10, toDec.toDecimalNumberTransformer("X"));   
    }
		
	@Test
    public void L_Returns_Fifty() {
        assertEquals(50, toDec.toDecimalNumberTransformer("L"));   
    }
	
	@Test
    public void C_Returns_One_Hundred() {
        assertEquals(100, toDec.toDecimalNumberTransformer("C"));   
    }
	
	@Test
    public void D_Returns_Five_Hundred() {
        assertEquals(500, toDec.toDecimalNumberTransformer("D"));   
    }
	
	@Test
    public void M_Returns_One_Thousand() {
        assertEquals(1000, toDec.toDecimalNumberTransformer("M"));   
    }
		
//	Basic adding of character values
	
	@Test
    public void II_Returns_Two() {
        assertEquals(2, toDec.toDecimalNumberTransformer("II"));   
    }
		
	@Test
    public void VIII_Returns_Eight() {
        assertEquals(8, toDec.toDecimalNumberTransformer("VIII"));   
    }
		
	@Test
    public void XI_Returns_Eleven() {
        assertEquals(11, toDec.toDecimalNumberTransformer("XI"));   
    }
	
	@Test
    public void XVI_Returns_Sixteen() {
        assertEquals(16, toDec.toDecimalNumberTransformer("XVI"));   
    }
	
//	Subtraction of character values	
	
	@Test
    public void IV_Returns_Four() {
        assertEquals(4, toDec.toDecimalNumberTransformer("IV"));   
    }
	
	@Test
    public void XIV_Returns_Fourteen() {
        assertEquals(14, toDec.toDecimalNumberTransformer("XIV"));   
    }
	
//	Complex of character values	
	
	@Test
    public void MXLIV_Returns_One_Thousand_And_Forty_Four() {
        assertEquals(1044, toDec.toDecimalNumberTransformer("MXLIV"));   
    }
	
	@Test
    public void MCMLXXXVI_Returns_Nineteen_Eighty_Six() {
        assertEquals(1986, toDec.toDecimalNumberTransformer("MCMLXXXVI"));   
    }
	
	@Test
    public void MI_Returns_One_Thousand_And_One() {
        assertEquals(1001, toDec.toDecimalNumberTransformer("MI"));   
    }
	
	@Test
	public void null_String_Throws_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("NULL String not allowed;");
		toDec.toDecimalNumberTransformer(null);
	}
	
	@Test
	public void empty_String_Throws_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("EMPTY String not allowed;");
		toDec.toDecimalNumberTransformer("");
	}
	
	@Ignore
	public void invalid_Characters_Throw_Exception() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Only the following characters are valid: IVXLCDM;");
		toDec.toDecimalNumberTransformer("Z");
	}
	
}
