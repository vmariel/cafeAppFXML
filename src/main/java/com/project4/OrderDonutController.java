package com.project4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class OrderDonutController {

    @FXML
    private Button addDonutButton;

    @FXML
    private Button addDonutOrderButton;

    @FXML
    private ListView<String> donutMenu;

    @FXML
    private ListView<String> donutSelected;

    @FXML
    private TextField donutTotal;

    @FXML
    private ComboBox<String> donutType;

    @FXML
    private Spinner<Integer> numDonut;

    @FXML
    private Button removeDonutButton;

    @FXML
    void addDonuts(ActionEvent event) {

    }

    @FXML
    void chooseDonuts(ActionEvent event) {

    }

    @FXML
    void removeDonuts(ActionEvent event) {

    }

}
