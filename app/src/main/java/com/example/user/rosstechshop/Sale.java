package com.example.user.rosstechshop;

/**
 * Created by user on 12/11/2016.
 */

public class Sale {

    private static int nextInvoiceNumber = 0;
    private int invoiceNumber = 0;
    private Customer customer;
    private Shop shop;
    private CardType card;
    private Item item;




    public Sale(Customer customer, Shop shop, CardType card, Item item){
        nextInvoiceNumber++;
        this.invoiceNumber = nextInvoiceNumber;
        this.customer = customer;
        this.shop = shop;
        this.card = card;
        this.item = item;



        recordSale();

    }

    private void recordSale(){
        customer.makePurchase(card, item.getPrice());
        shop.makeSale(item);
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public Shop getShop(){
        return this.shop;
    }

    public CardType getCard(){
        return this.card;
    }

    public Item getItem(){
        return this.item;
    }

    public int getInvoiceNumber(){
        return this.invoiceNumber;
    }


}
