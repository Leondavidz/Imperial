package com.example.imperial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ImperialTest {
    ImperialCalculator exp = new ImperialCalculator();
    @Test
    void redTest(){
        String a ="red";
        String expectedResult = "green";
        String result = exp.Red(a);
        assertEquals(expectedResult,result);
    }

    @Test
    void orangeTest(){
        String a = "orange";
        String expectedResult = "blue";
        String result =exp.Orange(a);
        assertEquals(expectedResult,result);
    }

    @Test
    void yellowTest(){
        String a ="yellow";
        String expectedResult = "purple";
        String result = exp.Yellow(a);
        assertEquals(expectedResult,result);
    }
    @Test
    void purpleTest(){
        String a = "purple";
        String expectedResult = "yellow";
        String result = exp.Purple(a);
        assertEquals(expectedResult,result);
    }
}
