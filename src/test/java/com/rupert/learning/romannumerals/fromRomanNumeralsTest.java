package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class fromRomanNumeralsTest {
	
	fromRomanNumerals frn = new fromRomanNumerals();
  
//	Single character values	
	
	@Test
    public void I_Returns_One() {
        assertEquals(1, frn.fromRomanNumeralsTransformer("I"));   
    }
	
	@Test
    public void V_Returns_Five() {
        assertEquals(5, frn.fromRomanNumeralsTransformer("V"));   
    }
	
	@Test
    public void X_Returns_Ten() {
        assertEquals(10, frn.fromRomanNumeralsTransformer("X"));   
    }
		
	@Test
    public void L_Returns_Fifty() {
        assertEquals(50, frn.fromRomanNumeralsTransformer("L"));   
    }
	
	@Test
    public void C_Returns_One_Hundred() {
        assertEquals(100, frn.fromRomanNumeralsTransformer("C"));   
    }
	
	@Test
    public void D_Returns_Five_Hundred() {
        assertEquals(500, frn.fromRomanNumeralsTransformer("D"));   
    }
	
	@Test
    public void M_Returns_One_Thousand() {
        assertEquals(1000, frn.fromRomanNumeralsTransformer("M"));   
    }
		
//	Basic adding of character values
	
	@Test
    public void II_Returns_Two() {
        assertEquals(2, frn.fromRomanNumeralsTransformer("II"));   
    }
		
	@Test
    public void VIII_Returns_Eight() {
        assertEquals(8, frn.fromRomanNumeralsTransformer("VIII"));   
    }
		
	@Test
    public void XI_Returns_Eleven() {
        assertEquals(11, frn.fromRomanNumeralsTransformer("XI"));   
    }
	
	@Test
    public void XVI_Returns_Sixteen() {
        assertEquals(16, frn.fromRomanNumeralsTransformer("XVI"));   
    }
	
//	Subtraction of character values	
	
	@Test
    public void IV_Returns_Four() {
        assertEquals(4, frn.fromRomanNumeralsTransformer("IV"));   
    }
	
	@Test
    public void XIV_Returns_Fourteen() {
        assertEquals(14, frn.fromRomanNumeralsTransformer("XIV"));   
    }
	
//	Complex of character values	
	
	@Test
    public void MXLIV_Returns_One_Thousand_And_Forty_Four() {
        assertEquals(1044, frn.fromRomanNumeralsTransformer("MXLIV"));   
    }
	
	@Test
    public void MCMLXXXVI_Returns_Nineteen_Eighty_Six() {
        assertEquals(1986, frn.fromRomanNumeralsTransformer("MCMLXXXVI"));   
    }
	
	@Test
    public void MI_Returns_One_Thousand_And_One() {
        assertEquals(1001, frn.fromRomanNumeralsTransformer("MI"));   
    }
	
	@Test
    public void MCMXCIV_Returns_Three_Thousand_Nine_Hundred_And_Ninety_Nine() {
        assertEquals(3999, frn.fromRomanNumeralsTransformer("MMMCMXCIX"));   
    }
	
}
