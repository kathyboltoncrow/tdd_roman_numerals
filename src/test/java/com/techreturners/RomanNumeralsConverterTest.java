package com.techreturners;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

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
    public void convertNineToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IX", romanNumeralsConverter.convert(9));
    }
    @Test
    public void convertTenToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("X", romanNumeralsConverter.convert(10));
    }
    @Test
    public void convertUnitsAndTensToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("LII", romanNumeralsConverter.convert(52));
    }
    @Test
    public void convertHundredsToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("CMXCIX", romanNumeralsConverter.convert(999));
    }
    @Test
    public void convertThousandsToNumeral(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("M", romanNumeralsConverter.convert(1000));
    }
    @Test
    public void convertZero(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            romanNumeralsConverter.convert(0);
        });
    }
    @Test
    public void convertFiveThousand(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            romanNumeralsConverter.convert(5000);
        });
    }

    @ParameterizedTest
    @CsvSource({"1, I,","2, II,"," 5, V,","11, XI"})
    public void parameterizedTest1(int input, String expected) {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        String converted = romanNumeralsConverter.convert(input);
        assertEquals(expected, converted);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    //@CsvFileSource(resources = "data.csv")
    public void parameterizedTest2(int input, String expected) {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        String converted = romanNumeralsConverter.convert(input);
        assertEquals(expected, converted);
    }
}
