package com.pluralsight;
import java.util.ArrayList;
import com.pluralsight.Product;


public class Main {
    public static void main(String[] args){
        ArrayList<Product> inventory = getInventory();

        System.out.println("The current list: ");
        for(int i = 0; i < inventory.size(); i++){
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n", p.getId(),p.getItem(),p.getPrice());
        }





    }

    private static ArrayList<Product> getInventory(){
            ArrayList<Product> inventory = new ArrayList<Product>();
            //how to get data into this inventory variable (a list of products)
        inventory.add(new Product(12345,"Roller Blades", 57.43));
        inventory.add(new Product(23456, "Skateboard", 42.99));
        inventory.add(new Product(34567, "Helmet", 29.95));
        inventory.add(new Product(45678, "Knee Pads", 18.50));
        inventory.add(new Product(56789, "Wrist Guards", 15.75));



    return inventory;
    }

}
