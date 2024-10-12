/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/12/2024
 * File Name: Shop.java
 * Description: Class for shop object
 */

package edu.bu.met.cs665.assignment2;

import java.util.ArrayList;

/**
 * This is the Shop class.
 * This class is responsible for representing a Shop.
 */
public class Shop {

    private String name;
    private String address;

    // This array will contain user orders (e.g. Burgers, Spaghetti)
    private ArrayList<String> orders = new ArrayList<String>();

    /**
     * Create a Person object using first and last name and birthday.
     *
     * @param name shop name
     * @param address shop address
     */
    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /*
     * Getter method for all orders.
     */
    public ArrayList<String> getOrders() {
        return orders;
    }

    /*
     * Getter method for shop name.
     */
    public String getName() {
        return name;
    }

    /*
     * Getter method for shop address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for user order
     *
     * @param orders list of a user order
     */
    public void setOrders(ArrayList<String> orders) {
        this.orders = orders;
    }

}