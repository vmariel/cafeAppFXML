package com.project4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

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
        updateItems();
    }

    @FXML
    void updateItems() {
        String[] items = mainController.getCurrentOrder().getItems();
        currentDetails.getItems().clear();
        for (int i = 0; i < items.length; i++) {
            currentDetails.getItems().add(items[i]);
        }

        currentSubtotal.setText(String.valueOf(mainController.getCurrentOrder().calculateSubtotal()));
        currentTax.setText(String.valueOf(mainController.getCurrentOrder().calculateTax()));
        currentTotal.setText(String.valueOf(mainController.getCurrentOrder().calculateTotal()));
    }

    @FXML
    void placeOrder(ActionEvent event) {
        if (currentDetails == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Order");
            alert.setHeaderText("You have not added anything to this order.");
            alert.setContentText("Please try again.");
            alert.showAndWait();
        } else { // reset
            mainController.getStoreOrders().add(mainController.getCurrentOrder());
        }
    }

    @FXML
    void removeSelected(ActionEvent event) {
        int index = currentDetails.getSelectionModel().getSelectedIndex();
        if (index == -1) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No Item Selected");
            alert.setHeaderText("You have not selected an item to delete.");
            alert.setContentText("Please try again.");
            alert.showAndWait();
        } else {
            MenuItem toDelete = mainController.getCurrentOrder().itemIndex(index);
            mainController.getCurrentOrder().remove(toDelete);
            updateItems();
        }
    }

}