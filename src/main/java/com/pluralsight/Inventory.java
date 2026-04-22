package com.pluralsight;

public class Inventory {
    private int Id;
    private String Item;
    private double price;

    public Inventory(int id, String item, double price) {
        Id = id;
        Item = item;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
