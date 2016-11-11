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

    public int getFunds(){
        Integer sum = 0;
        for (Integer fundsAvailable : paymentOptions.values()) {
            sum += fundsAvailable;
            funds += sum;
        }
        return this.funds;
    }

    public void addPaymentCard(CardType card, int fundsAvailable){
        paymentOptions.put(card, fundsAvailable);
    }

//    public void addFunds(double funds){
//        this.funds += funds;
//    }
}
