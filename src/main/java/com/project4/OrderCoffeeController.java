package com.project4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

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

    @FXML
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
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Addition to Order");
        alert.setHeaderText("You are about to add the current item to order.");
        alert.setContentText("Please confirm below.");
        Optional<ButtonType> result = alert.showAndWait();

        if(result.isPresent() && (result.get() == ButtonType.OK)) {
            mainController.currentOrder.add(coffee);
            coffeeSize.getSelectionModel().selectFirst();
            numCoffee.getSelectionModel().selectFirst();
            coffee = new Coffee(coffeeSize.getSelectionModel().getSelectedItem(),
                    numCoffee.getSelectionModel().getSelectedItem());
            caramel.setSelected(false);
            cream.setSelected(false);
            milk.setSelected(false);
            syrup.setSelected(false);
            whippedCream.setSelected(false);

            updatePrice();
        }
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
