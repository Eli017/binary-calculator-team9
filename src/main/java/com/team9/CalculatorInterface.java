package com.team9;

public interface CalculatorInterface {

    static String add(String number, String secondNumber) {
        int numberParsed = ConverterInterface.binaryToDecimal(number);
        int secondNumberParsed = ConverterInterface.binaryToDecimal(secondNumber);
        int result = numberParsed + secondNumberParsed;
        return Integer.toString(result);
    }

    //TODO convert subtract to input and output the same type as add function.
    //This means that each function will convert from string to int.
    static int subtract(int number, int secondNumber) {
        return number - secondNumber;
    }

    //TODO convert multiply to input and output the same type as add function.
    //This means that each function will convert from string to int.
    static int multiply(int number, int secondNumber) {
        return number * secondNumber;
    }

    //TODO convert divide to input and output the same type as add function.
    //This means that each function will convert from string to int.
    static int divide(int number, int secondNumber) {
        if (secondNumber == 0) {
            return 0; //can't divide by zero
        } else {
            return number / secondNumber;
        }
    }

    //TODO convert sqrt to input and output the same type as add function.
    //This means that each function will convert from string to int.
    static int squareRoot(int number){
        if (number < 0){
            return 0; //can't square root negative numbers
        } else {
            return (int) Math.sqrt(number);
        }
    }

    //TODO convert square to input and output the same type as add function.
    //This means that each function will convert from string to int.
    static int square(int number){
        return (int) Math.pow(number, 2);
    }

    static String eval(String[] input) {
        String leftNumberString = input[0];
        String rightNumberString = input[2];
        String result = "";
        switch (input[1]){
            case("+"):
                result = add(leftNumberString, rightNumberString);
                break;
            case("-"):
//                result = subtract(leftNumberString, rightNumberString);
                break;
            case("*"):
//                result = multiply(leftNumberString, rightNumberString);
                break;
            case("/"):
//                result = divide(leftNumberString, rightNumberString);
                break;
        }
        return result;
    }

}
