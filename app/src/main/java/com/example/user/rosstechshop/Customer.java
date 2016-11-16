package com.example.user.rosstechshop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 11/11/2016.
 */

public class Customer implements Serializable {

//    used for demo purposes, information would be pulled from database
    static ArrayList<String> allCustomers = new ArrayList<>();
    private String name;
    private int funds;
    HashMap<CardType, Integer> paymentOptions;

    public Customer(String name){
        this.name = name;
        this.paymentOptions = new HashMap<>();
        addToAllCustomers();
    }


    public ArrayList<String> getPaymentOptionString(){
        ArrayList<String> paymentString = new ArrayList<>();
        for (CardType card : paymentOptions.keySet()){
            Integer value = paymentOptions.get(card);
            String string = card.toString() + "                                         " + value.toString();
            paymentString.add(string);
        }
        return paymentString;
    }

    private void addToAllCustomers(){
        allCustomers.add(name);
    }
    public String getName(){
        return this.name;
    }

    public void addPaymentCard(CardType card, int fundsAvailable){
        paymentOptions.put(card, fundsAvailable);
        System.out.println(card.toString());
    }

    public boolean checkFundsAvailable(CardType card, Item item) {
       boolean available = false;
        for (CardType paymentCard : paymentOptions.keySet()){
            if (paymentCard == card && paymentOptions.get(paymentCard) > item.getPrice()){
                available = true;
            }
        }
        return available;
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

    public void acceptRefund(CardType card, Integer purchase){
        refundPaymentToCard(card, purchase);
    }


}
