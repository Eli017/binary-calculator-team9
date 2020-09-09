package com.team9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {
    private final Converter converter = new Converter();

    @Test
    public void testDecimalToBinary() {
        assertEquals("1010", converter.decimalToBinary(10));
    }

    @Test
    public void testBinaryToDecimal() {
        assertEquals(15, converter.binaryToDecimal("1111"));
    }
}
