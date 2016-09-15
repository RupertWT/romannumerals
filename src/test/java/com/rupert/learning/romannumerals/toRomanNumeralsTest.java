package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class toRomanNumeralsTest {
	
	toRomanNumerals trn = new toRomanNumerals();

// 	Direct translations
	
	@Test
    public void One_Returns_I() {
        assertEquals("I", trn.toRomanNumeralsTransformer(1));   
    }
	
	@Test
    public void Five_Returns_V() {
        assertEquals("V", trn.toRomanNumeralsTransformer(5));   
    }
	
	@Test
    public void Ten_Returns_X() {
        assertEquals("X", trn.toRomanNumeralsTransformer(10));   
    }
	
	@Test
    public void Fifty_Returns_L() {
        assertEquals("L", trn.toRomanNumeralsTransformer(50));   
    }
	
	@Test
    public void One_Hundred_Returns_C() {
        assertEquals("C", trn.toRomanNumeralsTransformer(100));   
    }
	
	@Test
    public void Five_Hundred_Returns_D() {
        assertEquals("D", trn.toRomanNumeralsTransformer(500));   
    }
	
	@Test
    public void One_Thousand_Returns_M() {
        assertEquals("M", trn.toRomanNumeralsTransformer(1000));   
    }
	
//	Basic adding of character values
	
	@Test
    public void Two_Returns_II() {
        assertEquals("II", trn.toRomanNumeralsTransformer(2));   
    }
	
	@Test
    public void Three_Returns_III() {
        assertEquals("III", trn.toRomanNumeralsTransformer(3));   
    }
	
	@Test
    public void Six_Returns_VI() {
        assertEquals("VI", trn.toRomanNumeralsTransformer(6));   
    }
	
	@Test
    public void Eleven_Returns_XI() {
        assertEquals("XI", trn.toRomanNumeralsTransformer(11));   
    }
	
	@Test
    public void Twenty_Returns_XX() {
        assertEquals("XX", trn.toRomanNumeralsTransformer(20));   
    }
	
	@Test
    public void Seventy_Returns_LXX() {
        assertEquals("LXX", trn.toRomanNumeralsTransformer(70));   
    }
	
	@Test
    public void One_Hundred_And_Sixty_Returns_CLX() {
        assertEquals("CLX", trn.toRomanNumeralsTransformer(160));   
    }
	
	@Test
    public void Six_Hundred_Returns_DC() {
        assertEquals("DC", trn.toRomanNumeralsTransformer(600));   
    }
	
	@Test
    public void One_Thousand_Six_Hundred_And_Two_Returns_MDCII() {
        assertEquals("MDCII", trn.toRomanNumeralsTransformer(1602));   
    }
		
}
