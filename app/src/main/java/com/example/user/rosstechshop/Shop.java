package com.example.user.rosstechshop;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 11/11/2016.
 */

public class Shop {

    private String name;
    private double funds;
//    public ArrayList<Item>

    public Shop (String name, double funds) {
        this.name = name;
        this.funds = funds;
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

    public void subtractFunds( double funds){
        this.funds -= funds;
    }


}
