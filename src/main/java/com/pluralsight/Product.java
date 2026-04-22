package com.pluralsight;

public class Product {
    private int Id;
    private String Item;
    private double price;

    public Product(int id, String item, double price) {
        this.Id = id;
        this.Item = item;
        this.price = price;
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
