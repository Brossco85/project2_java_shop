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
        shop = new Shop("Glasgow");
    }

    @Test
    public void testShopName(){
        assertEquals("Glasgow", shop.getName());
    }

    @Test
    public void testAddSales(){
        shop.addSales(100.00);
        assertEquals(100.00, shop.getSales());
    }

    @Test
    public void testAddRefunds(){
        shop.addRefunds(100.00);
        assertEquals(-100.00, shop.getRefunds());
    }

    @Test
    public void testMakeSale(){
        shop.makeSale(50.00);
        assertEquals(50.00, shop.getSales());
    }

    @Test
    public void testRefundSale(){
        shop.refundSale(30.00);
        assertEquals(-30.00, shop.getRefunds());
    }

    @Test
    public void testTotalIncome(){
        shop.makeSale(50.00);
        shop.refundSale(30.00);
        assertEquals(20.00, shop.getTotalIncome());
    }

    @Test
    public void testStockSetup(){
        assertEquals(4, shop.getStock().size());
    }
}
