package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class fromRomanNumeralsTest {
	
//	fromRomanNumerals frn = new fromRomanNumerals();
  
//	Single character values	
	
	@Test
    public void I_Returns_One() {
        assertEquals(1, fromRomanNumerals.fromRomanNumeralsTransformer("I"));   
    }
	
	@Test
    public void V_Returns_Five() {
        assertEquals(5, fromRomanNumerals.fromRomanNumeralsTransformer("V"));   
    }
	
	@Test
    public void X_Returns_Ten() {
        assertEquals(10, fromRomanNumerals.fromRomanNumeralsTransformer("X"));   
    }
		
	@Test
    public void L_Returns_Fifty() {
        assertEquals(50, fromRomanNumerals.fromRomanNumeralsTransformer("L"));   
    }
	
	@Test
    public void C_Returns_One_Hundred() {
        assertEquals(100, fromRomanNumerals.fromRomanNumeralsTransformer("C"));   
    }
	
	@Test
    public void D_Returns_Five_Hundred() {
        assertEquals(500, fromRomanNumerals.fromRomanNumeralsTransformer("D"));   
    }
	
	@Test
    public void M_Returns_One_Thousand() {
        assertEquals(1000, fromRomanNumerals.fromRomanNumeralsTransformer("M"));   
    }
		
//	Basic adding of character values
	
	@Test
    public void II_Returns_Two() {
        assertEquals(2, fromRomanNumerals.fromRomanNumeralsTransformer("II"));   
    }
		
	@Test
    public void VIII_Returns_Eight() {
        assertEquals(8, fromRomanNumerals.fromRomanNumeralsTransformer("VIII"));   
    }
		
	@Test
    public void XI_Returns_Eleven() {
        assertEquals(11, fromRomanNumerals.fromRomanNumeralsTransformer("XI"));   
    }
	
	@Test
    public void XVI_Returns_Sixteen() {
        assertEquals(16, fromRomanNumerals.fromRomanNumeralsTransformer("XVI"));   
    }
	
//	Subtraction of character values	
	
	@Test
    public void IV_Returns_Four() {
        assertEquals(4, fromRomanNumerals.fromRomanNumeralsTransformer("IV"));   
    }
	
	@Test
    public void XIV_Returns_Fourteen() {
        assertEquals(14, fromRomanNumerals.fromRomanNumeralsTransformer("XIV"));   
    }
	
//	Complex of character values	
	
	@Test
    public void MXLIV_Returns_One_Thousand_And_Forty_Four() {
        assertEquals(1044, fromRomanNumerals.fromRomanNumeralsTransformer("MXLIV"));   
    }
	
	@Test
    public void MCMLXXXVI_Returns_Nineteen_Eighty_Six() {
        assertEquals(1986, fromRomanNumerals.fromRomanNumeralsTransformer("MCMLXXXVI"));   
    }
	
	@Test
    public void MI_Returns_One_Thousand_And_One() {
        assertEquals(1001, fromRomanNumerals.fromRomanNumeralsTransformer("MI"));   
    }
	
	@Test
    public void MCMXCIV_Returns_Three_Thousand_Nine_Hundred_And_Ninety_Nine() {
        assertEquals(3999, fromRomanNumerals.fromRomanNumeralsTransformer("MMMCMXCIX"));   
    }
	
}
