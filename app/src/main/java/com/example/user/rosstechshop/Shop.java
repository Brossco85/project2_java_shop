package com.example.user.rosstechshop;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by user on 11/11/2016.
 */

public class Shop implements Serializable {

    static ArrayList<String> allShops = new ArrayList<>();
    private String name;
    private double sales;
    private double refunds;
    public ArrayList<Item> inventory = new ArrayList<>();
    public ArrayList<Item> soldStock = new ArrayList<>();

    public Shop (String name) {
        this.name = name;
        addToAllShops();
    }

//    if time make this more dynamic using columns
    private void addToAllShops(){
        String shopname = name + "                                         " + sales;
        allShops.add(shopname);
    }


    public String getName(){
        return this.name;
    }

    public double getSales(){
        return this.sales;
    }


    public void addSales(double sales){
        this.sales += sales;
    }

    public void addRefunds( double funds){
        this.refunds -= funds;
    }
    public void makeSale(Item item){
        addSales(item.getPrice());
        sellStock(item);
    }

    public double getRefunds(){
       return this.refunds;
    }

    public void refundSale(Item item){
        addRefunds(item.getPrice());
        refundStock(item);
    }

    public double getTotalIncome(){
        return sales + refunds;
    }

    public ArrayList<Item> getInventory(){
        return this.inventory;
    }

    public void addStock(Item item){
        inventory.add(item);
    }

    public void sellStock(Item item){
    for (Iterator<Item> itr = inventory.iterator(); itr.hasNext();){
        Item stock = itr.next();
        if (stock == item){
            soldStock.add(stock);
            itr.remove();
        }
    }
    }

    public ArrayList<Item> getSoldStock(){
        return this.soldStock;
    }

    public void refundStock(Item item){
        for (Iterator<Item> itr = soldStock.iterator(); itr.hasNext();){
            Item stock = itr.next();
            if (stock == item){
                inventory.add(stock);
                itr.remove();
            }
        }
    }


}
