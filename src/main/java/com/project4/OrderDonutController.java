package com.project4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class OrderDonutController {

    @FXML
    private Button addDonutButton,addDonutOrderButton,removeDonutButton;
    @FXML
    private ListView<String> donutMenu,donutSelected;
    @FXML
    private TextField donutTotal;
    @FXML
    private ComboBox<String> donutType = new ComboBox<String>();
    @FXML
    private ComboBox<Integer> numDonut = new ComboBox<Integer>();

    private MainController mainController;
    private Donut donut;

    @FXML
    public void setup(MainController controller) {
        mainController = controller;
        donutType.getItems().addAll("Yeast", "Cake", "Donut Hole");
        donutType.getSelectionModel().selectFirst();

        donutMenu.getItems().addAll("Chocolate", "Glazed","Jelly");

        numDonut.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        numDonut.getSelectionModel().selectFirst();

        donut = new Donut(donutType.getSelectionModel().getSelectedItem(),
                donutMenu.getSelectionModel().getSelectedItem(), numDonut.getSelectionModel().getSelectedItem());

        updatePrice();
    }

    @FXML
    void updatePrice() {
        donutTotal.setText(String.valueOf(donut.itemPrice()));
    }

    @FXML
    void addDonuts(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Addition to Order");
        alert.setHeaderText("You are about to add the current item to order.");
        alert.setContentText("Please confirm below.");
        Optional<ButtonType> result = alert.showAndWait();

        if(result.isPresent() && (result.get() == ButtonType.OK)) {
            mainController.getCurrentOrder().add(donut);
            updatePrice();
        }
    }

    @FXML
    void updateNum(ActionEvent event) {
        donut.quantity = numDonut.getValue();
        updatePrice();
    }

    @FXML
    void updateType(ActionEvent event) {
        donut.setType(donutType.getSelectionModel().getSelectedItem());
        updatePrice();
    }

    @FXML
    void updateFlavor(ActionEvent event) {
        donut.setFlavor(donutMenu.getSelectionModel().getSelectedItem());
        updatePrice();
    }

    @FXML
    void removeDonuts(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Remove from Order");
        alert.setHeaderText("You are about remove the current item to order.");
        alert.setContentText("Please confirm below.");
        Optional<ButtonType> result = alert.showAndWait();

        if(result.isPresent() && (result.get() == ButtonType.OK)) {
            mainController.getCurrentOrder().remove(donut);
            updatePrice();
        }
    }

}