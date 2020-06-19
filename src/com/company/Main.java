package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList grocerylist = new GroceryList();


    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printInstructions();
	    while (!quit) {
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 0 :
                    printInstructions();
                    break;
                case 1 :
                    grocerylist.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3 :
                    modifyItem();
                    break;
                case 4 :
                    removeItem();
                    break;
                case 6 :
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("INSTRUCTIONS");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery");
        grocerylist.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number");
        int itemNo = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Enter new Item");
        String newItem = scanner.nextLine();
        grocerylist.modifyItem(itemNo-1, newItem);
    }

    public static void removeItem() {
        System.out.println("Remove Item");
        int itemNo = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        grocerylist.removeItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(grocerylist.findItem(searchItem)!=null){
            System.out.println("Found");
        }else {
            System.out.println("Not found ");
        }
    }
}
