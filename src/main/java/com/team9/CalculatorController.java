package com.team9;

public class CalculatorController {

    public int add(int number, int secondNumber) {
        return number + secondNumber;
    }
    public int subtract(int number, int secondNumber) {
        return number - secondNumber;
    }

    public int multiply(int number, int secondNumber) {
        return number * secondNumber;
    }

    public int divide(int number, int secondNumber) {
        if (secondNumber == 0) {
            return 0; //can't divide by zero
        } else {
            return number / secondNumber;
        }
    }

}
