package com.team9;

public interface ConverterInterface {

    static String decimalToBinary(int decimal){
        return Integer.toBinaryString(decimal);
    }

    static int binaryToDecimal(String binary){
        return Integer.parseInt(binary, 2);
    }

    static String[] parseInput(String input) {
        //May need to change regex ^10 part
        String[] inputParts = input.split("\\+|-|/|\\*|^10");
        char operator = input.charAt(inputParts[0].length());
        String[] result = new String[3];
        result[0] = inputParts[0];
        result[1] = Character.toString(operator);
        result[2] = inputParts[1];
        return result;
    }
}
