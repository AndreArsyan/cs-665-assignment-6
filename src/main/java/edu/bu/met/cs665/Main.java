/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/12/2024
 * File Name: Main.java
 * Description: Main entry for the application
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment2.DeliveryRequest;
import edu.bu.met.cs665.assignment2.Driver;
import edu.bu.met.cs665.assignment2.Shop;

import java.util.ArrayList;

/**
 * This is the Main class.
 */
public class Main {
  public static void main(String[] args) {

    // Create a main delivery request instance
    // Here we make the order
    DeliveryRequest deliveryRequest = new DeliveryRequest();

    // Create and register the driver into the delivery request instance
    Driver uberEatsDriver = new Driver("Uber Eats Driver", deliveryRequest);
    Driver lyftDriver = new Driver("lyft Driver", deliveryRequest);
    Driver foodPandaDriver = new Driver("FoodPanda Driver", deliveryRequest);
    Driver grubhubDriver = new Driver("GrubHub Driver", deliveryRequest);
    Driver doorDashDriver = new Driver("Doordash Driver", deliveryRequest);

    // Create a shop instance
    Shop mcDonalds = new Shop("McDonalds", "1010 Comm Ave");

    // Create the orders
    ArrayList<String> mcdOrder = new ArrayList<String>() {
      {
        add("Big Mac");
        add("Chicken Sandwich");
        add("French Fries");
      }
    };
    mcDonalds.setOrders(mcdOrder);

    // Publish the order to all driver
    deliveryRequest.publishNewOrder(mcDonalds);

    // Create another shop instance
    Shop chickfila = new Shop("Chickfila", "888 Boylston Ave");

    // Create the orders
    ArrayList<String> chickfilaOrder = new ArrayList<String>() {
      {
        add("Spicy Deluxe");
        add("Milkshake");
      }
    };
    chickfila.setOrders(chickfilaOrder);

    // Publish chickfila order to all driver
    deliveryRequest.publishNewOrder(chickfila);
  }
}
