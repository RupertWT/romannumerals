package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class toRomanNumeralsTest {
	
//	toRomanNumerals trn = new toRomanNumerals();

// 	Direct translations
	
	@Test
    public void One_Returns_I() {
        assertEquals("I", toRomanNumerals.toRomanNumeralsTransformer(1));   
    }
	
	@Test
    public void Five_Returns_V() {
        assertEquals("V", toRomanNumerals.toRomanNumeralsTransformer(5));   
    }
	
	@Test
    public void Ten_Returns_X() {
        assertEquals("X", toRomanNumerals.toRomanNumeralsTransformer(10));   
    }
	
	@Test
    public void Fifty_Returns_L() {
        assertEquals("L", toRomanNumerals.toRomanNumeralsTransformer(50));   
    }
	
	@Test
    public void One_Hundred_Returns_C() {
        assertEquals("C", toRomanNumerals.toRomanNumeralsTransformer(100));   
    }
	
	@Test
    public void Five_Hundred_Returns_D() {
        assertEquals("D", toRomanNumerals.toRomanNumeralsTransformer(500));   
    }
	
	@Test
    public void One_Thousand_Returns_M() {
        assertEquals("M", toRomanNumerals.toRomanNumeralsTransformer(1000));   
    }
	
//	Basic adding of character values
	
	@Test
    public void Two_Returns_II() {
        assertEquals("II", toRomanNumerals.toRomanNumeralsTransformer(2));   
    }
	
	@Test
    public void Three_Returns_III() {
        assertEquals("III", toRomanNumerals.toRomanNumeralsTransformer(3));   
    }
	
	@Test
    public void Six_Returns_VI() {
        assertEquals("VI", toRomanNumerals.toRomanNumeralsTransformer(6));   
    }
	
	@Test
    public void Eleven_Returns_XI() {
        assertEquals("XI", toRomanNumerals.toRomanNumeralsTransformer(11));   
    }
	
	@Test
    public void Twenty_Returns_XX() {
        assertEquals("XX", toRomanNumerals.toRomanNumeralsTransformer(20));   
    }
	
	@Test
    public void Seventy_Returns_LXX() {
        assertEquals("LXX", toRomanNumerals.toRomanNumeralsTransformer(70));   
    }
	
	@Test
    public void One_Hundred_And_Sixty_Returns_CLX() {
        assertEquals("CLX", toRomanNumerals.toRomanNumeralsTransformer(160));   
    }
	
	@Test
    public void Six_Hundred_Returns_DC() {
        assertEquals("DC", toRomanNumerals.toRomanNumeralsTransformer(600));   
    }
	
	@Test
    public void One_Thousand_Six_Hundred_And_Two_Returns_MDCII() {
        assertEquals("MDCII", toRomanNumerals.toRomanNumeralsTransformer(1602));   
    }
		
//	Complex values
	
	@Test
    public void Four_Returns_IV() {
        assertEquals("IV", toRomanNumerals.toRomanNumeralsTransformer(4));   
    }
	
	@Test
    public void Nine_Returns_IX() {
        assertEquals("IX", toRomanNumerals.toRomanNumeralsTransformer(9));   
    }
	
	@Test
    public void Fourteen_Returns_XIV() {
        assertEquals("XIV", toRomanNumerals.toRomanNumeralsTransformer(14));   
    }
	
	@Test
    public void Fourty_Returns_XL() {
        assertEquals("XL", toRomanNumerals.toRomanNumeralsTransformer(40));   
    }
	
	@Test
    public void Ninety_Returns_XC() {
        assertEquals("XC", toRomanNumerals.toRomanNumeralsTransformer(90));   
    }
	
	@Test
    public void Four_Hundred_Returns_CD() {
        assertEquals("CD", toRomanNumerals.toRomanNumeralsTransformer(400));   
    }
	
	@Test
    public void Nine_Hundred_Returns_CM() {
        assertEquals("CM", toRomanNumerals.toRomanNumeralsTransformer(900));   
    }
	
	@Test
    public void One_Thousand_Nine_Hundred_And_Ninety_Six_Returns_MCMXCVI() {
        assertEquals("MCMXCVI", toRomanNumerals.toRomanNumeralsTransformer(1996));   
    }
	
}
