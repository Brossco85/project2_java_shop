package com.example.user.rosstechshop;

import java.util.HashMap;

/**
 * Created by user on 11/11/2016.
 */

public class Customer {

    private String name;
    private int funds;
    HashMap<CardType, Integer> paymentOptions;

    public Customer(String name){
        this.name = name;
        this.paymentOptions = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }

    public void addPaymentCard(CardType card, int fundsAvailable){
        paymentOptions.put(card, fundsAvailable);
    }

//    check if card exists if not add card to paymentOptions ArrayList

    public void makePaymentFromCard(CardType card, Integer amount ){
        paymentOptions.put(card, paymentOptions.get(card) - amount);
    }

    public void refundPaymentToCard(CardType card, Integer amount ){
        paymentOptions.put(card, paymentOptions.get(card) + amount);
    }

    public int getTotalFundsAvailable(){
        Integer sum = 0;
        for (Integer fundsAvailable : paymentOptions.values()) {
            sum += fundsAvailable;
            funds = sum;
        }
        return this.funds;
    }

    public int getCardBalance(CardType card){
        return paymentOptions.get(card);
    }

    public void makePurchase(CardType card, Integer purchase){
        makePaymentFromCard(card, purchase);
    }


}
