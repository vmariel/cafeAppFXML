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

    @FXML
    void placeOrder(ActionEvent event) {

    }

    @FXML
    void removeSelected(ActionEvent event) {

    }

}