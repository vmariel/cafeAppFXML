package com.project4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class OrderBasketController {

    @FXML
    private ListView<String> currentDetails;

    @FXML
    private Button currentRemoveButton;

    @FXML
    private TextField currentSubtotal;

    @FXML
    private TextField currentTax;

    @FXML
    private TextField currentTotal;

    @FXML
    private Button placeOrderButton;

    private MainController mainController;

    @FXML
    public void setup(MainController controller) {
        mainController = controller;
        String[] items = mainController.getCurrentOrder().getItems();
        for (int i = 0; i < items.length; i++) {
            currentDetails.getItems().add(items[i]);
        }

        updatePrices();
    }

    @FXML
    void updatePrices() {
        currentSubtotal.setText(String.valueOf(mainController.getCurrentOrder().calculateSubtotal()));
        currentTax.setText(String.valueOf(mainController.getCurrentOrder().calculateTax()));
        currentTotal.setText(String.valueOf(mainController.getCurrentOrder().calculateTotal()));

    }

    @FXML
    void placeOrder(ActionEvent event) {

    }

    @FXML
    void removeSelected(ActionEvent event) {

    }

}