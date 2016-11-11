package com.example.user.rosstechshop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/11/2016.
 */

public class ShopTest {

Shop shop;

    @Before

    public void before(){
        shop = new Shop("Glasgow", 500.00);
    }

    @Test
    public void testShopName(){
        assertEquals("Glasgow", shop.getName());
    }

    @Test
    public void testShopFunds(){
        assertEquals(500.00, shop.getFunds());
    }

    @Test
    public void testSetFunds(){
        shop.setFunds(600.00);
        assertEquals(600.00, shop.getFunds());
    }

    @Test
    public void testAddFunds(){
        shop.addFunds(100.00);
        assertEquals(600.00, shop.getFunds());
    }

    @Test
    public void testSubtractFunds(){
        shop.subtractFunds(100.00);
        assertEquals(400.00, shop.getFunds());
    }

    @Test
    public void testMakeSale(){
        shop.makeSale(50.00);
        assertEquals(550.00, shop.getFunds());
    }

    @Test
    public void testRefundSale(){
        shop.refundSale(30.00);
        assertEquals(470.00, shop.getFunds());
    }
}
