package com.team9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.function.ToDoubleBiFunction;

/**
 * JavaFX App
 */
public class App extends Application {
    public static void main(String[] args) throws IOException {
        launch((args));
    }

    //Quick Builder for VBox
    private VBox buildVbox(int spacing, Pos pos, Background background) {
        VBox vbox = new VBox(spacing);
        vbox.setAlignment(pos);
        vbox.setBackground(background);
        return vbox;
    }

    //Quick Builder for HBox
    private HBox buildHbox(int spacing, Pos pos) {
        HBox hBox = new HBox(spacing);
        hBox.setAlignment(pos);
        return hBox;
    }

    @Override
    public void start(Stage stage)  {
        //Set-up MV integration
        Calculator calculator=new Calculator();

        //Build Containers, Title, and Output
        VBox outerVbox=buildVbox(10, Pos.CENTER,Background.EMPTY);
        Scene scene = new Scene(outerVbox,200,220, Color.NAVAJOWHITE);
        Label title= new Label("Binary Calculator");
        Text output = new Text("0");
        output.setTextAlignment(TextAlignment.RIGHT);
        HBox basicOperations = buildHbox(20,Pos.CENTER);
        HBox clearToggleOperations=buildHbox(20,Pos.CENTER);
        HBox numbers= buildHbox(20, Pos.CENTER);
        HBox advancedAndEqualOperations = buildHbox(20, Pos.CENTER);

        //Toggle and Clear Operations
        Button toggleButton=new Button("Toggle Binary/Decimal");
        Button clearButton= new Button("C");
        clearToggleOperations.getChildren().addAll(toggleButton,clearButton);
        toggleButton.setOnAction(actionEvent -> {
            //TODO Call handling for swapping between decimal and binary
        });
        clearButton.setOnAction(actionEvent -> {
            //TODO Clear output field
        });

        //Binary Number Inputs
        Button zeroButton=new Button(" 0");
        Button oneButton=new Button(" 1");
        numbers.getChildren().addAll(zeroButton,oneButton);
        zeroButton.setOnAction(actionEvent -> {
            //TODO Input a zero in model class.  Also appropriately modify "output"
        });
        oneButton.setOnAction(actionEvent -> {
            //TODO Input a one in model class.  Also appropriately modify "output"
        });

        //4-Function
        Button plusButton=new Button("+");
        Button minusButton= new Button(" -");
        Button multiplyButton=new Button("X");
        Button divideButton=new Button("÷");
        basicOperations.getChildren().addAll(plusButton,minusButton,multiplyButton,divideButton);
        plusButton.setOnAction(actionEvent -> {
            //TODO Handle addition operation
        });
        minusButton.setOnAction(actionEvent -> {
            //TODO handle subtraction operation
        });
        multiplyButton.setOnAction(actionEvent -> {
            //TODO handle multiplication operation
        });
        divideButton.setOnAction(actionEvent -> {
            //TODO handle division operation
        });

        //Advanced Operations
        Button squareButton=new Button("x²");
        Button squareRootButton=new Button("√");
        Button equalButton = new Button("=");
        advancedAndEqualOperations.getChildren().addAll(squareButton,squareRootButton,equalButton);
        squareButton.setOnAction(actionEvent -> {
            //TODO handle squaring operation
        });
        squareRootButton.setOnAction(actionEvent -> {
            //TODO handle square root operation
        });
        equalButton.setOnAction(actionEvent -> {
            //TODO handle "equals" operation
        });

        //Present
        outerVbox.getChildren().addAll(title,output,clearToggleOperations,numbers,basicOperations,advancedAndEqualOperations);
        stage.setScene(scene);
        stage.show();
    }
}