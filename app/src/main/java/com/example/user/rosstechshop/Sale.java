package com.example.user.rosstechshop;

/**
 * Created by user on 12/11/2016.
 */

public class Sale {

//    private static int nextInvoiceNumber = 0;
    private Customer customer;
    private Shop shop;
    private CardType card;
    private Integer amount;
//    private int invoiceNumber = 0;


    public Sale(Customer customer, Shop shop, CardType card, int amount){
//        invoiceNumber = nextInvoiceNumber;
//        nextInvoiceNumber++;
        this.customer = customer;
        this.shop = shop;
        this.card = card;
        this.amount = amount;
        recordSale();

    }

    private void recordSale(){
        customer.makePurchase(card, amount);
        shop.makeSale(amount);
    }

//    public int getInvoiceNumber(){
//        return this.invoiceNumber;
//    }


}
