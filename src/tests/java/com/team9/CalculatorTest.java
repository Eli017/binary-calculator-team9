package com.team9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    private final CalculatorController calculator = new CalculatorController();

    @Test
    void testAddition() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(21, calculator.multiply(7, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(6, calculator.divide(42, 7));
    }

    @Test
    public void testZeroDivision() {
        assertEquals(0, calculator.divide(13, 0));
    }
}
