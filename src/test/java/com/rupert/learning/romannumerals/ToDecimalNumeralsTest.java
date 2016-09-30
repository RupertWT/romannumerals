package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToDecimalNumeralsTest {
	
//	fromRomanNumerals frn = new fromRomanNumerals();
  
//	Single character values	
	
	@Test
    public void I_Returns_One() {
        assertEquals(1, ToDecimalNumber.toDecimalNumberTransformer("I"));   
    }
	
	@Test
    public void V_Returns_Five() {
        assertEquals(5, ToDecimalNumber.toDecimalNumberTransformer("V"));   
    }
	
	@Test
    public void X_Returns_Ten() {
        assertEquals(10, ToDecimalNumber.toDecimalNumberTransformer("X"));   
    }
		
	@Test
    public void L_Returns_Fifty() {
        assertEquals(50, ToDecimalNumber.toDecimalNumberTransformer("L"));   
    }
	
	@Test
    public void C_Returns_One_Hundred() {
        assertEquals(100, ToDecimalNumber.toDecimalNumberTransformer("C"));   
    }
	
	@Test
    public void D_Returns_Five_Hundred() {
        assertEquals(500, ToDecimalNumber.toDecimalNumberTransformer("D"));   
    }
	
	@Test
    public void M_Returns_One_Thousand() {
        assertEquals(1000, ToDecimalNumber.toDecimalNumberTransformer("M"));   
    }
		
//	Basic adding of character values
	
	@Test
    public void II_Returns_Two() {
        assertEquals(2, ToDecimalNumber.toDecimalNumberTransformer("II"));   
    }
		
	@Test
    public void VIII_Returns_Eight() {
        assertEquals(8, ToDecimalNumber.toDecimalNumberTransformer("VIII"));   
    }
		
	@Test
    public void XI_Returns_Eleven() {
        assertEquals(11, ToDecimalNumber.toDecimalNumberTransformer("XI"));   
    }
	
	@Test
    public void XVI_Returns_Sixteen() {
        assertEquals(16, ToDecimalNumber.toDecimalNumberTransformer("XVI"));   
    }
	
//	Subtraction of character values	
	
	@Test
    public void IV_Returns_Four() {
        assertEquals(4, ToDecimalNumber.toDecimalNumberTransformer("IV"));   
    }
	
	@Test
    public void XIV_Returns_Fourteen() {
        assertEquals(14, ToDecimalNumber.toDecimalNumberTransformer("XIV"));   
    }
	
//	Complex of character values	
	
	@Test
    public void MXLIV_Returns_One_Thousand_And_Forty_Four() {
        assertEquals(1044, ToDecimalNumber.toDecimalNumberTransformer("MXLIV"));   
    }
	
	@Test
    public void MCMLXXXVI_Returns_Nineteen_Eighty_Six() {
        assertEquals(1986, ToDecimalNumber.toDecimalNumberTransformer("MCMLXXXVI"));   
    }
	
	@Test
    public void MI_Returns_One_Thousand_And_One() {
        assertEquals(1001, ToDecimalNumber.toDecimalNumberTransformer("MI"));   
    }
	
	@Test
    public void MCMXCIV_Returns_Three_Thousand_Nine_Hundred_And_Ninety_Nine() {
        assertEquals(3999, ToDecimalNumber.toDecimalNumberTransformer("MMMCMXCIX"));   
    }
	
}
