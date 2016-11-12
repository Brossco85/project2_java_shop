package com.example.user.rosstechshop;

/**
 * Created by user on 12/11/2016.
 */

public class Sale {

    private Customer customer;
    private Shop shop;
    private CardType card;
    private Integer amount;

    public Sale(Customer customer, Shop shop, CardType card, int amount){
        this.customer = customer;
        this.shop = shop;
        this.card = card;
        this.amount = amount;
        recordSale();

    }

    public void recordSale(){
        customer.makePurchase(card, amount);
        shop.makeSale(amount);
    }


}
