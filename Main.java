import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

       boolean quit = false;
       int choice = 0;
       printInstructions();

       while (!quit){
           System.out.println("Enter your choice: ");
           choice = scanner.nextInt();
           scanner.nextLine();

           switch (choice){
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
        System.out.println("\n0 - To print choice options.");
        System.out.println("\n1 - To print list of grocery items.");
        System.out.println("\n2 - To add an item to the list.");
        System.out.println("\n3 - To modify an item to the list.");
        System.out.println("\n4 - To remove an item from the list.");
        System.out.println("\n5 - To search for an item in the list.");
        System.out.println("\n6 - To quit the applications.");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGrocery(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Current item name: ");
        String currentItem = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item name: ");
        String item = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        }
        else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        //ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());


    }
}
