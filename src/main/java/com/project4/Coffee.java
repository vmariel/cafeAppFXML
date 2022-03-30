package com.project4;
/**
 Creates a Coffee object. Calculates cost of coffee.
 Allows customers to customize their coffee order
 by allowing add ins and removing add ins.
 @author Priya Patel, Vanna Mendoza
 */
import java.util.ArrayList;

public class Coffee extends MenuItem implements Customizable {
    public static final double SHORTCOFFEE = 1.69;
    public static final double TALLCOFFEE =  2.09;
    public static final double GRANDECOFFEE = 2.49;
    public static final double VENTICOFFEE = 2.89;
    public static final double ADDINS = 0.30;
    private ArrayList<String> addInList;

    /**
     A constructor that will define itemPrice
     based on the given type of donut
     @param size - String that contains the size of
     coffee being purchased
     @param amount - Integer that contains the
     amount being purchased
     */
    public Coffee(String size, int amount){
        size = size.toLowerCase();
        this.quantity = amount;

        if(size.equals("short")){
            this.itemPrice = SHORTCOFFEE;
        }
        else if(size.equals("tall")){
            this.itemPrice = TALLCOFFEE;
        }
        else if(size.equals("grande")){
            this.itemPrice = GRANDECOFFEE;
        }
        else{
            this.itemPrice = VENTICOFFEE;
        }

        this.addInList = new ArrayList<>();
    }

    /**
     * A method that will calculate the cost of
     * the menu item based on quantity
     @return double the cost of the menu item
     */
    @Override
    public double itemPrice() {
        double addInPrice = addInList.size() * ADDINS;
        double total = (this.itemPrice + addInPrice) * this.quantity;

        return total;
    }

    /**
     * A method that adds an addin to the stored addin list.
     * @param obj - An object that represents an addin
     * that will be added to the list.
     * @return - Boolean true if the addin is successfully added.
     * otherwise false
     */
    @Override
    public boolean add(Object obj) {
        String toAdd = (String) obj;
        if(addInList.contains(toAdd)){
            return false;
        }
        addInList.add(toAdd);
        return true;
    }

    /**
     * A method that removes an addin from the stored addin list.
     * @param obj - An object that represents an addin
     * that will be removed to the list.
     * @return - Boolean true if the addin is successfully removed.
     * otherwise false
     */
    @Override
    public boolean remove(Object obj) {
        String toRemove = (String) obj;
        if(!addInList.contains(toRemove)){
            return false;
        }
        addInList.remove(toRemove);
        return true;
    }
}
