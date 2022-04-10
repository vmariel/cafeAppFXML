package com.project4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class OrderCoffeeController {

    @FXML
    private Button addCoffeeButton;

    @FXML
    private CheckBox caramel;

    @FXML
    private ComboBox<?> coffeeSize;

    @FXML
    private TextField coffeeTotal;

    @FXML
    private CheckBox cream;

    @FXML
    private CheckBox milk;

    @FXML
    private Spinner<?> numCoffee;

    @FXML
    private CheckBox syrup;

    @FXML
    private CheckBox whippedCream;

    @FXML
    void addCoffee(ActionEvent event) {

    }

}
