package com.team9;

public interface ConverterInterface {

    static String decimalToBinary(int decimal){
        return Integer.toBinaryString(decimal);
    }

    static int binaryToDecimal(String binary){
        return Integer.parseInt(binary, 2);
    }
}
