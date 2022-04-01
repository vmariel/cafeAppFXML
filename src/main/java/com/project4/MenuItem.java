package com.project4;
/**
 * Defines an object called MenuItem. Includes a price of item,
 * and the quantity being purchased.
 * @author Priya Patel, Vanna Mendoza
 */
public class MenuItem {
    protected double itemPrice;
    protected int quantity;
    protected String itemName;


    /**
     * A constructor that will create an
     * empty MenuItem object
     */
    public MenuItem(){
        itemPrice = 0.0;
        quantity = 0;
        itemName = "";
    }

    /**
     * A method that will calculate the cost of
     * the menu item based on quantity
     * @return - Double cost of the menu item
     */
    public double itemPrice(){
        return itemPrice * quantity;
    }

    /**
     * Converts MenuItem to a string
     * @return - String representing the menu
     * item name, and amount being purchased
     */
    public String toString(){
        return itemName + " (" + quantity + ") ";
    }

}
