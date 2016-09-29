package com.rupert.learning.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToRomanNumeralsTest {
	
//	toRomanNumerals trn = new toRomanNumerals();

// 	Direct translations
	
	@Test
    public void One_Returns_I() {
        assertEquals("I", ToRomanNumerals.toRomanNumeralsTransformer(1));   
    }
	
	@Test
    public void Five_Returns_V() {
        assertEquals("V", ToRomanNumerals.toRomanNumeralsTransformer(5));   
    }
	
	@Test
    public void Ten_Returns_X() {
        assertEquals("X", ToRomanNumerals.toRomanNumeralsTransformer(10));   
    }
	
	@Test
    public void Fifty_Returns_L() {
        assertEquals("L", ToRomanNumerals.toRomanNumeralsTransformer(50));   
    }
	
	@Test
    public void One_Hundred_Returns_C() {
        assertEquals("C", ToRomanNumerals.toRomanNumeralsTransformer(100));   
    }
	
	@Test
    public void Five_Hundred_Returns_D() {
        assertEquals("D", ToRomanNumerals.toRomanNumeralsTransformer(500));   
    }
	
	@Test
    public void One_Thousand_Returns_M() {
        assertEquals("M", ToRomanNumerals.toRomanNumeralsTransformer(1000));   
    }
	
//	Basic adding of character values
	
	@Test
    public void Two_Returns_II() {
        assertEquals("II", ToRomanNumerals.toRomanNumeralsTransformer(2));   
    }
	
	@Test
    public void Three_Returns_III() {
        assertEquals("III", ToRomanNumerals.toRomanNumeralsTransformer(3));   
    }
	
	@Test
    public void Six_Returns_VI() {
        assertEquals("VI", ToRomanNumerals.toRomanNumeralsTransformer(6));   
    }
	
	@Test
    public void Eleven_Returns_XI() {
        assertEquals("XI", ToRomanNumerals.toRomanNumeralsTransformer(11));   
    }
	
	@Test
    public void Twenty_Returns_XX() {
        assertEquals("XX", ToRomanNumerals.toRomanNumeralsTransformer(20));   
    }
	
	@Test
    public void Seventy_Returns_LXX() {
        assertEquals("LXX", ToRomanNumerals.toRomanNumeralsTransformer(70));   
    }
	
	@Test
    public void One_Hundred_And_Sixty_Returns_CLX() {
        assertEquals("CLX", ToRomanNumerals.toRomanNumeralsTransformer(160));   
    }
	
	@Test
    public void Six_Hundred_Returns_DC() {
        assertEquals("DC", ToRomanNumerals.toRomanNumeralsTransformer(600));   
    }
	
	@Test
    public void One_Thousand_Six_Hundred_And_Two_Returns_MDCII() {
        assertEquals("MDCII", ToRomanNumerals.toRomanNumeralsTransformer(1602));   
    }
		
//	Complex values
	
	@Test
    public void Four_Returns_IV() {
        assertEquals("IV", ToRomanNumerals.toRomanNumeralsTransformer(4));   
    }
	
	@Test
    public void Nine_Returns_IX() {
        assertEquals("IX", ToRomanNumerals.toRomanNumeralsTransformer(9));   
    }
	
	@Test
    public void Fourteen_Returns_XIV() {
        assertEquals("XIV", ToRomanNumerals.toRomanNumeralsTransformer(14));   
    }
	
	@Test
    public void Fourty_Returns_XL() {
        assertEquals("XL", ToRomanNumerals.toRomanNumeralsTransformer(40));   
    }
	
	@Test
    public void Ninety_Returns_XC() {
        assertEquals("XC", ToRomanNumerals.toRomanNumeralsTransformer(90));   
    }
	
	@Test
    public void Four_Hundred_Returns_CD() {
        assertEquals("CD", ToRomanNumerals.toRomanNumeralsTransformer(400));   
    }
	
	@Test
    public void Nine_Hundred_Returns_CM() {
        assertEquals("CM", ToRomanNumerals.toRomanNumeralsTransformer(900));   
    }
	
	@Test
    public void One_Thousand_Nine_Hundred_And_Ninety_Six_Returns_MCMXCVI() {
        assertEquals("MCMXCVI", ToRomanNumerals.toRomanNumeralsTransformer(1996));   
    }
	
}
