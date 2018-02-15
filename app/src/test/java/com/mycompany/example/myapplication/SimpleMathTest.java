package com.mycompany.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleMathTest {

    private SimpleMath sm;

    @Before
    public void setup(){
        sm = new SimpleMath();
    }

    @Test
    public void testAdd() {
        int total = sm.add(4, 5);
        assertEquals("Simple Math is not adding correctly", 9, total);
    }

    @Test
    public void testDiff() {
        int total = sm.diff(9, 2);
        assertEquals("Simple Math is not subtracting correctly", 7, total);
    }

    @Test
    public void testDiv(){
        double total = sm.div(10, 5);
        assertEquals("Simple math is not dividing correctly", Double.valueOf(2.0), Double.valueOf(total));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivWithZeroDivisor(){
        double total = sm.div(10, 0);
        assertEquals("Simple math is not handling division by zero correctly", 0.0, total, 0.0);
    }
}



