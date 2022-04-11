package com.project4;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {

    private Order currentOrder = new Order();
    private StoreOrders storeOrders = new StoreOrders();

    @FXML
    void currentOrder(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OrderBasketView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 400);
            Stage stage = new Stage();
            OrderBasketController basketController = fxmlLoader.getController();
            basketController.setup(this);
            stage.setTitle("Current Order");
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
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
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (Exception e) {}
    }

    @FXML
    void orderDonuts(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OrderDonutView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 400);
            Stage stage = new Stage();
            OrderDonutController donutController = fxmlLoader.getController();
            donutController.setup(this);
            stage.setTitle("Ordering Donuts");
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
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
            StoreOrderController storeController = fxmlLoader.getController();
            storeController.setup(this);
            stage.setTitle("Store Orders");
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {}
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public StoreOrders getStoreOrders() {
        return storeOrders;
    }

    public void setCurrentOrder() {
        currentOrder = new Order();
    }
}
