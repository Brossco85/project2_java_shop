package com.example.user.rosstechshop;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 11/11/2016.
 */

public class Shop {

    private String name;
    private double sales;
    private double refunds;
//    public ArrayList<Item>

    public Shop (String name) {
        this.name = name;
        this.sales = sales;
    }

    public String getName(){
        return this.name;
    }

    public double getSales(){
        return this.sales;
    }

//    public void setFunds(double funds){
//        this.sales = funds;
//    }

    public void addSales(double sales){
        this.sales += sales;
    }

    public void addRefunds( double funds){
        this.refunds -= funds;
    }

    public void makeSale(double saleValue){
        addSales(saleValue);
    }

    public double getRefunds(){
       return this.refunds;
    }

    public void refundSale(double refundValue){
        addRefunds(refundValue);
    }

    public double getTotalIncome(){
        return sales + refunds;
    }


}
