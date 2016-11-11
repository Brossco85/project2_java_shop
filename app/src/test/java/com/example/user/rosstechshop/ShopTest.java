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
}
