package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import edu.bu.met.cs665.assignment2.Shop;

import java.util.ArrayList;

public class TestShop {

    public TestShop() {}

    @Test
    public void testShopName() {

        Shop shop = new Shop("mcd","1010 Comm Ave");
        assertEquals("mcd", shop.getName());

    }

    @Test
    public void testShopAddress() {

        Shop shop = new Shop("mcd","1010 Comm Ave");
        assertEquals("1010 Comm Ave", shop.getAddress());

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
        // Test the first order
        assertEquals("Big Mac", shop.getOrders().get(0));
    }

}
