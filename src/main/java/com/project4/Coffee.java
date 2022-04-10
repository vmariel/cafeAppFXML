package com.project4;
/**
 * Creates a Coffee object. Calculates cost of coffee.
 * Allows customers to customize their coffee order
 * by allowing add ins and removing add ins.
 * @author Priya Patel, Vanna Mendoza
 */
import java.util.ArrayList;

public class Coffee extends MenuItem implements Customizable {
    private static final double SHORTCOFFEE = 1.69;
    private static final double TALLCOFFEE =  2.09;
    private static final double GRANDECOFFEE = 2.49;
    private static final double VENTICOFFEE = 2.89;
    private static final double ADDINS = 0.30;
    private static final int EMPTY = 0;

    private ArrayList<String> addInList;
    private String size;
    private Double basePrice;

    /**
     * A constructor that will define itemPrice
     * based on the given type of coffee
     * @param s - String that contains the size of
     * coffee being purchased
     * @param amount - Integer that contains the
     * amount being purchased
     */
    public Coffee(String s, int amount){

        this.itemName = "Coffee";
        this.quantity = amount;

        setSize(s);

        this.addInList = new ArrayList<>();
    }

    /**
     * A method that will calculate the cost of
     * the menu item based on quantity
     * @return - Double the cost of Coffee
     */
    @Override
    public double itemPrice() {
        this.itemPrice = basePrice + (addInList.size() * ADDINS);
        return super.itemPrice();
    }

    /**
     * A method that adds an add-in to the stored add-in list.
     * @param obj - An object that represents an add-in
     * that will be added to the list.
     * @return - Boolean true if the add-in is successfully added.
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
     * A method that removes an add-in from the stored add-in list.
     * @param obj - An object that represents an add-in
     * that will be removed to the list.
     * @return - Boolean true if the add-in is successfully removed.
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

    /**
     * Converts Coffee to a string
     * @return - String representing the Coffee size,
     * add-ins, and amount being purchased
     */
    @Override
    public String toString(){
        int addInNum = addInList.size();
        if(addInNum == EMPTY){
            return super.toString() + size;
        }

        String result = super.toString() + size + "[";
        for(int i = 0; i < addInNum; i++){
            if(i == addInNum-1){
                result += addInList.get(i) + "]";
            }
            else{
                result += addInList.get(i) + ",";
            }
        }
        return result;
    }

    public void setSize(String s) {
        s = s.toLowerCase();

        if(s.equals("short")){
            this.basePrice = SHORTCOFFEE;
            size = "Short ";
        }
        else if(s.equals("tall")){
            this.basePrice = TALLCOFFEE;
            size = "Tall ";
        }
        else if(s.equals("grande")){
            this.basePrice = GRANDECOFFEE;
            size = "Grande ";
        }
        else{
            this.basePrice = VENTICOFFEE;
            size = "Venti ";
        }
    }
}
