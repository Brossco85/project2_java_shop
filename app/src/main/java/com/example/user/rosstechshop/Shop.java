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
    public ArrayList<Item> stock = new ArrayList<Item>();

    public Shop (String name) {
        this.name = name;
        stockSetup();
    }


    private void stockSetup(){
        Item item1= new Item("Apple", "Macbook", 100);
        stock.add(item1);
        Item item2= new Item("Apple", "Iphone", 200);
        stock.add(item2);
        Item item3= new Item("Samsung", "Galaxy", 150);
        stock.add(item3);
        Item item4= new Item("Apple", "Macbook", 100);
        stock.add(item4);

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

    public ArrayList<Item> getStock(){
        return this.stock;
    }


}
