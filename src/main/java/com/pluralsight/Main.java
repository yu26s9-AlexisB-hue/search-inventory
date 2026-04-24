package com.pluralsight;
import com.pluralsight.models.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args){

        ArrayList<Product> inventory;
        inventory = getInventory();


        System.out.println("The current list: ");
        for(Product p : inventory){

            System.out.printf("id: %d %s - Price: $%.2f%n", p.getId(),p.getItem(),p.getPrice());
        }

    }

    private static ArrayList<Product> getInventory(){
            ArrayList<Product> result = new ArrayList<Product>();
            try{
                BufferedReader reader = new BufferedReader(new FileReader("Inventory/inventory.csv"));

                String line;
                //creating a loop that reads line by line
                while((line = reader.readLine()) != null){
                    Product p = new Product(line);
                    //Updates the information to the array list.
                    result.add(p);

                    //Me over complicating things
//                    for (int i = 0; i < line.length(); i++){
//                        result.add(new Product (p.getId(i)), p.setItem(p.getItem(i)), p.setPrice(p.getPrice(i))));
//                    }


                }


            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
            //how to get data into this inventory variable (a list of products)
//        result.add(new Product(12345,"Roller Blades", 57.43));
//        result.add(new Product(23456, "Skateboard", 42.99));
//        result.add(new Product(34567, "Helmet", 29.95));
//        result.add(new Product(45678, "Knee Pads", 18.50));
//        result.add(new Product(56789, "Wrist Guards", 15.75));



    return result;
    }

}
