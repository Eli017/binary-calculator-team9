package com.team9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(2, CalculatorController.add(1, 1));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, CalculatorController.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(21, CalculatorController.multiply(7, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(6, CalculatorController.divide(42, 7));
    }

    @Test
    public void testZeroDivision() {
        assertEquals(0, CalculatorController.divide(13, 0));
    }

    @Test
    public void testSquare() {
        assertEquals(144, CalculatorController.square(12));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(9, CalculatorController.squareRoot(81));
    }

    @Test
    public void testSquareRootNegative() {
        assertEquals(0, CalculatorController.squareRoot(-1));
    }
}
