package com.team9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {

    @Test
    public void testDecimalToBinary() {
        assertEquals("1010", ConverterInterface.decimalToBinary(10));
    }

    @Test
    public void testBinaryToDecimal() {
        assertEquals(15, ConverterInterface.binaryToDecimal("1111"));
    }
}
