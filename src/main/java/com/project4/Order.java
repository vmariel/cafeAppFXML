package com.project4;
/**
 * Container class holds a list of MenuItems being purchased
 * within an order. Adds, Removes, calculates subtotal, sales tax,
 * and total of the current order.
 * @author Priya Patel, Vanna Mendoza
 */
import java.util.ArrayList;

public class Order implements Customizable{
    private static final double SALESTAX = 0.06625;
    private ArrayList<MenuItem> itemList;

    /**
     * A constructor that will define ArrayList
     * that will hold all MenuItems in the
     * current order
     */
    public Order (){
        itemList = new ArrayList<>();
    }

    /**
     * Calculates the subtotal of all items in the
     * current order
     * @return - Double that represents the
     * subtotal for the current order.
     */
    public double calculateSubtotal(){
        double subtotal = 0;

        for (MenuItem menuItem : itemList) {
            subtotal += menuItem.itemPrice();
        }

        return subtotal;
    }

    /**
     * Calculates the itemList sales tax
     * that is applicable in the state of New Jersey.
     * @return - Double that represents the sales tax
     * of the subtotal for the current order.
     */

    public double calculateTax(){
        return (this.calculateSubtotal() * SALESTAX);
    }

    /**
     * Calculate the total of current order.
     * Uses the methods above and returns the sum.
     * @return - Double that represents the total
     * amount of the current order.
     */

    public double calculateTotal(){
        return (this.calculateSubtotal() + this.calculateTax());
    }

    /**
     * A method that adds a MenuItem to the stored Order list.
     * @param obj - An object that represents a MenuItem
     * that will be added to the list.
     * @return - Boolean true if the MenuItem is successfully added.
     * otherwise false
     */
    @Override
    public boolean add(Object obj) {
        if(obj instanceof Donut){
            Donut donutOrder = (Donut) obj;
            itemList.add(donutOrder);
            return true;
        }
        else if(obj instanceof Coffee){
            Coffee coffeeOrder = (Coffee) obj;
            itemList.add(coffeeOrder);
            return true;
        }
        return false;
    }

    /**
     * A method that removes a MenuItem from the stored Order list.
     * @param obj - An object that represents a MenuItem
     * that will be removed to the list.
     * @return - Boolean true if the MenuItem is successfully removed.
     * otherwise false
     */
    @Override
    public boolean remove(Object obj) {
        if(obj instanceof Donut){
            Donut donutOrder = (Donut) obj;
            if(itemList.contains(donutOrder)){
                itemList.remove(donutOrder);
                return true;
            }
        }
        else if(obj instanceof Coffee){
            Coffee coffeeOrder = (Coffee) obj;
            if(itemList.contains(coffeeOrder)){
                itemList.remove(coffeeOrder);
                return true;
            }
        }
        return false;
    }

    /**
     * Prints all MenuItem within the Order
     * @return - String full MenuItem list
     */
    public String toString(){
        String output = "";
        for (int i = 0; i < itemList.size(); i++) {
            output = output.concat(itemList.get(i).toString() + "\n");
        }
        return output;
    }

    /**
     * Returns all MenuItem within the Order
     * @return - String array with full MenuItem list
     */
    public String[] getItems(){
        String[] output = new String[itemList.size()];
        for (int i = 0; i < itemList.size(); i++) {
            output[i] = itemList.get(i).toString();
        }
        return output;
    }

    public MenuItem itemIndex(int index) {
        return itemList.get(index);
    }
}
