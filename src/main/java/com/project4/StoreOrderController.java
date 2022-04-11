package com.project4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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

    private MainController mainController;
    private Order selected;
    private int current;

    @FXML
    public void setup(MainController controller) {
        mainController = controller;
        updateItems();
    }

    @FXML
    void updateItems() {
        ArrayList<Order> allOrders = mainController.getStoreOrders().getOrderList();
        String[] items;

        if (allOrders.size() == 0) {
            selected = new Order();
            items = selected.getItems();
            current = 1;
        } else {
            items = allOrders.get(current-1).getItems();
        }

        orderDetails.getItems().clear();

        for (int i = 0; i < items.length; i++) {
            orderDetails.getItems().add(items[i]);
        }

        orderTotal.setText(String.valueOf(mainController.getCurrentOrder().calculateTotal()));

    }

    @FXML
    void cancelOrder(ActionEvent event) {
        if (mainController.getStoreOrders().getOrderList().size() == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Order");
            alert.setHeaderText("You have not selected an order to delete.");
            alert.setContentText("Please try again.");
            alert.showAndWait();
        } else {}
    }

    @FXML
    void exportOrders(ActionEvent event) {
        if (mainController.getStoreOrders().getOrderList().size() == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Order");
            alert.setHeaderText("You have not added anything to the store orders.");
            alert.setContentText("Please try again.");
            alert.showAndWait();
        } else {
            mainController.getStoreOrders().export();
        }
    }

    @FXML
    void selectOrder(ActionEvent event) {
        current = orderNumber.getSelectionModel().getSelectedItem();
        updateItems();
    }

}
