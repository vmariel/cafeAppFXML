package com.project4;
/**
 * An interface that requires the class that implemented
 * this interface to override methods pertaining to the
 * addition and deletion of certain attributes based off
 * the parameter inputs
 * @author Priya Patel, Vanna Mendoza
 */
public interface Customizable {
    /**
     * Definitions of methods
     */
    boolean add(Object obj);
    boolean remove(Object obj);
}
