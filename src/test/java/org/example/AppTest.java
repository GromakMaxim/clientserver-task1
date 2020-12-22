package org.example;

import org.example.server.FCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    private FCalculator calculator;

    @Before
    public void init(){
        calculator = new FCalculator();
    }


    @Test
    public void testRecursiveMethod() {
        assertEquals(0,calculator.calculateGeneralWay(0));
        assertEquals(1,calculator.calculateGeneralWay(1));
        assertEquals(1,calculator.calculateGeneralWay(2));
        assertEquals(2,calculator.calculateGeneralWay(3));
        assertEquals(3,calculator.calculateGeneralWay(4));

        assertEquals(5,calculator.calculateGeneralWay(5));
        assertEquals(8,calculator.calculateGeneralWay(6));
        assertEquals(13,calculator.calculateGeneralWay(7));
    }

    @Test
    public void testGeneralMethod() {
        assertEquals(0,calculator.calculateGeneralWay(0));
        assertEquals(1,calculator.calculateGeneralWay(1));
        assertEquals(1,calculator.calculateGeneralWay(2));
        assertEquals(2,calculator.calculateGeneralWay(3));
        assertEquals(3,calculator.calculateGeneralWay(4));

        assertEquals(5,calculator.calculateGeneralWay(5));
        assertEquals(8,calculator.calculateGeneralWay(6));
        assertEquals(13,calculator.calculateGeneralWay(7));
        assertEquals(75025,calculator.calculateGeneralWay(25));
        assertEquals(9227465,calculator.calculateGeneralWay(35));

        assertEquals(102_334_155,calculator.calculateGeneralWay(40));
        assertEquals(12_586_269_025L,calculator.calculateGeneralWay(50));
    }
    
}
