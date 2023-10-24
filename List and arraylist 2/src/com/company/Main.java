package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem);
        }else{
            System.out.println(searchItem + ", not on file.");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>(); //-Arraylist declared.
        newArray.addAll(groceryList.getGroceryList()); //-Yaha par kya ho raha hai na ki jo object hai groceryList uske hum getGroceryList()
        //method ko call kar rahe hai abb isse kya ho raha hai na ki groceryList object ka jo arraylist hai groceryList woh complete return ho
        //raha hai isee jo ki mein addAll() method ki help se new arraylist jo hai newArr usme add kar raha hu.

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList()); //-Line 87 and 88 ko hatakar yeh bhi likh sakte hai.

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray); //-Yaha par kya ho raha hai na ki jo object hai groceryList uske hum getGroceryList()
        //method ko call kar rahe hai abb isse kya ho raha hai na ki groceryList object ka jo arraylist hai groceryList woh complete return ho
        //raha hai isee jo ki mein toArray() method ki help se array me convert karke, myArr me stored kar raha hu.
        //-toArray() {ArrayList}: The toArray() method of ArrayList is used to return an array containing all the elements in ArrayList in the correct
        // order.It takes an array (T[] a) as parameter which is the array into which the elements of the list are to be stored,
    }

}

