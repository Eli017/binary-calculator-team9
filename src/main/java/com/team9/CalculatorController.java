package com.team9;

public interface CalculatorController {

    static int add(int number, int secondNumber) {
        return number + secondNumber;
    }
    static int subtract(int number, int secondNumber) {
        return number - secondNumber;
    }

    static int multiply(int number, int secondNumber) {
        return number * secondNumber;
    }

    static int divide(int number, int secondNumber) {
        if (secondNumber == 0) {
            return 0; //can't divide by zero
        } else {
            return number / secondNumber;
        }
    }

    static int squareRoot(int number){
        if (number < 0){
            return 0; //can't square root negative numbers
        } else {
            return (int) Math.sqrt(number);
        }
    }

    static int square(int number){
        return (int) Math.pow(number, 2);
    }

}
