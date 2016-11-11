package com.example.user.rosstechshop;

import java.util.HashMap;

/**
 * Created by user on 11/11/2016.
 */

public class Customer {

    private String name;
    private double funds;
    HashMap<CardType, Integer> paymentOptions;

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public double getFunds(){
        return this.funds;
    }

    public void setFunds(double funds){
        this.funds = funds;
    }

    public void addFunds(double funds){
        this.funds += funds;
    }
}
