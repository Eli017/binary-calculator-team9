package com.team9;

public class Converter {

    public String decimalToBinary(int decimal){
        return Integer.toBinaryString(decimal);
    }

    public int binaryToDecimal(String binary){
        return Integer.parseInt(binary, 2);
    }
}
