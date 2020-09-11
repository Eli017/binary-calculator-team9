package com.team9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals("2", CalculatorInterface.add(1, 1));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, CalculatorInterface.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(21, CalculatorInterface.multiply(7, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(6, CalculatorInterface.divide(42, 7));
    }

    @Test
    public void testZeroDivision() {
        assertEquals(0, CalculatorInterface.divide(13, 0));
    }

    @Test
    public void testSquare() {
        assertEquals(144, CalculatorInterface.square(12));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(9, CalculatorInterface.squareRoot(81));
    }

    @Test
    public void testSquareRootNegative() {
        assertEquals(0, CalculatorInterface.squareRoot(-1));
    }
}
