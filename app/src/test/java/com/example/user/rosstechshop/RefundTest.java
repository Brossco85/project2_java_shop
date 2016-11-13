package com.example.user.rosstechshop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class RefundTest {

    Customer customer1;
    Shop shop1;
    Sale sale1;
    Sale sale2;
    Item item1;
    Item item2;


    @Before
    public void before(){
        customer1 = new Customer("Joanne");
        customer1.addPaymentCard(CardType.BARCLAYCARD, 500);
        item1 = new Item("Apple","Macbook", 100);
        item2 = new Item("Apple","Iphone", 180);

        shop1 = new Shop("Glasgow");
        sale1 = new Sale(customer1, shop1, CardType.BARCLAYCARD, item1);
        sale2 = new Sale(customer1, shop1, CardType.BARCLAYCARD, item2);
    }

    @Test
    public void testRefund(){
        Refund refund1 = new Refund(sale1);
        assertEquals(320, customer1.getCardBalance(CardType.BARCLAYCARD));
        assertEquals(280.00, shop1.getSales());
        assertEquals(-100.00, shop1.getRefunds());
    }
}
