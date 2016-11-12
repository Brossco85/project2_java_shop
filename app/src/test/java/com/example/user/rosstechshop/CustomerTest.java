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
        customer.addPaymentCard(CardType.BARCLAYCARD, 600);
        customer.addPaymentCard(CardType.MASTERCARD, 400);
    }

    @Test
    public void testGetName(){
        assertEquals("Joanne", customer.getName());
    }

    @Test
    public void testAddPaymentCard(){
//        customer.addPaymentCard(CardType.BARCLAYCARD, 600);
//        customer.addPaymentCard(CardType.MASTERCARD, 400);
        assertEquals(1000, customer.getTotalFundsAvailable());
    }

    @Test
    public void testGetCardBalance(){
        assertEquals(600, customer.getCardBalance(CardType.BARCLAYCARD));

    }

    @Test
    public void testMakePaymentFromCard(){
//        customer.addPaymentCard(CardType.BARCLAYCARD, 600);
        customer.makePaymentFromCard(CardType.BARCLAYCARD, 100);
        assertEquals(500, customer.getCardBalance(CardType.BARCLAYCARD));
    }

    @Test
    public void testRefundPaymentToCard(){
//        customer.addPaymentCard(CardType.BARCLAYCARD, 600);
        customer.refundPaymentToCard(CardType.MASTERCARD, 100);
        assertEquals(500, customer.getCardBalance(CardType.MASTERCARD));
    }


}
