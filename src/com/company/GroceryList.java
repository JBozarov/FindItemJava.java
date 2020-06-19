package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groseryList = new ArrayList<String>();

    // Adding
    public void addGroceryItem(String item){
        groseryList.add(item);
    }

    // Getting each value
    public void printGroceryList(){
        System.out.println("YOU HAVE " + groseryList.size());
        for ( int i = 0; i<groseryList.size(); i++ ) {
            System.out.println(groseryList.get(i));
        }
    }

    // Modifying each value
    public void modifyItem(int position, String newItem) {
        groseryList.set(position, newItem);
        System.out.println(groseryList.get(position));
    }


    // Remove Item
    public void removeItem (int position) {
        String theItem = groseryList.get(position);
        groseryList.remove(position);
    }

    // Check if exists // returns true or false
    public String findItem(String item) {
        boolean exists = groseryList.contains(item);
        int postion = groseryList.indexOf(item);
        if (postion>=0) {
            return groseryList.get(postion);
        }
        return null;
    }

}
