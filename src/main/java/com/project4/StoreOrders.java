package com.project4;
/**
 * Container class holds a list of Order being purchased
 * from the store. Adds, and  removes orders.
 * @author Priya Patel, Vanna Mendoza
 */
import java.util.ArrayList;

public class StoreOrders implements Customizable{
    private ArrayList<Order> orderList;

    /**
     * A constructor that will define ArrayList
     * that will hold all orders placed within
     * the store.
     */
    public StoreOrders(){
       orderList = new ArrayList<>();
    }

    /**
     * A method that adds an order to the store order list.
     * Stores this order at the end of the list.
     * @param obj - An object that in this case represents an Order
     * that will be added to the list.
     * @return - Boolean true if the order is successfully added.
     * otherwise false
     */
    @Override
    public boolean add(Object obj) {
        if(obj instanceof Order){
            Order addedOrder = (Order) obj;
            orderList.add(addedOrder);
            return true;
        }
        return false;
    }

    /**
     * A method that removes an order to the store order list.
     * @param obj - An object that in this case represents an Order
     * that will be removed to the list.
     * @return - Boolean true if the order is successfully removed.
     * otherwise false
     */
    @Override
    public boolean remove(Object obj) {
        if(obj instanceof Order){
            Order findOrder = (Order) obj;
            if(orderList.contains(findOrder)){
                orderList.remove(findOrder);
                return true;
            }
        }
        return false;
    }

    /**
     * Prints all Orders within the Store Order List
     * @return String full Order list
     */
    public String toString(){
        String output = "";
        for (int i = 0; i < orderList.size(); i++) {
            output = output.concat(orderList.get(i).toString() + "\n");
        }
        return output;
    }
}
