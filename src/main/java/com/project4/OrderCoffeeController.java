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
    private ComboBox<String> coffeeSize = new ComboBox<String>();

    @FXML
    private TextField coffeeTotal;

    @FXML
    private CheckBox cream;

    @FXML
    private CheckBox milk;

    @FXML
    private ComboBox<Integer> numCoffee = new ComboBox<Integer>();

    @FXML
    private CheckBox syrup;

    @FXML
    private CheckBox whippedCream;

    private MainController mainController;
    private Coffee coffee;

    public void setup(MainController controller) {
        mainController = controller;
        coffeeSize.getItems().addAll("Short", "Tall", "Grande", "Venti");
        coffeeSize.getSelectionModel().selectFirst();
        numCoffee.getItems().addAll(1, 2, 3, 4, 5, 6);
        numCoffee.getSelectionModel().selectFirst();
        coffee = new Coffee(coffeeSize.getSelectionModel().getSelectedItem(),
                numCoffee.getSelectionModel().getSelectedItem());
        updatePrice();
    }

    @FXML
    void updatePrice() {
        coffeeTotal.setText(String.valueOf(coffee.itemPrice()));
    }

    @FXML
    void addCoffee(ActionEvent event) {
        mainController.currentOrder.add(coffee);
    }

    @FXML
    void manageCaramel(ActionEvent event) {
        if (caramel.isSelected()) {
            coffee.add("caramel");
        } else {
            coffee.remove("caramel");
        }
        updatePrice();
    }

    @FXML
    void manageCream(ActionEvent event) {
        if (cream.isSelected()) {
            coffee.add("cream");
        } else {
            coffee.remove("cream");
        }
        updatePrice();
    }

    @FXML
    void manageMilk(ActionEvent event) {
        if (milk.isSelected()) {
            coffee.add("milk");
        } else {
            coffee.remove("milk");
        }
        updatePrice();
    }

    @FXML
    void manageSyrup(ActionEvent event) {
        if (syrup.isSelected()) {
            coffee.add("syrup");
        } else {
            coffee.remove("syrup");
        }
        updatePrice();
    }

    @FXML
    void manageWhipped(ActionEvent event) {
        if (whippedCream.isSelected()) {
            coffee.add("whipped cream");
        } else {
            coffee.remove("whipped cream");
        }
        updatePrice();
    }

    @FXML
    void updateNum(ActionEvent event) {
        coffee.quantity = numCoffee.getSelectionModel().getSelectedItem();
        updatePrice();
    }

    @FXML
    void updateSize(ActionEvent event) {
        coffee.setSize(coffeeSize.getSelectionModel().getSelectedItem());
        updatePrice();
    }

}
