package com.project4;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

    public Order currentOrder = new Order();
    public StoreOrders storeOrders = new StoreOrders();

    @FXML
    void currentOrder(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OrderBasketView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 400);
            Stage stage = new Stage();
            OrderBasketController basketController = fxmlLoader.getController();
            basketController.setup(this);
            stage.setTitle("Current Order");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {}
    }

    @FXML
    void orderCoffee(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OrderCoffeeView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 400);
            Stage stage = new Stage();
            OrderCoffeeController coffeeController = fxmlLoader.getController();
            coffeeController.setup(this);
            stage.setTitle("Ordering Coffee");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {}
    }

    @FXML
    void orderDonuts(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OrderDonutView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 400);
            Stage stage = new Stage();
            stage.setTitle("Ordering Donuts");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {}
    }

    @FXML
    void storeOrders(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StoreOrderView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 400);
            Stage stage = new Stage();
            stage.setTitle("Store Orders");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {}
    }

}
