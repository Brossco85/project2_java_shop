package com.example.user.rosstechshop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by user on 11/11/2016.
 */

public class Shop {

    private String name;
    private double sales;
    private double refunds;
    public ArrayList<Item> inventory = new ArrayList<Item>();
    public ArrayList<Item> soldStock = new ArrayList<Item>();

    public Shop (String name) {
        this.name = name;
//        inventorySetup();
    }

//    Should this be done?
//    private void inventorySetup(){
//        Item item1= new Item("Apple", "Macbook", 100);
//        inventory.add(item1);
//        Item item2= new Item("Apple", "Iphone", 200);
//        inventory.add(item2);
//        Item item3= new Item("Samsung", "Galaxy", 150);
//        inventory.add(item3);
//        Item item4= new Item("Apple", "Macbook", 100);
//        inventory.add(item4);
//
//    }

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

//    ask instructor about Iterator and also about references.
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
