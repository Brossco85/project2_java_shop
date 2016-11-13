package com.example.user.rosstechshop;

/**
 * Created by user on 13/11/2016.
 */

public class Refund {

    private Customer customer;
    private Shop shop;
    private CardType card;
    private Item item;

    public Refund(Sale sale) {
//
        this.customer = sale.getCustomer();
        this.shop = sale.getShop();
        this.card = sale.getCard();
        this.item = sale.getItem();
        recordRefund();

    }

        private void recordRefund(){
            customer.acceptRefund(card, item.getPrice());
            shop.refundSale(item.getPrice());
        }
}
