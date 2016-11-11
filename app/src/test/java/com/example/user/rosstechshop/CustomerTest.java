package com.example.user.rosstechshop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/11/2016.
 */

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Joanne");
    }

    @Test
    public void testGetName(){
        assertEquals("Joanne", customer.getName());
    }

}
