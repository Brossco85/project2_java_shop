package com.example.user.rosstechshop;

/**
 * Created by user on 12/11/2016.
 */

public class Item {

    private static int nextItemNumber = 0;
    private int itemNumber = 0;
    String name;
    String brand;
    int price;


    public Item(String brand, String name , int price){
        nextItemNumber++;
        this.itemNumber = nextItemNumber;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getPrice(){
        return this.price;
    }

    public int getItemNumber(){
        return this.itemNumber;
    }
}
