package com.team9;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculatorController{
    Boolean isButtonPressed = false;

    @FXML
    TextField numberField;

    @FXML
    Label calculatedAnswer;

    @FXML
    private void toggleBinaryArabic() {
        //TODO: implement toggling of result.
    }

    @FXML
    private void toArabic() {
        //TODO: implement Calculator interface to convert string input to logical number.
    }


    @FXML
    private void enterZero() {
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
            numberField.setText(numberField.getText().concat(" * "));
            isButtonPressed = true;
        }
    }

    @FXML
    private void divideClicked() {
        //TODO: logic around next number.
        if (isButtonPressed.equals(true)) {
            System.out.println("Must hit = or change second number value");
        }else {
            numberField.setText(numberField.getText().concat(" / "));
            isButtonPressed = true;
        }
    }

    @FXML
    private void squareClicked() {
        //TODO: logic around next number.
        if (isButtonPressed.equals(true)) {
            System.out.println("Must hit = or change second number value");
        }else {
            isButtonPressed = true;
        }
    }

    @FXML
    private void sqrtClicked() {
        //TODO: Perform sqrt math for current number and populate result area.
        if (isButtonPressed.equals(true)) {
            System.out.println("Must hit = or change second number value");
        }else {
            isButtonPressed = true;
        }
    }

    @FXML
    private void clearClicked() {
        numberField.setText("0");
        //TODO: Clear variables and TextField area input.
        isButtonPressed = false;
    }

    @FXML
    private void equalClicked() {
        try{
            String[] input = ConverterInterface.parseInput(numberField.getText());
            calculatedAnswer.setText(CalculatorInterface.eval(input));
        } catch (Exception e) {
            System.out.println("Make sure your equation is logically sound.");
            e.printStackTrace();
        }
    }
}