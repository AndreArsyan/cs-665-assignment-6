package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment2.DeliveryRequest;
import edu.bu.met.cs665.assignment2.Shop;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import edu.bu.met.cs665.assignment2.Driver;

import java.util.ArrayList;

public class TestDriver {

    public TestDriver() {}

    @Test
    public void testDriverName() {

        Driver driver = new Driver("Grubhub",new DeliveryRequest());
        assertEquals("Grubhub", driver.getName());

    }

    @Test
    public void testOrder() {
        Shop shop = new Shop("mcd","1010 Comm Ave");
        // Create the orders
        ArrayList<String> mcdOrder = new ArrayList<String>() {
            {
                add("Big Mac");
                add("Chicken Sandwich");
                add("French Fries");
            }
        };
        shop.setOrders(mcdOrder);

        Driver driver = new Driver("Grubhub",new DeliveryRequest());
        driver.addOrder(shop);

        // Get first order of this driver
        assertEquals("Big Mac", driver.getOrder().get(0));


    }


}
