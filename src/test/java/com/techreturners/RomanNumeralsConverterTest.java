package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {

    @Test
    public void convertOneToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("I", romanNumeralsConverter.convert(1));
    }
    @Test
    public void convertTwoToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("II", romanNumeralsConverter.convert(2));
    }
    @Test
    public void convertFourToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IV", romanNumeralsConverter.convert(4));
    }

    @Test
    public void convertTenToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IX", romanNumeralsConverter.convert(9));
    }

}
