package com.team9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    private final CalculatorController calculator = new CalculatorController();

    @Test
    void basicTest() {
        assertEquals(2, calculator.add(1, 1));
    }
}
