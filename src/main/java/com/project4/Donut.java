package com.project4;
/**
 * Creates a Donut object. Calculates cost of donut.
 * @author Priya Patel, Vanna Mendoza
 */
public class Donut extends MenuItem{
    private static final double YEASTDONUT = 1.59;
    private static final double CAKEDONUT =  1.79;
    private static final double DONUTHOLES = 0.39;

    /**
     * A constructor that will define itemPrice
     * based on the given type of donut
     * @param type - String that contains the type of
     * donut being purchased
     * @param flavor - String that contains the flavor of
     * donut being purchased
     * @param amount - Integer that contains the
     * amount being purchased
     */
    public Donut(String type, String flavor, int amount){
        type = type.toLowerCase();
        this.itemName = flavor.toLowerCase();
        this.quantity = amount;

        if(type.equals("yeast")){
            this.itemPrice = YEASTDONUT;
        }
        else if(type.equals("cake")){
            this.itemPrice = CAKEDONUT;
        }
        else{
            this.itemPrice = DONUTHOLES;
        }
    }

    /**
     * A method that will calculate the cost of
     * the menu item based on quantity
     * @return - Double cost of Donut
     */
    @Override
    public double itemPrice(){
        return super.itemPrice();
    }

    /**
     * Converts Donut to a string
     * @return - String representing the flavor,
     * donut type, and amount being purchased
     */
    @Override
    public String toString(){
        return super.toString();
    }
}
