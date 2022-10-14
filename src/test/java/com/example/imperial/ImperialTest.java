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
}
