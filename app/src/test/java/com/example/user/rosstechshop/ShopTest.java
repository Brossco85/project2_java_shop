package com.example.user.rosstechshop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/11/2016.
 */

public class ShopTest {

    Shop shop;
    Item item1;
    Item item2;
    Item item3;
    Item item4;

    @Before

    public void before(){
        shop = new Shop("Glasgow");
        item1= new Item("Apple", "Macbook", 100);
        shop.addStock(item1);
        item2= new Item("Apple", "Macbook", 100);
        shop.addStock(item2);
        item3= new Item("Apple", "Iphone", 200);
        shop.addStock(item3);
        item4= new Item("Microsoft", "Surface", 200);
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
    public void testCheckStock(){
        assertEquals(true, shop.checkStock(item1));
        assertEquals(false, shop.checkStock(item4));
    }

    @Test
    public void testMakeSale(){
        shop.makeSale(item1);
        assertEquals(100.00, shop.getSales());
    }

    @Test
    public void testRefundSale(){
        shop.refundSale(item1);
        assertEquals(-100.00, shop.getRefunds());
    }

    @Test
    public void testTotalIncome(){
        shop.makeSale(item1);
        assertEquals(100.00, shop.getTotalIncome());
    }


    @Test
    public void testSellStock(){
        shop.makeSale(item1);
        assertEquals(2, shop.getInventory().size());
        assertEquals(1, shop.getSoldStock().size());
        assertEquals(100.00, shop.getSales());
    }

    @Test
    public void testRefundStock(){
        shop.makeSale(item1);
        shop.makeSale(item2);
        shop.makeSale(item3);
        shop.refundSale(item1);
        assertEquals(1, shop.getInventory().size());
        assertEquals(2, shop.getSoldStock().size());
        assertEquals(-100.00, shop.getRefunds());
    }
}
