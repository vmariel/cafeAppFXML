package com.project4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ComboBoxController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}