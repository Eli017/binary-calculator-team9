package com.team9;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    Boolean isButtonPressed = false;
    Boolean isBinary = false;

    String tempArabicAnswer = "";

    @FXML
    TextField numberField;

    @FXML
    Label calculatedAnswer;

    @FXML
    private void toggleBinaryArabic() {
        try {
            if (isBinary){
            if (!tempArabicAnswer.equals("")) {
                calculatedAnswer.setText(tempArabicAnswer);
            } else {
                String decimal = Integer.toString(ConverterInterface.binaryToDecimal(calculatedAnswer.getText()));
                calculatedAnswer.setText(decimal);
            }
            isBinary = false;
        } else{
            String binary = ConverterInterface.decimalToBinary(Integer.parseInt(calculatedAnswer.getText()));
            calculatedAnswer.setText(binary);
            isBinary = true;
        }
    }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void enterZero() {
        //TODO make sure you cant type a 0 after doing the first operation button
        if (numberField.getText().equals("0")) {
            System.out.println("It is already equal to 0.");
        } else {
            numberField.setText(numberField.getText().concat("0"));
        }
    }

    @FXML
    private void enterOne() {
        if (numberField.getText().equals("0")) {
            numberField.setText("1");
            }
        else {
            numberField.setText(numberField.getText().concat("1"));
        }
    }

    @FXML
    private void addClicked() {
        if (numberField.getText().length() > 0) {
            numberField.setText(numberField.getText().concat("+"));
        }
    }

    @FXML
    private void subtractClicked() {
        numberField.setText(numberField.getText().concat("-"));
    }

    @FXML
    private void multiplyClicked() {
        //TODO: logic around next number.
        if (isButtonPressed.equals(true)) {
            System.out.println("Must hit = or change second number value");
        }else {
            numberField.setText(numberField.getText().concat("*"));
            isButtonPressed = true;
        }
    }

    @FXML
    private void divideClicked() {
        //TODO: logic around next number.
        if (isButtonPressed.equals(true)) {
            System.out.println("Must hit = or change second number value");
        }else {
            numberField.setText(numberField.getText().concat("/"));
            isButtonPressed = true;
        }
    }

    @FXML
    private void squareClicked() {
        try{
            String answer = Integer.toString(CalculatorInterface.square(ConverterInterface.binaryToDecimal(numberField.getText())));
            tempArabicAnswer = answer;
            calculatedAnswer.setText(answer);
        }catch (Exception e){
            System.out.println("Make sure everything is logically sound");
            e.printStackTrace();
        }
    }

    @FXML
    private void sqrtClicked() {
        try {
            String answer = Integer.toString(CalculatorInterface.squareRoot(ConverterInterface.binaryToDecimal(numberField.getText())));
            tempArabicAnswer = answer;
            calculatedAnswer.setText(answer);
        }catch (Exception e) {
            System.out.println("Make sure everything is logically sound");
            e.printStackTrace();
        }
    }

    @FXML
    private void clearClicked() {
        numberField.setText("0");
        tempArabicAnswer = null;
        isButtonPressed = false;
        isBinary = false;
        calculatedAnswer.setText("0");
    }

    @FXML
    private void equalClicked() {
        try{
            String[] input = ConverterInterface.parseInput(numberField.getText());
            tempArabicAnswer = Integer.toString(CalculatorInterface.eval(input));
            calculatedAnswer.setText(Integer.toString(CalculatorInterface.eval(input)));
        } catch (Exception e) {
            System.out.println("Make sure your equation is logically sound.");
            e.printStackTrace();
        }
    }
}