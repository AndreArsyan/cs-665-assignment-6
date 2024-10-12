/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/12/2024
 * File Name: Driver.java
 * Description: Class for the Driver
 */
package edu.bu.met.cs665.assignment2;

import java.util.ArrayList;

/**
 * This is the Driver class.
 * This class is responsible for representing a Driver.
 */
public class Driver implements SubscriberBase {

    private String name; // Driver name
    private DeliveryRequest deliveryRequest; // Subscribe to this Delivery Request object

    private Shop shop; // Shop and order detail

    /**
     * Driver constructor
     *
     * @param name driver name
     * @param deliveryRequest Subscribe to this Delivery Request
     */
    public Driver(String name, DeliveryRequest deliveryRequest) {
        this.name = name;
        this.deliveryRequest = deliveryRequest;
        this.deliveryRequest.subscribe(this);
    }

    /*
     *  Print the notification and order details
     */
    public void newOrderNotification() {
        System.out.println("Hi " + getName()+"!\n"+
                "New order from " + this.shop.getName() + ". " +
                "Orders:\n  " +getOrder().toString());
    }

    /*
     *  Get driver name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Add the order details
     *
     * @param shop shop and order details
     */
    @Override
    public void addOrder(Shop shop) {
        this.shop = shop;
        newOrderNotification();
    }

    /*
     * Get the order list
     */
    public ArrayList<String> getOrder() {
        return this.shop.getOrders();
    }

}
