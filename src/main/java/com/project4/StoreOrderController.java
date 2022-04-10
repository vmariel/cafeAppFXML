package com.project4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class StoreOrderController {

    @FXML
    private Button cancelOrderButton;

    @FXML
    private Button exportButton;

    @FXML
    private ListView<String> orderDetails;

    @FXML
    private ComboBox<Integer> orderNumber;

    @FXML
    private TextField orderTotal;

    @FXML
    void cancelOrder(ActionEvent event) {

    }

    @FXML
    void exportOrders(ActionEvent event) {

    }

}
