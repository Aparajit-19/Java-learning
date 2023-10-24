package com.company;
import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList(); //-Static object declared.

    public static void main(String[] args){ //-Jo main method ke andar hota hai woh run hota hai.
        boolean quit = false;
        int choice = 0;
        printInstructions(); //-calling this method.
        while(!quit){ //-(!quit): It means quit is not true.
                      //-(quit): It means quit is true.
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
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress "); //-(\n): It means it insert a newline in the text at this point.
        System.out.println("\t 0 - To print choice options."); //-(\t): It means it insert a tab in the text at this point.
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
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in  our grocery list");
        }else{
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

}

//IMPORTANT-
//-If we create 2 classes in which one created in com.company package {on left side} and one created in other package then in
// this case just drag one class {on left side} to the other class package so that both class we create be in same package
// otherwise error occurs if both classes are in diff. packages.
