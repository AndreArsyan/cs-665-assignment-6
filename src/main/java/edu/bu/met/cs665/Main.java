/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/12/2024
 * File Name: Main.java
 * Description: Main entry for the application
 */

package edu.bu.met.cs665;

import java.util.Arrays;
import java.util.List;

import edu.bu.met.cs665.assignment2.DeliveryRequest;
import edu.bu.met.cs665.assignment2.Driver;
import edu.bu.met.cs665.assignment2.Shop;

/**
 * This is the Main class.
 */
public class Main {
  public static void main(String[] args) {

    // Create a main delivery request instance
    // Here we make the order and listened by the drivers
    DeliveryRequest deliveryRequest = new DeliveryRequest();

    // Create a list of drivers
    List<String> drivers = Arrays.asList("Uber Eats Driver", "Lyft Driver", "FoodPanda Driver", "GrubHub Driver",
        "DoorDash Driver");
    for (String driver : drivers) {
      new Driver(driver, deliveryRequest);
    }

    /*
     * McDonalds order
     */
    // Create McDonalds shop instance
    Shop mcDonalds = new Shop("McDonalds", "1010 Comm Ave");
    // Create the orders
    List<String> mcdOrder = List.of("Big Mac", "Chicken Sandwich", "French Fries");
    mcDonalds.setOrders(mcdOrder);
    // Publish the order to all driver
    deliveryRequest.publishNewOrder(mcDonalds);

    /*
     * Chickfila order
     */
    // Create Chickfila shop instance
    Shop chickfila = new Shop("Chickfila", "888 Boylston Ave");
    // Create the orders
    List<String> chickfilaOrder = List.of("Spicy Deluxe", "Milkshake");
    chickfila.setOrders(chickfilaOrder);
    // Publish chickfila order to all driver
    deliveryRequest.publishNewOrder(chickfila);
  }
}
