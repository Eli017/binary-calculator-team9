package com.team9;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.math.MathContext;


public class calculatorController{
    @FXML
    TextField numberField;
    public Boolean isButtonPressed = false;

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
        //TODO: logic around next number.
        if (isButtonPressed.equals(true)) {
            System.out.println("Must hit = or change second number value");
        } else {
            numberField.setText(numberField.getText().concat(" + "));
            isButtonPressed = true;
        }
    }

    @FXML
    private void subtractClicked() {
        //TODO: logic around next number.
        if (isButtonPressed.equals(true)) {
            System.out.println("Must hit = or change second number value");
        }else {
            numberField.setText(numberField.getText().concat(" - "));
            isButtonPressed = true;
        }
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
        //TODO: Perform math to add two binary numbers and populate the result area.
        numberField.getText();
    }
}