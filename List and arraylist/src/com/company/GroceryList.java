package com.company;

import java.util.ArrayList; //-Cover in later parts.
public class GroceryList{

    private ArrayList<String> groceryList = new ArrayList<String>(); //Rem.
                                            //-Field declare.
                                            //-Object declare.
                                            //-Refer List and arraylist word document in self materials for more.
                                            //-ArrayList is the class so in new ArrayList<String>(), () is empty constructor.

    public void addGroceryItem(String item){ //-Instance method.
        groceryList.add(item); //-To add elements to the arraylist, we use add() method like this.
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++){
        System.out.println((i+1) + ". " + groceryList.get(i));
        }
    //-To find out how many elements an arraylist have, we use the size method {groceryList.size()}.
    //-To access an element in the arraylist, we use the get() method {groceryList.get(i))}.
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    //-To modify an element, we use the set() method {groceryList.set(position, newItem)}.
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    //-To remove an element, we use the remove() method {groceryList.remove(position)}.
    }

    public String findItem(String searchItem){
    //boolean exists = groceryList.contains(searchItem);
        int position  = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        else{
            return null;
        }
    //-To check whether the arraylist contain particular element, we use contains() method {groceryList.contains(searchItem)}.
    //-To check the position of any element in arraylist, we use indexOf() method {groceryList.indexOf(searchItem)}.
    }

}
