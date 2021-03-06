package com.example.user.rosstechshop;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 12/11/2016.
 */

public class SaleTest {


    Customer customer1;
    Shop shop1;
    Sale sale1;
    Sale sale2;
    Item item1;
    Item item2;
    Item item3;


    @Before
    public void before(){
        customer1 = new Customer("Joanne");
        customer1.addPaymentCard(CardType.BARCLAYCARD, 500);
        item1 = new Item("Apple","Macbook", 100);
        item2 = new Item("Apple","Iphone", 180);
        item3 = new Item("Apple","Iphone", 180);

        shop1 = new Shop("Glasgow");
        shop1.addStock(item1);
        shop1.addStock(item2);
        shop1.addStock(item3);
        sale1 = new Sale(customer1, shop1, CardType.BARCLAYCARD, item1);
        sale2 = new Sale(customer1, shop1, CardType.BARCLAYCARD, item2);
    }

    @Test
    public void testSale(){
        assertEquals(220, customer1.getCardBalance(CardType.BARCLAYCARD));
        assertEquals(280.00, shop1.getSales());
    }

}
