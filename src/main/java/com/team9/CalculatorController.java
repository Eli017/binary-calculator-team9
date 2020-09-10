package com.team9;

import java.io.IOException;
import javafx.fxml.FXML;

public class CalculatorController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
