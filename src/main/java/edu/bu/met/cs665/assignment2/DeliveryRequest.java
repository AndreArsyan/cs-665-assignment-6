/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/12/2024
 * File Name: DeliveryRequest.java
 * Description: Class for the Delivery Request
 */

package edu.bu.met.cs665.assignment2;
import java.util.ArrayList;

/**
 * This is the DeliveryRequest class.
 * This class is responsible for representing a Delivery Request.
 */
public class DeliveryRequest implements PublisherBase {

    // List of drivers subscribed to this publisher
    private ArrayList<SubscriberBase> driver = new ArrayList<SubscriberBase>();

    /*
     *  Constructor for Delivery Request
     */
    public DeliveryRequest() {
    }

    /*
     *  Add subscriber to the Arraylist of subscribers
     */
    public void subscribe(SubscriberBase o) {
        driver.add(o);
    }

    /*
     * Remove subscriber to the Arraylist of subscribers
     */
    public void unsubscribe(SubscriberBase o) {
        driver.remove(o);
    }


    /**
     * Publish the order to all subscriber
     *
     * @param shop shop and order details
     */
    public void publishNewOrder(Shop shop) {
        for (SubscriberBase o : driver) {
            o.addOrder(shop);
        }
    }


}
