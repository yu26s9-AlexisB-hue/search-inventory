package com.pluralsight.models;

import java.util.regex.Pattern;

public class Product {
    private int Id;
    private String Item;
    private double price;

    public Product(int id, String item, double price) {
        this.Id = id;
        this.Item = item;
        this.price = price;
    }

    //Splits apart each line and making sense of the information
    public Product(String line){
        String[] parts = line.split(Pattern.quote("|"));
        this.Id = Integer.parseInt(parts[0]);
        this.Item = parts[1];
        this.price = Double.parseDouble(parts[2]);

    }


    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
