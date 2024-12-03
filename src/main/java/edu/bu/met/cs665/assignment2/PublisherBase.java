/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/12/2024
 * File Name: PublisherBase.java
 * Description: Interface for publisher
 */

package edu.bu.met.cs665.assignment2;

public interface PublisherBase {

  void subscribe(SubscriberBase o);

  void unsubscribe(SubscriberBase o);

  void publishNewOrder(Shop shop);

}
