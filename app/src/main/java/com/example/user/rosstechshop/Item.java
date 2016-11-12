package com.example.user.rosstechshop;

/**
 * Created by user on 12/11/2016.
 */

public class Item {

    String name;
    String brand;
    double price;


    public Item(String name, String brand, double price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getBrand(){
        return this.brand;
    }

    public double getPrice(){
        return this.price;
    }
}
