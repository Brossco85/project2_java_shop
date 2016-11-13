package com.example.user.rosstechshop;

/**
 * Created by user on 12/11/2016.
 */

public class Item {

    String name;
    String brand;
    int price;


    public Item(String brand, String name , int price){
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

}
