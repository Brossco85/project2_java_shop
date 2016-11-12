package com.example.user.rosstechshop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class SaleTest {

    Sale sale1;
    Customer customer1;
    Shop shop1;


    @Before
    public void before(){
        customer1 = new Customer("Joanne");
        customer1.addPaymentCard(CardType.BARCLAYCARD, 500);
        shop1 = new Shop("Glasgow");
        sale1 = new Sale(customer1, shop1, CardType.BARCLAYCARD, 50);
    }

    @Test
    public void testSale(){
        assertEquals(450, customer1.getCardBalance(CardType.BARCLAYCARD));
        assertEquals(50.00, shop1.getSales());
    }
}
