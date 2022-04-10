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
    private ComboBox<String> coffeeSize;

    @FXML
    private TextField coffeeTotal;

    @FXML
    private CheckBox cream;

    @FXML
    private CheckBox milk;

    @FXML
    private Spinner<Integer> numCoffee;

    @FXML
    private CheckBox syrup;

    @FXML
    private CheckBox whippedCream;

    private MainController mainController;
    private Coffee coffee = new Coffee("Tall",1);

    public void setMainController(MainController controller) {
        mainController = controller;
    }

    @FXML
    void addCoffee(ActionEvent event) {

    }

    @FXML
    void manageCaramel(ActionEvent event) {
        if (caramel.isSelected()) {
            coffee.add("caramel");
        } else {
            coffee.remove("caramel");
        }
    }

    @FXML
    void manageCream(ActionEvent event) {
        if (cream.isSelected()) {
            coffee.add("cream");
        } else {
            coffee.remove("cream");
        }
    }

    @FXML
    void manageMilk(ActionEvent event) {
        if (milk.isSelected()) {
            coffee.add("milk");
        } else {
            coffee.remove("milk");
        }
    }

    @FXML
    void manageSyrup(ActionEvent event) {
        if (syrup.isSelected()) {
            coffee.add("syrup");
        } else {
            coffee.remove("syrup");
        }
    }

    @FXML
    void manageWhipped(ActionEvent event) {
        if (whippedCream.isSelected()) {
            coffee.add("whipped cream");
        } else {
            coffee.remove("whipped cream");
        }
    }

}
