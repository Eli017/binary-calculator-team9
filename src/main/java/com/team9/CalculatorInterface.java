package com.team9;

public interface CalculatorInterface {

    static int add(int number, int secondNumber) {
        return number + secondNumber;
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

    static int eval(String[] input) {
        String leftNumberString = input[0];
        String rightNumberString = input[2];
        int leftNumber = ConverterInterface.binaryToDecimal(leftNumberString);
        int rightNumber = ConverterInterface.binaryToDecimal(rightNumberString);
        int result = 0;
        switch (input[1]){
            case("+"):
                result = add(leftNumber, rightNumber);
                break;
            case("-"):
                result = subtract(leftNumber, rightNumber);
                break;
            case("*"):
                result = multiply(leftNumber, rightNumber);
                break;
            case("/"):
                result = divide(leftNumber, rightNumber);
                break;
        }
        return result;
    }

}
