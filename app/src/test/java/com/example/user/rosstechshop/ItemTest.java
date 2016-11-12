package com.example.user.rosstechshop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item("Apple","Macbook", 100);
    }

    @Test
    public void testGetName(){
        assertEquals("Macbook", item.getName());
    }

    @Test
    public void testGetBrand(){
        assertEquals("Apple", item.getBrand());
    }

    @Test
    public void testGetPrice(){
        assertEquals(100.00, item.getPrice());
    }


}
